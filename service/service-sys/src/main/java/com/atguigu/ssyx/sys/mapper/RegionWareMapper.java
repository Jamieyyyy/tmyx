package com.atguigu.ssyx.sys.mapper;

import com.atguigu.ssyx.model.sys.RegionWare;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionWareMapper extends BaseMapper<RegionWare> {

}
