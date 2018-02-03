package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsPickdetail;
import cn.hhu.ssm.po.WmsPickdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsPickdetailMapper {
    int countByExample(WmsPickdetailExample example);

    int deleteByExample(WmsPickdetailExample example);

    int deleteByPrimaryKey(Integer pickdetailId);

    int insert(WmsPickdetail record);

    int insertSelective(WmsPickdetail record);

    List<WmsPickdetail> selectByExample(WmsPickdetailExample example);

    WmsPickdetail selectByPrimaryKey(Integer pickdetailId);

    int updateByExampleSelective(@Param("record") WmsPickdetail record, @Param("example") WmsPickdetailExample example);

    int updateByExample(@Param("record") WmsPickdetail record, @Param("example") WmsPickdetailExample example);

    int updateByPrimaryKeySelective(WmsPickdetail record);

    int updateByPrimaryKey(WmsPickdetail record);
}