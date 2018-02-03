package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsIminspectionlist;
import cn.hhu.ssm.po.WmsIminspectionlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsIminspectionlistMapper {
    int countByExample(WmsIminspectionlistExample example);

    int deleteByExample(WmsIminspectionlistExample example);

    int deleteByPrimaryKey(Integer iminspectionlistsId);

    int insert(WmsIminspectionlist record);

    int insertSelective(WmsIminspectionlist record);

    List<WmsIminspectionlist> selectByExampleWithBLOBs(WmsIminspectionlistExample example);

    List<WmsIminspectionlist> selectByExample(WmsIminspectionlistExample example);

    WmsIminspectionlist selectByPrimaryKey(Integer iminspectionlistsId);

    int updateByExampleSelective(@Param("record") WmsIminspectionlist record, @Param("example") WmsIminspectionlistExample example);

    int updateByExampleWithBLOBs(@Param("record") WmsIminspectionlist record, @Param("example") WmsIminspectionlistExample example);

    int updateByExample(@Param("record") WmsIminspectionlist record, @Param("example") WmsIminspectionlistExample example);

    int updateByPrimaryKeySelective(WmsIminspectionlist record);

    int updateByPrimaryKeyWithBLOBs(WmsIminspectionlist record);

    int updateByPrimaryKey(WmsIminspectionlist record);
}