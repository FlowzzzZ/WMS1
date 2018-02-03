package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBoxLog;
import cn.hhu.ssm.po.WmsBoxLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBoxLogMapper {
    int countByExample(WmsBoxLogExample example);

    int deleteByExample(WmsBoxLogExample example);

    int deleteByPrimaryKey(Integer boxLogid);

    int insert(WmsBoxLog record);

    int insertSelective(WmsBoxLog record);

    List<WmsBoxLog> selectByExample(WmsBoxLogExample example);

    WmsBoxLog selectByPrimaryKey(Integer boxLogid);

    int updateByExampleSelective(@Param("record") WmsBoxLog record, @Param("example") WmsBoxLogExample example);

    int updateByExample(@Param("record") WmsBoxLog record, @Param("example") WmsBoxLogExample example);

    int updateByPrimaryKeySelective(WmsBoxLog record);

    int updateByPrimaryKey(WmsBoxLog record);
}