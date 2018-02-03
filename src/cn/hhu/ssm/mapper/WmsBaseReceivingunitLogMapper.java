package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseReceivingunitLog;
import cn.hhu.ssm.po.WmsBaseReceivingunitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseReceivingunitLogMapper {
    int countByExample(WmsBaseReceivingunitLogExample example);

    int deleteByExample(WmsBaseReceivingunitLogExample example);

    int deleteByPrimaryKey(Integer receivingunitLogid);

    int insert(WmsBaseReceivingunitLog record);

    int insertSelective(WmsBaseReceivingunitLog record);

    List<WmsBaseReceivingunitLog> selectByExample(WmsBaseReceivingunitLogExample example);

    WmsBaseReceivingunitLog selectByPrimaryKey(Integer receivingunitLogid);

    int updateByExampleSelective(@Param("record") WmsBaseReceivingunitLog record, @Param("example") WmsBaseReceivingunitLogExample example);

    int updateByExample(@Param("record") WmsBaseReceivingunitLog record, @Param("example") WmsBaseReceivingunitLogExample example);

    int updateByPrimaryKeySelective(WmsBaseReceivingunitLog record);

    int updateByPrimaryKey(WmsBaseReceivingunitLog record);
}