package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * �����˻�����
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:27:50
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

