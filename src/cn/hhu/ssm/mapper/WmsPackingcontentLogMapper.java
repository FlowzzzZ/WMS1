package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsPackingcontentLog;
import cn.hhu.ssm.po.WmsPackingcontentLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsPackingcontentLogMapper {
    int countByExample(WmsPackingcontentLogExample example);

    int deleteByExample(WmsPackingcontentLogExample example);

    int deleteByPrimaryKey(Integer packingcontentLogid);

    int insert(WmsPackingcontentLog record);

    int insertSelective(WmsPackingcontentLog record);

    List<WmsPackingcontentLog> selectByExample(WmsPackingcontentLogExample example);

    WmsPackingcontentLog selectByPrimaryKey(Integer packingcontentLogid);

    int updateByExampleSelective(@Param("record") WmsPackingcontentLog record, @Param("example") WmsPackingcontentLogExample example);

    int updateByExample(@Param("record") WmsPackingcontentLog record, @Param("example") WmsPackingcontentLogExample example);

    int updateByPrimaryKeySelective(WmsPackingcontentLog record);

    int updateByPrimaryKey(WmsPackingcontentLog record);
}