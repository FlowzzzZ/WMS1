package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsPackingcontent;
import cn.hhu.ssm.po.WmsPackingcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsPackingcontentMapper {
    int countByExample(WmsPackingcontentExample example);

    int deleteByExample(WmsPackingcontentExample example);

    int deleteByPrimaryKey(Integer packingcontentId);

    int insert(WmsPackingcontent record);

    int insertSelective(WmsPackingcontent record);

    List<WmsPackingcontent> selectByExample(WmsPackingcontentExample example);

    WmsPackingcontent selectByPrimaryKey(Integer packingcontentId);

    int updateByExampleSelective(@Param("record") WmsPackingcontent record, @Param("example") WmsPackingcontentExample example);

    int updateByExample(@Param("record") WmsPackingcontent record, @Param("example") WmsPackingcontentExample example);

    int updateByPrimaryKeySelective(WmsPackingcontent record);

    int updateByPrimaryKey(WmsPackingcontent record);
}