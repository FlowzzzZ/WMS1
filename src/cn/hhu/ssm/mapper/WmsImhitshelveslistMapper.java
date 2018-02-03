package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImhitshelveslist;
import cn.hhu.ssm.po.WmsImhitshelveslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImhitshelveslistMapper {
    int countByExample(WmsImhitshelveslistExample example);

    int deleteByExample(WmsImhitshelveslistExample example);

    int deleteByPrimaryKey(Integer imhitshelveslistsId);

    int insert(WmsImhitshelveslist record);

    int insertSelective(WmsImhitshelveslist record);

    List<WmsImhitshelveslist> selectByExample(WmsImhitshelveslistExample example);

    WmsImhitshelveslist selectByPrimaryKey(Integer imhitshelveslistsId);

    int updateByExampleSelective(@Param("record") WmsImhitshelveslist record, @Param("example") WmsImhitshelveslistExample example);

    int updateByExample(@Param("record") WmsImhitshelveslist record, @Param("example") WmsImhitshelveslistExample example);

    int updateByPrimaryKeySelective(WmsImhitshelveslist record);

    int updateByPrimaryKey(WmsImhitshelveslist record);
}