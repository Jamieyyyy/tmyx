package com.atguigu.ssyx.product.mapper;

import com.atguigu.ssyx.model.product.SkuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuInfoMapper extends BaseMapper<SkuInfo> {

    void unlockStock(Long skuId, Integer skuNum);

    void minusStock(Long skuId, Integer skuNum);

    SkuInfo checkStock(Long skuId, Integer skuNum);

    Integer lockStock(Long skuId, Integer skuNum);
}
