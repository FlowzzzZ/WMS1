package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsLocation;
import cn.hhu.ssm.po.WmsLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsLocationMapper {
    int countByExample(WmsLocationExample example);

    int deleteByExample(WmsLocationExample example);

    int deleteByPrimaryKey(Integer locationsId);

    int insert(WmsLocation record);

    int insertSelective(WmsLocation record);

    List<WmsLocation> selectByExample(WmsLocationExample example);

    WmsLocation selectByPrimaryKey(Integer locationsId);

    int updateByExampleSelective(@Param("record") WmsLocation record, @Param("example") WmsLocationExample example);

    int updateByExample(@Param("record") WmsLocation record, @Param("example") WmsLocationExample example);

    int updateByPrimaryKeySelective(WmsLocation record);

    int updateByPrimaryKey(WmsLocation record);
}