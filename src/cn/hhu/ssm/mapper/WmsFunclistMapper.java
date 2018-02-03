package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsFunclist;
import cn.hhu.ssm.po.WmsFunclistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsFunclistMapper {
    int countByExample(WmsFunclistExample example);

    int deleteByExample(WmsFunclistExample example);

    int deleteByPrimaryKey(Integer funcId);

    int insert(WmsFunclist record);

    int insertSelective(WmsFunclist record);

    List<WmsFunclist> selectByExample(WmsFunclistExample example);

    WmsFunclist selectByPrimaryKey(Integer funcId);

    int updateByExampleSelective(@Param("record") WmsFunclist record, @Param("example") WmsFunclistExample example);

    int updateByExample(@Param("record") WmsFunclist record, @Param("example") WmsFunclistExample example);

    int updateByPrimaryKeySelective(WmsFunclist record);

    int updateByPrimaryKey(WmsFunclist record);
}