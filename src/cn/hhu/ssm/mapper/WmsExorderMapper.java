package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExorder;
import cn.hhu.ssm.po.WmsExorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExorderMapper {
    int countByExample(WmsExorderExample example);

    int deleteByExample(WmsExorderExample example);

    int deleteByPrimaryKey(Integer exorderId);

    int insert(WmsExorder record);

    int insertSelective(WmsExorder record);

    List<WmsExorder> selectByExample(WmsExorderExample example);

    WmsExorder selectByPrimaryKey(Integer exorderId);

    int updateByExampleSelective(@Param("record") WmsExorder record, @Param("example") WmsExorderExample example);

    int updateByExample(@Param("record") WmsExorder record, @Param("example") WmsExorderExample example);

    int updateByPrimaryKeySelective(WmsExorder record);

    int updateByPrimaryKey(WmsExorder record);
    
    //查询出库单编号，客户名称，出库日期查询出库单
    List<WmsExorder> selectExordersByExample(WmsExorderExample example);
    
}