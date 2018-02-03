package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseGoodsinformationLog;
import cn.hhu.ssm.po.WmsBaseGoodsinformationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseGoodsinformationLogMapper {
    int countByExample(WmsBaseGoodsinformationLogExample example);

    int deleteByExample(WmsBaseGoodsinformationLogExample example);

    int deleteByPrimaryKey(Integer goodsinformationLogid);

    int insert(WmsBaseGoodsinformationLog record);

    int insertSelective(WmsBaseGoodsinformationLog record);

    List<WmsBaseGoodsinformationLog> selectByExample(WmsBaseGoodsinformationLogExample example);

    WmsBaseGoodsinformationLog selectByPrimaryKey(Integer goodsinformationLogid);

    int updateByExampleSelective(@Param("record") WmsBaseGoodsinformationLog record, @Param("example") WmsBaseGoodsinformationLogExample example);

    int updateByExample(@Param("record") WmsBaseGoodsinformationLog record, @Param("example") WmsBaseGoodsinformationLogExample example);

    int updateByPrimaryKeySelective(WmsBaseGoodsinformationLog record);

    int updateByPrimaryKey(WmsBaseGoodsinformationLog record);
}