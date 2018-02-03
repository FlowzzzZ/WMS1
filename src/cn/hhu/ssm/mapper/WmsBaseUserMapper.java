package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsBaseUser;
import cn.hhu.ssm.po.WmsBaseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsBaseUserMapper {
    int countByExample(WmsBaseUserExample example);

    int deleteByExample(WmsBaseUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(WmsBaseUser record);

    int insertSelective(WmsBaseUser record);

    List<WmsBaseUser> selectByExample(WmsBaseUserExample example);

    WmsBaseUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") WmsBaseUser record, @Param("example") WmsBaseUserExample example);

    int updateByExample(@Param("record") WmsBaseUser record, @Param("example") WmsBaseUserExample example);

    int updateByPrimaryKeySelective(WmsBaseUser record);

    int updateByPrimaryKey(WmsBaseUser record);
}