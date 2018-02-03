package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStorehouse;
import cn.hhu.ssm.po.WmsStorehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStorehouseMapper {
    int countByExample(WmsStorehouseExample example);

    int deleteByExample(WmsStorehouseExample example);

    int deleteByPrimaryKey(Integer storehousesId);

    int insert(WmsStorehouse record);

    int insertSelective(WmsStorehouse record);

    List<WmsStorehouse> selectByExample(WmsStorehouseExample example);

    WmsStorehouse selectByPrimaryKey(Integer storehousesId);

    int updateByExampleSelective(@Param("record") WmsStorehouse record, @Param("example") WmsStorehouseExample example);

    int updateByExample(@Param("record") WmsStorehouse record, @Param("example") WmsStorehouseExample example);

    int updateByPrimaryKeySelective(WmsStorehouse record);

    int updateByPrimaryKey(WmsStorehouse record);
}