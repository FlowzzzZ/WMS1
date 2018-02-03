package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExhistory;
import cn.hhu.ssm.po.WmsExhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExhistoryMapper {
    int countByExample(WmsExhistoryExample example);

    int deleteByExample(WmsExhistoryExample example);

    int deleteByPrimaryKey(Integer exhistoryId);

    int insert(WmsExhistory record);

    int insertSelective(WmsExhistory record);

    List<WmsExhistory> selectByExample(WmsExhistoryExample example);

    WmsExhistory selectByPrimaryKey(Integer exhistoryId);

    int updateByExampleSelective(@Param("record") WmsExhistory record, @Param("example") WmsExhistoryExample example);

    int updateByExample(@Param("record") WmsExhistory record, @Param("example") WmsExhistoryExample example);

    int updateByPrimaryKeySelective(WmsExhistory record);

    int updateByPrimaryKey(WmsExhistory record);
}