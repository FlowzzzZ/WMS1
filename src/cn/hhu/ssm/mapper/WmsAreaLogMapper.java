package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsAreaLog;
import cn.hhu.ssm.po.WmsAreaLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsAreaLogMapper {
    int countByExample(WmsAreaLogExample example);

    int deleteByExample(WmsAreaLogExample example);

    int deleteByPrimaryKey(Integer areasLogid);

    int insert(WmsAreaLog record);

    int insertSelective(WmsAreaLog record);

    List<WmsAreaLog> selectByExample(WmsAreaLogExample example);

    WmsAreaLog selectByPrimaryKey(Integer areasLogid);

    int updateByExampleSelective(@Param("record") WmsAreaLog record, @Param("example") WmsAreaLogExample example);

    int updateByExample(@Param("record") WmsAreaLog record, @Param("example") WmsAreaLogExample example);

    int updateByPrimaryKeySelective(WmsAreaLog record);

    int updateByPrimaryKey(WmsAreaLog record);
}