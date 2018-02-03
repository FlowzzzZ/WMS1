package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsSerialnumberLog;
import cn.hhu.ssm.po.WmsSerialnumberLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsSerialnumberLogMapper {
    int countByExample(WmsSerialnumberLogExample example);

    int deleteByExample(WmsSerialnumberLogExample example);

    int deleteByPrimaryKey(Integer serialnumberLogid);

    int insert(WmsSerialnumberLog record);

    int insertSelective(WmsSerialnumberLog record);

    List<WmsSerialnumberLog> selectByExample(WmsSerialnumberLogExample example);

    WmsSerialnumberLog selectByPrimaryKey(Integer serialnumberLogid);

    int updateByExampleSelective(@Param("record") WmsSerialnumberLog record, @Param("example") WmsSerialnumberLogExample example);

    int updateByExample(@Param("record") WmsSerialnumberLog record, @Param("example") WmsSerialnumberLogExample example);

    int updateByPrimaryKeySelective(WmsSerialnumberLog record);

    int updateByPrimaryKey(WmsSerialnumberLog record);
}