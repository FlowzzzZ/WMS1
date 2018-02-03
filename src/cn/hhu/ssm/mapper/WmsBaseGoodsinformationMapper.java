package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseGoodsinformation;
import cn.hhu.ssm.po.WmsBaseGoodsinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseGoodsinformationMapper {
    int countByExample(WmsBaseGoodsinformationExample example);

    int deleteByExample(WmsBaseGoodsinformationExample example);

    int deleteByPrimaryKey(Integer goodsinformationId);

    int insert(WmsBaseGoodsinformation record);

    int insertSelective(WmsBaseGoodsinformation record);

    List<WmsBaseGoodsinformation> selectByExample(WmsBaseGoodsinformationExample example);

    WmsBaseGoodsinformation selectByPrimaryKey(Integer goodsinformationId);

    int updateByExampleSelective(@Param("record") WmsBaseGoodsinformation record, @Param("example") WmsBaseGoodsinformationExample example);

    int updateByExample(@Param("record") WmsBaseGoodsinformation record, @Param("example") WmsBaseGoodsinformationExample example);

    int updateByPrimaryKeySelective(WmsBaseGoodsinformation record);

    int updateByPrimaryKey(WmsBaseGoodsinformation record);
}