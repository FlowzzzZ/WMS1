package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExplanLog;
import cn.hhu.ssm.po.WmsExplanLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExplanLogMapper {
    int countByExample(WmsExplanLogExample example);

    int deleteByExample(WmsExplanLogExample example);

    int deleteByPrimaryKey(Integer explanLogid);

    int insert(WmsExplanLog record);

    int insertSelective(WmsExplanLog record);

    List<WmsExplanLog> selectByExample(WmsExplanLogExample example);

    WmsExplanLog selectByPrimaryKey(Integer explanLogid);

    int updateByExampleSelective(@Param("record") WmsExplanLog record, @Param("example") WmsExplanLogExample example);

    int updateByExample(@Param("record") WmsExplanLog record, @Param("example") WmsExplanLogExample example);

    int updateByPrimaryKeySelective(WmsExplanLog record);

    int updateByPrimaryKey(WmsExplanLog record);
}