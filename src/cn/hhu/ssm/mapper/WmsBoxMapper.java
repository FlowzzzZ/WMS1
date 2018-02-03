package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBox;
import cn.hhu.ssm.po.WmsBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBoxMapper {
    int countByExample(WmsBoxExample example);

    int deleteByExample(WmsBoxExample example);

    int deleteByPrimaryKey(Integer boxId);

    int insert(WmsBox record);

    int insertSelective(WmsBox record);

    List<WmsBox> selectByExample(WmsBoxExample example);

    WmsBox selectByPrimaryKey(Integer boxId);

    int updateByExampleSelective(@Param("record") WmsBox record, @Param("example") WmsBoxExample example);

    int updateByExample(@Param("record") WmsBox record, @Param("example") WmsBoxExample example);

    int updateByPrimaryKeySelective(WmsBox record);

    int updateByPrimaryKey(WmsBox record);
}