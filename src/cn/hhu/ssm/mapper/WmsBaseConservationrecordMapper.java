package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseConservationrecord;
import cn.hhu.ssm.po.WmsBaseConservationrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseConservationrecordMapper {
    int countByExample(WmsBaseConservationrecordExample example);

    int deleteByExample(WmsBaseConservationrecordExample example);

    int deleteByPrimaryKey(Integer conservationrecordId);

    int insert(WmsBaseConservationrecord record);

    int insertSelective(WmsBaseConservationrecord record);

    List<WmsBaseConservationrecord> selectByExample(WmsBaseConservationrecordExample example);

    WmsBaseConservationrecord selectByPrimaryKey(Integer conservationrecordId);

    int updateByExampleSelective(@Param("record") WmsBaseConservationrecord record, @Param("example") WmsBaseConservationrecordExample example);

    int updateByExample(@Param("record") WmsBaseConservationrecord record, @Param("example") WmsBaseConservationrecordExample example);

    int updateByPrimaryKeySelective(WmsBaseConservationrecord record);

    int updateByPrimaryKey(WmsBaseConservationrecord record);
}