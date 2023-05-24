package com.example.gulimall.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.modules.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * ���Է���
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-25 23:01:19
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
