package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseSupplierLog;
import cn.hhu.ssm.po.WmsBaseSupplierLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseSupplierLogMapper {
    int countByExample(WmsBaseSupplierLogExample example);

    int deleteByExample(WmsBaseSupplierLogExample example);

    int deleteByPrimaryKey(Integer supplierLogid);

    int insert(WmsBaseSupplierLog record);

    int insertSelective(WmsBaseSupplierLog record);

    List<WmsBaseSupplierLog> selectByExample(WmsBaseSupplierLogExample example);

    WmsBaseSupplierLog selectByPrimaryKey(Integer supplierLogid);

    int updateByExampleSelective(@Param("record") WmsBaseSupplierLog record, @Param("example") WmsBaseSupplierLogExample example);

    int updateByExample(@Param("record") WmsBaseSupplierLog record, @Param("example") WmsBaseSupplierLogExample example);

    int updateByPrimaryKeySelective(WmsBaseSupplierLog record);

    int updateByPrimaryKey(WmsBaseSupplierLog record);
}