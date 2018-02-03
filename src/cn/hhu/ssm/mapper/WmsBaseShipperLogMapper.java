package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseShipperLog;
import cn.hhu.ssm.po.WmsBaseShipperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseShipperLogMapper {
    int countByExample(WmsBaseShipperLogExample example);

    int deleteByExample(WmsBaseShipperLogExample example);

    int deleteByPrimaryKey(Integer clientLogid);

    int insert(WmsBaseShipperLog record);

    int insertSelective(WmsBaseShipperLog record);

    List<WmsBaseShipperLog> selectByExample(WmsBaseShipperLogExample example);

    WmsBaseShipperLog selectByPrimaryKey(Integer clientLogid);

    int updateByExampleSelective(@Param("record") WmsBaseShipperLog record, @Param("example") WmsBaseShipperLogExample example);

    int updateByExample(@Param("record") WmsBaseShipperLog record, @Param("example") WmsBaseShipperLogExample example);

    int updateByPrimaryKeySelective(WmsBaseShipperLog record);

    int updateByPrimaryKey(WmsBaseShipperLog record);
}