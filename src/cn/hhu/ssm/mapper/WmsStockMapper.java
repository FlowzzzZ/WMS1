package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStock;
import cn.hhu.ssm.po.WmsStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStockMapper {
    int countByExample(WmsStockExample example);

    int deleteByExample(WmsStockExample example);

    int deleteByPrimaryKey(Integer stocksId);

    int insert(WmsStock record);

    int insertSelective(WmsStock record);

    List<WmsStock> selectByExample(WmsStockExample example);

    WmsStock selectByPrimaryKey(Integer stocksId);

    int updateByExampleSelective(@Param("record") WmsStock record, @Param("example") WmsStockExample example);

    int updateByExample(@Param("record") WmsStock record, @Param("example") WmsStockExample example);

    int updateByPrimaryKeySelective(WmsStock record);

    int updateByPrimaryKey(WmsStock record);
}