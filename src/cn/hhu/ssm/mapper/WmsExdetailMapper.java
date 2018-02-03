package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.po.WmsExdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsExdetailMapper {
    int countByExample(WmsExdetailExample example);

    int deleteByExample(WmsExdetailExample example);

    int deleteByPrimaryKey(Integer exdetailId);

    int insert(WmsExdetail record);

    int insertSelective(WmsExdetail record);

    List<WmsExdetail> selectByExample(WmsExdetailExample example);

    WmsExdetail selectByPrimaryKey(Integer exdetailId);

    int updateByExampleSelective(@Param("record") WmsExdetail record, @Param("example") WmsExdetailExample example);

    int updateByExample(@Param("record") WmsExdetail record, @Param("example") WmsExdetailExample example);

    int updateByPrimaryKeySelective(WmsExdetail record);

    int updateByPrimaryKey(WmsExdetail record);
}