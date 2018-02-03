package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImorderLog;
import cn.hhu.ssm.po.WmsImorderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImorderLogMapper {
    int countByExample(WmsImorderLogExample example);

    int deleteByExample(WmsImorderLogExample example);

    int deleteByPrimaryKey(Integer imorderLogid);

    int insert(WmsImorderLog record);

    int insertSelective(WmsImorderLog record);

    List<WmsImorderLog> selectByExample(WmsImorderLogExample example);

    WmsImorderLog selectByPrimaryKey(Integer imorderLogid);

    int updateByExampleSelective(@Param("record") WmsImorderLog record, @Param("example") WmsImorderLogExample example);

    int updateByExample(@Param("record") WmsImorderLog record, @Param("example") WmsImorderLogExample example);

    int updateByPrimaryKeySelective(WmsImorderLog record);

    int updateByPrimaryKey(WmsImorderLog record);
}