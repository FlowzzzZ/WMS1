package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStockLog;
import cn.hhu.ssm.po.WmsStockLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStockLogMapper {
    int countByExample(WmsStockLogExample example);

    int deleteByExample(WmsStockLogExample example);

    int deleteByPrimaryKey(Integer stockLogid);

    int insert(WmsStockLog record);

    int insertSelective(WmsStockLog record);

    List<WmsStockLog> selectByExample(WmsStockLogExample example);

    WmsStockLog selectByPrimaryKey(Integer stockLogid);

    int updateByExampleSelective(@Param("record") WmsStockLog record, @Param("example") WmsStockLogExample example);

    int updateByExample(@Param("record") WmsStockLog record, @Param("example") WmsStockLogExample example);

    int updateByPrimaryKeySelective(WmsStockLog record);

    int updateByPrimaryKey(WmsStockLog record);
}