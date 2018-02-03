package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsImorder;
import cn.hhu.ssm.po.WmsImorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsImorderMapper {
    int countByExample(WmsImorderExample example);

    int deleteByExample(WmsImorderExample example);

    int deleteByPrimaryKey(Integer imorderId);

    int insert(WmsImorder record);

    int insertSelective(WmsImorder record);

    List<WmsImorder> selectByExample(WmsImorderExample example);

    WmsImorder selectByPrimaryKey(Integer imorderId);

    int updateByExampleSelective(@Param("record") WmsImorder record, @Param("example") WmsImorderExample example);

    int updateByExample(@Param("record") WmsImorder record, @Param("example") WmsImorderExample example);

    int updateByPrimaryKeySelective(WmsImorder record);

    int updateByPrimaryKey(WmsImorder record);
}