package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsFunclistLog;
import cn.hhu.ssm.po.WmsFunclistLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsFunclistLogMapper {
    int countByExample(WmsFunclistLogExample example);

    int deleteByExample(WmsFunclistLogExample example);

    int deleteByPrimaryKey(Integer funclistLogid);

    int insert(WmsFunclistLog record);

    int insertSelective(WmsFunclistLog record);

    List<WmsFunclistLog> selectByExample(WmsFunclistLogExample example);

    WmsFunclistLog selectByPrimaryKey(Integer funclistLogid);

    int updateByExampleSelective(@Param("record") WmsFunclistLog record, @Param("example") WmsFunclistLogExample example);

    int updateByExample(@Param("record") WmsFunclistLog record, @Param("example") WmsFunclistLogExample example);

    int updateByPrimaryKeySelective(WmsFunclistLog record);

    int updateByPrimaryKey(WmsFunclistLog record);
}