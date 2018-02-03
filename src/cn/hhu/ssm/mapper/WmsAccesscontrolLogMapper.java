package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsAccesscontrolLog;
import cn.hhu.ssm.po.WmsAccesscontrolLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsAccesscontrolLogMapper {
    int countByExample(WmsAccesscontrolLogExample example);

    int deleteByExample(WmsAccesscontrolLogExample example);

    int deleteByPrimaryKey(Integer accesscontrolLogid);

    int insert(WmsAccesscontrolLog record);

    int insertSelective(WmsAccesscontrolLog record);

    List<WmsAccesscontrolLog> selectByExample(WmsAccesscontrolLogExample example);

    WmsAccesscontrolLog selectByPrimaryKey(Integer accesscontrolLogid);

    int updateByExampleSelective(@Param("record") WmsAccesscontrolLog record, @Param("example") WmsAccesscontrolLogExample example);

    int updateByExample(@Param("record") WmsAccesscontrolLog record, @Param("example") WmsAccesscontrolLogExample example);

    int updateByPrimaryKeySelective(WmsAccesscontrolLog record);

    int updateByPrimaryKey(WmsAccesscontrolLog record);
}