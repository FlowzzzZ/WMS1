package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsSerialnumber;
import cn.hhu.ssm.po.WmsSerialnumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsSerialnumberMapper {
    int countByExample(WmsSerialnumberExample example);

    int deleteByExample(WmsSerialnumberExample example);

    int deleteByPrimaryKey(Integer serialnumberId);

    int insert(WmsSerialnumber record);

    int insertSelective(WmsSerialnumber record);

    List<WmsSerialnumber> selectByExample(WmsSerialnumberExample example);

    WmsSerialnumber selectByPrimaryKey(Integer serialnumberId);

    int updateByExampleSelective(@Param("record") WmsSerialnumber record, @Param("example") WmsSerialnumberExample example);

    int updateByExample(@Param("record") WmsSerialnumber record, @Param("example") WmsSerialnumberExample example);

    int updateByPrimaryKeySelective(WmsSerialnumber record);

    int updateByPrimaryKey(WmsSerialnumber record);
}