package cn.hhu.ssm.mapper;

import cn.hhu.ssm.po.WmsPickGoods;

public interface WmsPickGoodsMapper {
	WmsPickGoods SelectPickGoodsByGoodsId(Integer id);
}
