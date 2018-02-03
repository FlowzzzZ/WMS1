package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseReceivingunit;
import cn.hhu.ssm.po.WmsBaseReceivingunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseReceivingunitMapper {
    int countByExample(WmsBaseReceivingunitExample example);

    int deleteByExample(WmsBaseReceivingunitExample example);

    int deleteByPrimaryKey(Integer shipperId);

    int insert(WmsBaseReceivingunit record);

    int insertSelective(WmsBaseReceivingunit record);

    List<WmsBaseReceivingunit> selectByExample(WmsBaseReceivingunitExample example);

    WmsBaseReceivingunit selectByPrimaryKey(Integer shipperId);

    int updateByExampleSelective(@Param("record") WmsBaseReceivingunit record, @Param("example") WmsBaseReceivingunitExample example);

    int updateByExample(@Param("record") WmsBaseReceivingunit record, @Param("example") WmsBaseReceivingunitExample example);

    int updateByPrimaryKeySelective(WmsBaseReceivingunit record);

    int updateByPrimaryKey(WmsBaseReceivingunit record);
}