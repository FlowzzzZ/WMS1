package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExcheck;
import cn.hhu.ssm.po.WmsExcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExcheckMapper {
    int countByExample(WmsExcheckExample example);

    int deleteByExample(WmsExcheckExample example);

    int deleteByPrimaryKey(Integer excheckId);

    int insert(WmsExcheck record);

    int insertSelective(WmsExcheck record);

    List<WmsExcheck> selectByExample(WmsExcheckExample example);

    WmsExcheck selectByPrimaryKey(Integer excheckId);

    int updateByExampleSelective(@Param("record") WmsExcheck record, @Param("example") WmsExcheckExample example);

    int updateByExample(@Param("record") WmsExcheck record, @Param("example") WmsExcheckExample example);

    int updateByPrimaryKeySelective(WmsExcheck record);

    int updateByPrimaryKey(WmsExcheck record);
}