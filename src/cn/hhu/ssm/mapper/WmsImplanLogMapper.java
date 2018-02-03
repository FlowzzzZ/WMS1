package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImplanLog;
import cn.hhu.ssm.po.WmsImplanLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImplanLogMapper {
    int countByExample(WmsImplanLogExample example);

    int deleteByExample(WmsImplanLogExample example);

    int deleteByPrimaryKey(Integer implanLogid);

    int insert(WmsImplanLog record);

    int insertSelective(WmsImplanLog record);

    List<WmsImplanLog> selectByExample(WmsImplanLogExample example);

    WmsImplanLog selectByPrimaryKey(Integer implanLogid);

    int updateByExampleSelective(@Param("record") WmsImplanLog record, @Param("example") WmsImplanLogExample example);

    int updateByExample(@Param("record") WmsImplanLog record, @Param("example") WmsImplanLogExample example);

    int updateByPrimaryKeySelective(WmsImplanLog record);

    int updateByPrimaryKey(WmsImplanLog record);
}