package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseEmployeeMapper {
    int countByExample(WmsBaseEmployeeExample example);

    int deleteByExample(WmsBaseEmployeeExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(WmsBaseEmployee record);

    int insertSelective(WmsBaseEmployee record);

    List<WmsBaseEmployee> selectByExample(WmsBaseEmployeeExample example);

    WmsBaseEmployee selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") WmsBaseEmployee record, @Param("example") WmsBaseEmployeeExample example);

    int updateByExample(@Param("record") WmsBaseEmployee record, @Param("example") WmsBaseEmployeeExample example);

    int updateByPrimaryKeySelective(WmsBaseEmployee record);

    int updateByPrimaryKey(WmsBaseEmployee record);
}