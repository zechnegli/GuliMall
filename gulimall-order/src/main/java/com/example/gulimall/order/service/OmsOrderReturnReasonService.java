package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.order.entity.OmsOrderReturnReasonEntity;

import java.util.Map;

/**
 * �˻�ԭ��
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:27:51
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

