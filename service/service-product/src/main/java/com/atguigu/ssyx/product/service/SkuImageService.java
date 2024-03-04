package com.atguigu.ssyx.product.service;

import com.atguigu.ssyx.model.product.SkuImage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SkuImageService extends IService<SkuImage> {
    List<SkuImage> getImageListBySkuId(Long id);
}
