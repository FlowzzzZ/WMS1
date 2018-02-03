package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseProductlineLog;
import cn.hhu.ssm.po.WmsBaseProductlineLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseProductlineLogMapper {
    int countByExample(WmsBaseProductlineLogExample example);

    int deleteByExample(WmsBaseProductlineLogExample example);

    int deleteByPrimaryKey(Integer productlineLogid);

    int insert(WmsBaseProductlineLog record);

    int insertSelective(WmsBaseProductlineLog record);

    List<WmsBaseProductlineLog> selectByExample(WmsBaseProductlineLogExample example);

    WmsBaseProductlineLog selectByPrimaryKey(Integer productlineLogid);

    int updateByExampleSelective(@Param("record") WmsBaseProductlineLog record, @Param("example") WmsBaseProductlineLogExample example);

    int updateByExample(@Param("record") WmsBaseProductlineLog record, @Param("example") WmsBaseProductlineLogExample example);

    int updateByPrimaryKeySelective(WmsBaseProductlineLog record);

    int updateByPrimaryKey(WmsBaseProductlineLog record);
}