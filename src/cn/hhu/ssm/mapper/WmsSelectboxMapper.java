package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsSelectbox;
import cn.hhu.ssm.po.WmsSelectboxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsSelectboxMapper {
    int countByExample(WmsSelectboxExample example);

    int deleteByExample(WmsSelectboxExample example);

    int deleteByPrimaryKey(Integer selectboxId);

    int insert(WmsSelectbox record);

    int insertSelective(WmsSelectbox record);

    List<WmsSelectbox> selectByExample(WmsSelectboxExample example);

    WmsSelectbox selectByPrimaryKey(Integer selectboxId);

    int updateByExampleSelective(@Param("record") WmsSelectbox record, @Param("example") WmsSelectboxExample example);

    int updateByExample(@Param("record") WmsSelectbox record, @Param("example") WmsSelectboxExample example);

    int updateByPrimaryKeySelective(WmsSelectbox record);

    int updateByPrimaryKey(WmsSelectbox record);
}