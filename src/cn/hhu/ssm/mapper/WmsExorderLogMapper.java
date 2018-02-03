package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExorderLog;
import cn.hhu.ssm.po.WmsExorderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExorderLogMapper {
    int countByExample(WmsExorderLogExample example);

    int deleteByExample(WmsExorderLogExample example);

    int deleteByPrimaryKey(Integer exorderLogid);

    int insert(WmsExorderLog record);

    int insertSelective(WmsExorderLog record);

    List<WmsExorderLog> selectByExample(WmsExorderLogExample example);

    WmsExorderLog selectByPrimaryKey(Integer exorderLogid);

    int updateByExampleSelective(@Param("record") WmsExorderLog record, @Param("example") WmsExorderLogExample example);

    int updateByExample(@Param("record") WmsExorderLog record, @Param("example") WmsExorderLogExample example);

    int updateByPrimaryKeySelective(WmsExorderLog record);

    int updateByPrimaryKey(WmsExorderLog record);
}