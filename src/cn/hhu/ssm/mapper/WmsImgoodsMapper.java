package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImgoods;
import cn.hhu.ssm.po.WmsImgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImgoodsMapper {
    int countByExample(WmsImgoodsExample example);

    int deleteByExample(WmsImgoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(WmsImgoods record);

    int insertSelective(WmsImgoods record);

    List<WmsImgoods> selectByExample(WmsImgoodsExample example);

    WmsImgoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") WmsImgoods record, @Param("example") WmsImgoodsExample example);

    int updateByExample(@Param("record") WmsImgoods record, @Param("example") WmsImgoodsExample example);

    int updateByPrimaryKeySelective(WmsImgoods record);

    int updateByPrimaryKey(WmsImgoods record);
}