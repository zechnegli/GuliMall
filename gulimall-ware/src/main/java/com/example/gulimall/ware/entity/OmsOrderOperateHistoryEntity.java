package com.example.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ����������ʷ��¼
 * 
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-27 21:33:06
 */
@Data
@TableName("oms_order_operate_history")
public class OmsOrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ����id
	 */
	private Long orderId;
	/**
	 * ������[�û���ϵͳ����̨����Ա]
	 */
	private String operateMan;
	/**
	 * ����ʱ��
	 */
	private Date createTime;
	/**
	 * ����״̬��0->�����1->��������2->�ѷ�����3->����ɣ�4->�ѹرգ�5->��Ч������
	 */
	private Integer orderStatus;
	/**
	 * ��ע
	 */
	private String note;

}
