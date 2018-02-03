package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseShipper;
import cn.hhu.ssm.po.WmsBaseShipperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseShipperMapper {
    int countByExample(WmsBaseShipperExample example);

    int deleteByExample(WmsBaseShipperExample example);

    int deleteByPrimaryKey(Integer clientId);

    int insert(WmsBaseShipper record);

    int insertSelective(WmsBaseShipper record);

    List<WmsBaseShipper> selectByExample(WmsBaseShipperExample example);

    WmsBaseShipper selectByPrimaryKey(Integer clientId);

    int updateByExampleSelective(@Param("record") WmsBaseShipper record, @Param("example") WmsBaseShipperExample example);

    int updateByExample(@Param("record") WmsBaseShipper record, @Param("example") WmsBaseShipperExample example);

    int updateByPrimaryKeySelective(WmsBaseShipper record);

    int updateByPrimaryKey(WmsBaseShipper record);
}