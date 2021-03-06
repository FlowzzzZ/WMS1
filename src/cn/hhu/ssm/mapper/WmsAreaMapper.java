package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsArea;
import cn.hhu.ssm.po.WmsAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsAreaMapper {
    int countByExample(WmsAreaExample example);

    int deleteByExample(WmsAreaExample example);

    int deleteByPrimaryKey(Integer areasId);

    int insert(WmsArea record);

    int insertSelective(WmsArea record);

    List<WmsArea> selectByExample(WmsAreaExample example);

    WmsArea selectByPrimaryKey(Integer areasId);

    int updateByExampleSelective(@Param("record") WmsArea record, @Param("example") WmsAreaExample example);

    int updateByExample(@Param("record") WmsArea record, @Param("example") WmsAreaExample example);

    int updateByPrimaryKeySelective(WmsArea record);

    int updateByPrimaryKey(WmsArea record);
}