package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsStockcountLog;
import cn.hhu.ssm.po.WmsStockcountLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsStockcountLogMapper {
    int countByExample(WmsStockcountLogExample example);

    int deleteByExample(WmsStockcountLogExample example);

    int deleteByPrimaryKey(Integer stockcountLogid);

    int insert(WmsStockcountLog record);

    int insertSelective(WmsStockcountLog record);

    List<WmsStockcountLog> selectByExample(WmsStockcountLogExample example);

    WmsStockcountLog selectByPrimaryKey(Integer stockcountLogid);

    int updateByExampleSelective(@Param("record") WmsStockcountLog record, @Param("example") WmsStockcountLogExample example);

    int updateByExample(@Param("record") WmsStockcountLog record, @Param("example") WmsStockcountLogExample example);

    int updateByPrimaryKeySelective(WmsStockcountLog record);

    int updateByPrimaryKey(WmsStockcountLog record);
}