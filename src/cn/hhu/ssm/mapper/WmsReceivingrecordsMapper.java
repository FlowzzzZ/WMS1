package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsReceivingrecords;
import cn.hhu.ssm.po.WmsReceivingrecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsReceivingrecordsMapper {
    int countByExample(WmsReceivingrecordsExample example);

    int deleteByExample(WmsReceivingrecordsExample example);

    int deleteByPrimaryKey(Integer receivingrecordsId);

    int insert(WmsReceivingrecords record);

    int insertSelective(WmsReceivingrecords record);

    List<WmsReceivingrecords> selectByExample(WmsReceivingrecordsExample example);

    WmsReceivingrecords selectByPrimaryKey(Integer receivingrecordsId);

    int updateByExampleSelective(@Param("record") WmsReceivingrecords record, @Param("example") WmsReceivingrecordsExample example);

    int updateByExample(@Param("record") WmsReceivingrecords record, @Param("example") WmsReceivingrecordsExample example);

    int updateByPrimaryKeySelective(WmsReceivingrecords record);

    int updateByPrimaryKey(WmsReceivingrecords record);
}