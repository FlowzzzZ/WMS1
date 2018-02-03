package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.po.WmsExplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExplanMapper {
    int countByExample(WmsExplanExample example);

    int deleteByExample(WmsExplanExample example);

    int deleteByPrimaryKey(Integer explanId);

    int insert(WmsExplan record);

    int insertSelective(WmsExplan record);

    List<WmsExplan> selectByExample(WmsExplanExample example);

    WmsExplan selectByPrimaryKey(Integer explanId);

    int updateByExampleSelective(@Param("record") WmsExplan record, @Param("example") WmsExplanExample example);

    int updateByExample(@Param("record") WmsExplan record, @Param("example") WmsExplanExample example);

    int updateByPrimaryKeySelective(WmsExplan record);

    int updateByPrimaryKey(WmsExplan record);
    
    //根据explanid查询出库计划，带货主姓名
    List<WmsExplan> selectExplans(WmsExplanExample example);
    
}