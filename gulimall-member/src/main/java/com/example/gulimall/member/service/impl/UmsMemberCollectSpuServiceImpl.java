package com.example.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;

import com.example.gulimall.member.dao.UmsMemberCollectSpuDao;
import com.example.gulimall.member.entity.UmsMemberCollectSpuEntity;
import com.example.gulimall.member.service.UmsMemberCollectSpuService;


@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpuEntity> implements UmsMemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberCollectSpuEntity> page = this.page(
                new Query<UmsMemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<UmsMemberCollectSpuEntity>()
        );

        return new PageUtils(page);
    }

}