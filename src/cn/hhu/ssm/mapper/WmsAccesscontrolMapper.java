package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsAccesscontrol;
import cn.hhu.ssm.po.WmsAccesscontrolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsAccesscontrolMapper {
    int countByExample(WmsAccesscontrolExample example);

    int deleteByExample(WmsAccesscontrolExample example);

    int deleteByPrimaryKey(Integer accesscontrolId);

    int insert(WmsAccesscontrol record);

    int insertSelective(WmsAccesscontrol record);

    List<WmsAccesscontrol> selectByExample(WmsAccesscontrolExample example);

    WmsAccesscontrol selectByPrimaryKey(Integer accesscontrolId);

    int updateByExampleSelective(@Param("record") WmsAccesscontrol record, @Param("example") WmsAccesscontrolExample example);

    int updateByExample(@Param("record") WmsAccesscontrol record, @Param("example") WmsAccesscontrolExample example);

    int updateByPrimaryKeySelective(WmsAccesscontrol record);

    int updateByPrimaryKey(WmsAccesscontrol record);
}