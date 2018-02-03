package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseSupplier;
import cn.hhu.ssm.po.WmsBaseSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseSupplierMapper {
    int countByExample(WmsBaseSupplierExample example);

    int deleteByExample(WmsBaseSupplierExample example);

    int deleteByPrimaryKey(Integer supplierId);

    int insert(WmsBaseSupplier record);

    int insertSelective(WmsBaseSupplier record);

    List<WmsBaseSupplier> selectByExample(WmsBaseSupplierExample example);

    WmsBaseSupplier selectByPrimaryKey(Integer supplierId);

    int updateByExampleSelective(@Param("record") WmsBaseSupplier record, @Param("example") WmsBaseSupplierExample example);

    int updateByExample(@Param("record") WmsBaseSupplier record, @Param("example") WmsBaseSupplierExample example);

    int updateByPrimaryKeySelective(WmsBaseSupplier record);

    int updateByPrimaryKey(WmsBaseSupplier record);
}