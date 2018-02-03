package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseDepartmentLog;
import cn.hhu.ssm.po.WmsBaseDepartmentLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseDepartmentLogMapper {
    int countByExample(WmsBaseDepartmentLogExample example);

    int deleteByExample(WmsBaseDepartmentLogExample example);

    int deleteByPrimaryKey(Integer departmentLogid);

    int insert(WmsBaseDepartmentLog record);

    int insertSelective(WmsBaseDepartmentLog record);

    List<WmsBaseDepartmentLog> selectByExample(WmsBaseDepartmentLogExample example);

    WmsBaseDepartmentLog selectByPrimaryKey(Integer departmentLogid);

    int updateByExampleSelective(@Param("record") WmsBaseDepartmentLog record, @Param("example") WmsBaseDepartmentLogExample example);

    int updateByExample(@Param("record") WmsBaseDepartmentLog record, @Param("example") WmsBaseDepartmentLogExample example);

    int updateByPrimaryKeySelective(WmsBaseDepartmentLog record);

    int updateByPrimaryKey(WmsBaseDepartmentLog record);
}