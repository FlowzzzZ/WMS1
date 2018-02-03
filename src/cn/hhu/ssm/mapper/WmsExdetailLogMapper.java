package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExdetailLog;
import cn.hhu.ssm.po.WmsExdetailLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExdetailLogMapper {
    int countByExample(WmsExdetailLogExample example);

    int deleteByExample(WmsExdetailLogExample example);

    int deleteByPrimaryKey(Integer exdetailLogid);

    int insert(WmsExdetailLog record);

    int insertSelective(WmsExdetailLog record);

    List<WmsExdetailLog> selectByExample(WmsExdetailLogExample example);

    WmsExdetailLog selectByPrimaryKey(Integer exdetailLogid);

    int updateByExampleSelective(@Param("record") WmsExdetailLog record, @Param("example") WmsExdetailLogExample example);

    int updateByExample(@Param("record") WmsExdetailLog record, @Param("example") WmsExdetailLogExample example);

    int updateByPrimaryKeySelective(WmsExdetailLog record);

    int updateByPrimaryKey(WmsExdetailLog record);
}