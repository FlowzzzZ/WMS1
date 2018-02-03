package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseProductline;
import cn.hhu.ssm.po.WmsBaseProductlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseProductlineMapper {
    int countByExample(WmsBaseProductlineExample example);

    int deleteByExample(WmsBaseProductlineExample example);

    int deleteByPrimaryKey(Integer productlineId);

    int insert(WmsBaseProductline record);

    int insertSelective(WmsBaseProductline record);

    List<WmsBaseProductline> selectByExample(WmsBaseProductlineExample example);

    WmsBaseProductline selectByPrimaryKey(Integer productlineId);

    int updateByExampleSelective(@Param("record") WmsBaseProductline record, @Param("example") WmsBaseProductlineExample example);

    int updateByExample(@Param("record") WmsBaseProductline record, @Param("example") WmsBaseProductlineExample example);

    int updateByPrimaryKeySelective(WmsBaseProductline record);

    int updateByPrimaryKey(WmsBaseProductline record);
}