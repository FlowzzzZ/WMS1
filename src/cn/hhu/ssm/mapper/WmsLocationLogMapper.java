package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsLocationLog;
import cn.hhu.ssm.po.WmsLocationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsLocationLogMapper {
    int countByExample(WmsLocationLogExample example);

    int deleteByExample(WmsLocationLogExample example);

    int deleteByPrimaryKey(Integer locationsLogid);

    int insert(WmsLocationLog record);

    int insertSelective(WmsLocationLog record);

    List<WmsLocationLog> selectByExample(WmsLocationLogExample example);

    WmsLocationLog selectByPrimaryKey(Integer locationsLogid);

    int updateByExampleSelective(@Param("record") WmsLocationLog record, @Param("example") WmsLocationLogExample example);

    int updateByExample(@Param("record") WmsLocationLog record, @Param("example") WmsLocationLogExample example);

    int updateByPrimaryKeySelective(WmsLocationLog record);

    int updateByPrimaryKey(WmsLocationLog record);
}