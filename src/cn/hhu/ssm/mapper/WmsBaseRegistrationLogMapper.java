package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseRegistrationLog;
import cn.hhu.ssm.po.WmsBaseRegistrationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseRegistrationLogMapper {
    int countByExample(WmsBaseRegistrationLogExample example);

    int deleteByExample(WmsBaseRegistrationLogExample example);

    int deleteByPrimaryKey(Integer registrationLogid);

    int insert(WmsBaseRegistrationLog record);

    int insertSelective(WmsBaseRegistrationLog record);

    List<WmsBaseRegistrationLog> selectByExample(WmsBaseRegistrationLogExample example);

    WmsBaseRegistrationLog selectByPrimaryKey(Integer registrationLogid);

    int updateByExampleSelective(@Param("record") WmsBaseRegistrationLog record, @Param("example") WmsBaseRegistrationLogExample example);

    int updateByExample(@Param("record") WmsBaseRegistrationLog record, @Param("example") WmsBaseRegistrationLogExample example);

    int updateByPrimaryKeySelective(WmsBaseRegistrationLog record);

    int updateByPrimaryKey(WmsBaseRegistrationLog record);
}