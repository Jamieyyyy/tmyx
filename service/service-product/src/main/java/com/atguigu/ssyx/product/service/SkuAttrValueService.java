package com.atguigu.ssyx.product.service;

import com.atguigu.ssyx.model.product.SkuAttrValue;
import com.atguigu.ssyx.model.product.SkuImage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SkuAttrValueService extends IService<SkuAttrValue> {
    //根据id查询商品图片列表
    List<SkuAttrValue> getAttrValueListBySkuId(Long id);
}
