package com.example.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.ware.entity.OmsOrderReturnReasonEntity;

import java.util.Map;

/**
 * �˻�ԭ��
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-27 21:33:06
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

