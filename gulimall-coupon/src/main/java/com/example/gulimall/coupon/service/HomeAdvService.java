package com.example.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * ��ҳ�ֲ����
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:05:02
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

