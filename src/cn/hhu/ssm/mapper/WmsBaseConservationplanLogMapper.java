package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseConservationplanLog;
import cn.hhu.ssm.po.WmsBaseConservationplanLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseConservationplanLogMapper {
    int countByExample(WmsBaseConservationplanLogExample example);

    int deleteByExample(WmsBaseConservationplanLogExample example);

    int deleteByPrimaryKey(Integer conservationplanLogid);

    int insert(WmsBaseConservationplanLog record);

    int insertSelective(WmsBaseConservationplanLog record);

    List<WmsBaseConservationplanLog> selectByExample(WmsBaseConservationplanLogExample example);

    WmsBaseConservationplanLog selectByPrimaryKey(Integer conservationplanLogid);

    int updateByExampleSelective(@Param("record") WmsBaseConservationplanLog record, @Param("example") WmsBaseConservationplanLogExample example);

    int updateByExample(@Param("record") WmsBaseConservationplanLog record, @Param("example") WmsBaseConservationplanLogExample example);

    int updateByPrimaryKeySelective(WmsBaseConservationplanLog record);

    int updateByPrimaryKey(WmsBaseConservationplanLog record);
}