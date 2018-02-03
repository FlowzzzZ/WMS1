package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseFactoryLog;
import cn.hhu.ssm.po.WmsBaseFactoryLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseFactoryLogMapper {
    int countByExample(WmsBaseFactoryLogExample example);

    int deleteByExample(WmsBaseFactoryLogExample example);

    int deleteByPrimaryKey(Integer factoryLogid);

    int insert(WmsBaseFactoryLog record);

    int insertSelective(WmsBaseFactoryLog record);

    List<WmsBaseFactoryLog> selectByExample(WmsBaseFactoryLogExample example);

    WmsBaseFactoryLog selectByPrimaryKey(Integer factoryLogid);

    int updateByExampleSelective(@Param("record") WmsBaseFactoryLog record, @Param("example") WmsBaseFactoryLogExample example);

    int updateByExample(@Param("record") WmsBaseFactoryLog record, @Param("example") WmsBaseFactoryLogExample example);

    int updateByPrimaryKeySelective(WmsBaseFactoryLog record);

    int updateByPrimaryKey(WmsBaseFactoryLog record);
}