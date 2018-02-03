package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsReceivingrecordsLog;
import cn.hhu.ssm.po.WmsReceivingrecordsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsReceivingrecordsLogMapper {
    int countByExample(WmsReceivingrecordsLogExample example);

    int deleteByExample(WmsReceivingrecordsLogExample example);

    int deleteByPrimaryKey(Integer receivingrecordsLogid);

    int insert(WmsReceivingrecordsLog record);

    int insertSelective(WmsReceivingrecordsLog record);

    List<WmsReceivingrecordsLog> selectByExample(WmsReceivingrecordsLogExample example);

    WmsReceivingrecordsLog selectByPrimaryKey(Integer receivingrecordsLogid);

    int updateByExampleSelective(@Param("record") WmsReceivingrecordsLog record, @Param("example") WmsReceivingrecordsLogExample example);

    int updateByExample(@Param("record") WmsReceivingrecordsLog record, @Param("example") WmsReceivingrecordsLogExample example);

    int updateByPrimaryKeySelective(WmsReceivingrecordsLog record);

    int updateByPrimaryKey(WmsReceivingrecordsLog record);
}