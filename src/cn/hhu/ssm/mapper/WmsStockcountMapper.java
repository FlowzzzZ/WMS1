package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStockcount;
import cn.hhu.ssm.po.WmsStockcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStockcountMapper {
    int countByExample(WmsStockcountExample example);

    int deleteByExample(WmsStockcountExample example);

    int deleteByPrimaryKey(Integer stockcountsId);

    int insert(WmsStockcount record);

    int insertSelective(WmsStockcount record);

    List<WmsStockcount> selectByExample(WmsStockcountExample example);

    WmsStockcount selectByPrimaryKey(Integer stockcountsId);

    int updateByExampleSelective(@Param("record") WmsStockcount record, @Param("example") WmsStockcountExample example);

    int updateByExample(@Param("record") WmsStockcount record, @Param("example") WmsStockcountExample example);

    int updateByPrimaryKeySelective(WmsStockcount record);

    int updateByPrimaryKey(WmsStockcount record);
}