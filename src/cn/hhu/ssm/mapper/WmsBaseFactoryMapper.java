package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseFactory;
import cn.hhu.ssm.po.WmsBaseFactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseFactoryMapper {
    int countByExample(WmsBaseFactoryExample example);

    int deleteByExample(WmsBaseFactoryExample example);

    int deleteByPrimaryKey(Integer factoryId);

    int insert(WmsBaseFactory record);

    int insertSelective(WmsBaseFactory record);

    List<WmsBaseFactory> selectByExample(WmsBaseFactoryExample example);

    WmsBaseFactory selectByPrimaryKey(Integer factoryId);

    int updateByExampleSelective(@Param("record") WmsBaseFactory record, @Param("example") WmsBaseFactoryExample example);

    int updateByExample(@Param("record") WmsBaseFactory record, @Param("example") WmsBaseFactoryExample example);

    int updateByPrimaryKeySelective(WmsBaseFactory record);

    int updateByPrimaryKey(WmsBaseFactory record);
}