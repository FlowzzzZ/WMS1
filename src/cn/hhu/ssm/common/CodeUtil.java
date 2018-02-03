package cn.hhu.ssm.common;

import org.apache.log4j.Logger;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 用于生成编码为日期+四位的编号
 */
public class CodeUtil {
    private static int width=4;  //位数
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    private static DecimalFormat df = null;
    private static final Logger log=Logger.getLogger(CodeUtil.class);

    public static synchronized String getNumber() {
        String result = null;
        try {
            File file=new File("SNumber.dat");

            char[] chs = new char[width];
            for (int i = 0; i < width; i++) {
                chs[i] = '0';
            }
            df = new DecimalFormat(new String(chs));

            Date current = new Date();
            String date = sdf.format(current);
            int num = 1;
            if (file.exists()) {
                List< String > list = FileUtil.readList(file);
                String[] data = list.get(0).split(",");
                if (date.equals(data[0])) {
                    num = Integer.parseInt(data[1]);
                }
            }
            FileUtil.rewrite(file, date + "," + (num + 1));
            result = sdf.format(current) + df.format(num);
        } catch (Exception e) {
            log.error("生成id有误");
            e.printStackTrace();
        }
        return result;
    }

}
