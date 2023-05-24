package com.example.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ����������Ϣ
 * 
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:27:51
 */
@Data
@TableName("oms_order_setting")
public class OmsOrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ��ɱ������ʱ�ر�ʱ��(��)
	 */
	private Integer flashOrderOvertime;
	/**
	 * ����������ʱʱ��(��)
	 */
	private Integer normalOrderOvertime;
	/**
	 * �������Զ�ȷ���ջ�ʱ�䣨�죩
	 */
	private Integer confirmOvertime;
	/**
	 * �Զ���ɽ���ʱ�䣬���������˻����죩
	 */
	private Integer finishOvertime;
	/**
	 * ������ɺ��Զ�����ʱ�䣨�죩
	 */
	private Integer commentOvertime;
	/**
	 * ��Ա�ȼ���0-���޻�Ա�ȼ���ȫ��ͨ�ã�����-��Ӧ��������Ա�ȼ���
	 */
	private Integer memberLevel;

}
