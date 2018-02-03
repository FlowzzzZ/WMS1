package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseConservationplan;
import cn.hhu.ssm.po.WmsBaseConservationplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseConservationplanMapper {
    int countByExample(WmsBaseConservationplanExample example);

    int deleteByExample(WmsBaseConservationplanExample example);

    int deleteByPrimaryKey(Integer conservationplanId);

    int insert(WmsBaseConservationplan record);

    int insertSelective(WmsBaseConservationplan record);

    List<WmsBaseConservationplan> selectByExample(WmsBaseConservationplanExample example);

    WmsBaseConservationplan selectByPrimaryKey(Integer conservationplanId);

    int updateByExampleSelective(@Param("record") WmsBaseConservationplan record, @Param("example") WmsBaseConservationplanExample example);

    int updateByExample(@Param("record") WmsBaseConservationplan record, @Param("example") WmsBaseConservationplanExample example);

    int updateByPrimaryKeySelective(WmsBaseConservationplan record);

    int updateByPrimaryKey(WmsBaseConservationplan record);
}