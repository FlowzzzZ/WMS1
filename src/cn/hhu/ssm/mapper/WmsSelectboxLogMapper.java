package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsSelectboxLog;
import cn.hhu.ssm.po.WmsSelectboxLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsSelectboxLogMapper {
    int countByExample(WmsSelectboxLogExample example);

    int deleteByExample(WmsSelectboxLogExample example);

    int deleteByPrimaryKey(Integer selectboxLogid);

    int insert(WmsSelectboxLog record);

    int insertSelective(WmsSelectboxLog record);

    List<WmsSelectboxLog> selectByExample(WmsSelectboxLogExample example);

    WmsSelectboxLog selectByPrimaryKey(Integer selectboxLogid);

    int updateByExampleSelective(@Param("record") WmsSelectboxLog record, @Param("example") WmsSelectboxLogExample example);

    int updateByExample(@Param("record") WmsSelectboxLog record, @Param("example") WmsSelectboxLogExample example);

    int updateByPrimaryKeySelective(WmsSelectboxLog record);

    int updateByPrimaryKey(WmsSelectboxLog record);
}