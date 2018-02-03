package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseEmployeeLog;
import cn.hhu.ssm.po.WmsBaseEmployeeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseEmployeeLogMapper {
    int countByExample(WmsBaseEmployeeLogExample example);

    int deleteByExample(WmsBaseEmployeeLogExample example);

    int deleteByPrimaryKey(Integer employeeLogid);

    int insert(WmsBaseEmployeeLog record);

    int insertSelective(WmsBaseEmployeeLog record);

    List<WmsBaseEmployeeLog> selectByExample(WmsBaseEmployeeLogExample example);

    WmsBaseEmployeeLog selectByPrimaryKey(Integer employeeLogid);

    int updateByExampleSelective(@Param("record") WmsBaseEmployeeLog record, @Param("example") WmsBaseEmployeeLogExample example);

    int updateByExample(@Param("record") WmsBaseEmployeeLog record, @Param("example") WmsBaseEmployeeLogExample example);

    int updateByPrimaryKeySelective(WmsBaseEmployeeLog record);

    int updateByPrimaryKey(WmsBaseEmployeeLog record);
}