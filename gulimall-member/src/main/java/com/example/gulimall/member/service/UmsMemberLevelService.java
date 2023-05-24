package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.UmsMemberLevelEntity;

import java.util.Map;

/**
 * ��Ա�ȼ�
 *
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:23:41
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

