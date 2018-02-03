package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsIminspectionlistLog;
import cn.hhu.ssm.po.WmsIminspectionlistLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsIminspectionlistLogMapper {
    int countByExample(WmsIminspectionlistLogExample example);

    int deleteByExample(WmsIminspectionlistLogExample example);

    int deleteByPrimaryKey(Integer iminspectionlistsLogid);

    int insert(WmsIminspectionlistLog record);

    int insertSelective(WmsIminspectionlistLog record);

    List<WmsIminspectionlistLog> selectByExample(WmsIminspectionlistLogExample example);

    WmsIminspectionlistLog selectByPrimaryKey(Integer iminspectionlistsLogid);

    int updateByExampleSelective(@Param("record") WmsIminspectionlistLog record, @Param("example") WmsIminspectionlistLogExample example);

    int updateByExample(@Param("record") WmsIminspectionlistLog record, @Param("example") WmsIminspectionlistLogExample example);

    int updateByPrimaryKeySelective(WmsIminspectionlistLog record);

    int updateByPrimaryKey(WmsIminspectionlistLog record);
}