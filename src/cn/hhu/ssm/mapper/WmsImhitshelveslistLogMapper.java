package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImhitshelveslistLog;
import cn.hhu.ssm.po.WmsImhitshelveslistLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImhitshelveslistLogMapper {
    int countByExample(WmsImhitshelveslistLogExample example);

    int deleteByExample(WmsImhitshelveslistLogExample example);

    int deleteByPrimaryKey(Integer imhitshelveslistsLogid);

    int insert(WmsImhitshelveslistLog record);

    int insertSelective(WmsImhitshelveslistLog record);

    List<WmsImhitshelveslistLog> selectByExample(WmsImhitshelveslistLogExample example);

    WmsImhitshelveslistLog selectByPrimaryKey(Integer imhitshelveslistsLogid);

    int updateByExampleSelective(@Param("record") WmsImhitshelveslistLog record, @Param("example") WmsImhitshelveslistLogExample example);

    int updateByExample(@Param("record") WmsImhitshelveslistLog record, @Param("example") WmsImhitshelveslistLogExample example);

    int updateByPrimaryKeySelective(WmsImhitshelveslistLog record);

    int updateByPrimaryKey(WmsImhitshelveslistLog record);
}