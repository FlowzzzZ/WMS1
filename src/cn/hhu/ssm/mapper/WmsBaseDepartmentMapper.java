package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseDepartment;
import cn.hhu.ssm.po.WmsBaseDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseDepartmentMapper {
    int countByExample(WmsBaseDepartmentExample example);

    int deleteByExample(WmsBaseDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(WmsBaseDepartment record);

    int insertSelective(WmsBaseDepartment record);

    List<WmsBaseDepartment> selectByExample(WmsBaseDepartmentExample example);

    WmsBaseDepartment selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") WmsBaseDepartment record, @Param("example") WmsBaseDepartmentExample example);

    int updateByExample(@Param("record") WmsBaseDepartment record, @Param("example") WmsBaseDepartmentExample example);

    int updateByPrimaryKeySelective(WmsBaseDepartment record);

    int updateByPrimaryKey(WmsBaseDepartment record);
}