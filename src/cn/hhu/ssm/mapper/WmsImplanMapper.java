package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImplan;
import cn.hhu.ssm.po.WmsImplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImplanMapper {
    int countByExample(WmsImplanExample example);

    int deleteByExample(WmsImplanExample example);

    int deleteByPrimaryKey(Integer implanId);

    int insert(WmsImplan record);

    int insertSelective(WmsImplan record);

    List<WmsImplan> selectByExample(WmsImplanExample example);

    WmsImplan selectByPrimaryKey(Integer implanId);

    int updateByExampleSelective(@Param("record") WmsImplan record, @Param("example") WmsImplanExample example);

    int updateByExample(@Param("record") WmsImplan record, @Param("example") WmsImplanExample example);

    int updateByPrimaryKeySelective(WmsImplan record);

    int updateByPrimaryKey(WmsImplan record);
}