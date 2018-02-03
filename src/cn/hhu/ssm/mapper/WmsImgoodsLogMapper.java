package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImgoodsLog;
import cn.hhu.ssm.po.WmsImgoodsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImgoodsLogMapper {
    int countByExample(WmsImgoodsLogExample example);

    int deleteByExample(WmsImgoodsLogExample example);

    int deleteByPrimaryKey(Integer goodsidLogid);

    int insert(WmsImgoodsLog record);

    int insertSelective(WmsImgoodsLog record);

    List<WmsImgoodsLog> selectByExample(WmsImgoodsLogExample example);

    WmsImgoodsLog selectByPrimaryKey(Integer goodsidLogid);

    int updateByExampleSelective(@Param("record") WmsImgoodsLog record, @Param("example") WmsImgoodsLogExample example);

    int updateByExample(@Param("record") WmsImgoodsLog record, @Param("example") WmsImgoodsLogExample example);

    int updateByPrimaryKeySelective(WmsImgoodsLog record);

    int updateByPrimaryKey(WmsImgoodsLog record);
}