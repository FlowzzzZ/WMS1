package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseRegistration;
import cn.hhu.ssm.po.WmsBaseRegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseRegistrationMapper {
    int countByExample(WmsBaseRegistrationExample example);

    int deleteByExample(WmsBaseRegistrationExample example);

    int deleteByPrimaryKey(Integer registrationId);

    int insert(WmsBaseRegistration record);

    int insertSelective(WmsBaseRegistration record);

    List<WmsBaseRegistration> selectByExample(WmsBaseRegistrationExample example);

    WmsBaseRegistration selectByPrimaryKey(Integer registrationId);

    int updateByExampleSelective(@Param("record") WmsBaseRegistration record, @Param("example") WmsBaseRegistrationExample example);

    int updateByExample(@Param("record") WmsBaseRegistration record, @Param("example") WmsBaseRegistrationExample example);

    int updateByPrimaryKeySelective(WmsBaseRegistration record);

    int updateByPrimaryKey(WmsBaseRegistration record);
}