package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStorehouseLog;
import cn.hhu.ssm.po.WmsStorehouseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStorehouseLogMapper {
    int countByExample(WmsStorehouseLogExample example);

    int deleteByExample(WmsStorehouseLogExample example);

    int deleteByPrimaryKey(Integer storehousesLogid);

    int insert(WmsStorehouseLog record);

    int insertSelective(WmsStorehouseLog record);

    List<WmsStorehouseLog> selectByExample(WmsStorehouseLogExample example);

    WmsStorehouseLog selectByPrimaryKey(Integer storehousesLogid);

    int updateByExampleSelective(@Param("record") WmsStorehouseLog record, @Param("example") WmsStorehouseLogExample example);

    int updateByExample(@Param("record") WmsStorehouseLog record, @Param("example") WmsStorehouseLogExample example);

    int updateByPrimaryKeySelective(WmsStorehouseLog record);

    int updateByPrimaryKey(WmsStorehouseLog record);
}