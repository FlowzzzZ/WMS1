package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsRoledefinitionLog;
import cn.hhu.ssm.po.WmsRoledefinitionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsRoledefinitionLogMapper {
    int countByExample(WmsRoledefinitionLogExample example);

    int deleteByExample(WmsRoledefinitionLogExample example);

    int deleteByPrimaryKey(Integer roleLogid);

    int insert(WmsRoledefinitionLog record);

    int insertSelective(WmsRoledefinitionLog record);

    List<WmsRoledefinitionLog> selectByExample(WmsRoledefinitionLogExample example);

    WmsRoledefinitionLog selectByPrimaryKey(Integer roleLogid);

    int updateByExampleSelective(@Param("record") WmsRoledefinitionLog record, @Param("example") WmsRoledefinitionLogExample example);

    int updateByExample(@Param("record") WmsRoledefinitionLog record, @Param("example") WmsRoledefinitionLogExample example);

    int updateByPrimaryKeySelective(WmsRoledefinitionLog record);

    int updateByPrimaryKey(WmsRoledefinitionLog record);
}