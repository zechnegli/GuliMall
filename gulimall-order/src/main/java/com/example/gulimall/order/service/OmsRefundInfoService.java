package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.order.entity.OmsRefundInfoEntity;

import java.util.Map;

/**
 * �˿���Ϣ
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:27:51
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

