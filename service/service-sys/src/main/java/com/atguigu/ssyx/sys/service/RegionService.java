package com.atguigu.ssyx.sys.service;

import com.atguigu.ssyx.model.sys.Region;

import java.util.List;

public interface RegionService {
    //根据关键字获取地区列表
    List<Region> findRegionByKeyword(String keyword);

}
