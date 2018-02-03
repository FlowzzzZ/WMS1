package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseUserLog;
import cn.hhu.ssm.po.WmsBaseUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseUserLogMapper {
    int countByExample(WmsBaseUserLogExample example);

    int deleteByExample(WmsBaseUserLogExample example);

    int deleteByPrimaryKey(Integer userLogid);

    int insert(WmsBaseUserLog record);

    int insertSelective(WmsBaseUserLog record);

    List<WmsBaseUserLog> selectByExample(WmsBaseUserLogExample example);

    WmsBaseUserLog selectByPrimaryKey(Integer userLogid);

    int updateByExampleSelective(@Param("record") WmsBaseUserLog record, @Param("example") WmsBaseUserLogExample example);

    int updateByExample(@Param("record") WmsBaseUserLog record, @Param("example") WmsBaseUserLogExample example);

    int updateByPrimaryKeySelective(WmsBaseUserLog record);

    int updateByPrimaryKey(WmsBaseUserLog record);
}