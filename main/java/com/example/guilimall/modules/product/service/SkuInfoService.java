package com.example.guilimall.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.guilimall.common.utils.PageUtils;
import com.example.guilimall.modules.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku��Ϣ
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-25 19:26:36
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

