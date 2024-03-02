package com.atguigu.ssyx.sys.mapper;

import com.atguigu.ssyx.model.sys.RegionWare;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface RegionWareMapper {
    IPage<RegionWare> selectPage(Page<RegionWare> pageParam, LambdaQueryWrapper<RegionWare> wrapper);

    Integer selectCount(LambdaQueryWrapper<RegionWare> queryWrapper);

    void updateById(RegionWare regionWare);

    RegionWare selectById(Long id);

    void insert(RegionWare regionWare);
}
