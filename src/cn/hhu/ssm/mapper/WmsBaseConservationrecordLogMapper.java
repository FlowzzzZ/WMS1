package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseConservationrecordLog;
import cn.hhu.ssm.po.WmsBaseConservationrecordLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseConservationrecordLogMapper {
    int countByExample(WmsBaseConservationrecordLogExample example);

    int deleteByExample(WmsBaseConservationrecordLogExample example);

    int deleteByPrimaryKey(Integer conservationrecordLogid);

    int insert(WmsBaseConservationrecordLog record);

    int insertSelective(WmsBaseConservationrecordLog record);

    List<WmsBaseConservationrecordLog> selectByExample(WmsBaseConservationrecordLogExample example);

    WmsBaseConservationrecordLog selectByPrimaryKey(Integer conservationrecordLogid);

    int updateByExampleSelective(@Param("record") WmsBaseConservationrecordLog record, @Param("example") WmsBaseConservationrecordLogExample example);

    int updateByExample(@Param("record") WmsBaseConservationrecordLog record, @Param("example") WmsBaseConservationrecordLogExample example);

    int updateByPrimaryKeySelective(WmsBaseConservationrecordLog record);

    int updateByPrimaryKey(WmsBaseConservationrecordLog record);
}