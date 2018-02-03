package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExcheckLog;
import cn.hhu.ssm.po.WmsExcheckLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExcheckLogMapper {
    int countByExample(WmsExcheckLogExample example);

    int deleteByExample(WmsExcheckLogExample example);

    int deleteByPrimaryKey(Integer excheckLogid);

    int insert(WmsExcheckLog record);

    int insertSelective(WmsExcheckLog record);

    List<WmsExcheckLog> selectByExample(WmsExcheckLogExample example);

    WmsExcheckLog selectByPrimaryKey(Integer excheckLogid);

    int updateByExampleSelective(@Param("record") WmsExcheckLog record, @Param("example") WmsExcheckLogExample example);

    int updateByExample(@Param("record") WmsExcheckLog record, @Param("example") WmsExcheckLogExample example);

    int updateByPrimaryKeySelective(WmsExcheckLog record);

    int updateByPrimaryKey(WmsExcheckLog record);
}