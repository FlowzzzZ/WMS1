package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsRoledefinition;
import cn.hhu.ssm.po.WmsRoledefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsRoledefinitionMapper {
    int countByExample(WmsRoledefinitionExample example);

    int deleteByExample(WmsRoledefinitionExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(WmsRoledefinition record);

    int insertSelective(WmsRoledefinition record);

    List<WmsRoledefinition> selectByExample(WmsRoledefinitionExample example);

    WmsRoledefinition selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") WmsRoledefinition record, @Param("example") WmsRoledefinitionExample example);

    int updateByExample(@Param("record") WmsRoledefinition record, @Param("example") WmsRoledefinitionExample example);

    int updateByPrimaryKeySelective(WmsRoledefinition record);

    int updateByPrimaryKey(WmsRoledefinition record);
}