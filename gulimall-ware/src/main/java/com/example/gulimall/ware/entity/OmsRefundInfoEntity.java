package com.example.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * �˿���Ϣ
 * 
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-27 21:33:06
 */
@Data
@TableName("oms_refund_info")
public class OmsRefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �˿�Ķ���
	 */
	private Long orderReturnId;
	/**
	 * �˿���
	 */
	private BigDecimal refund;
	/**
	 * �˿����ˮ��
	 */
	private String refundSn;
	/**
	 * �˿�״̬
	 */
	private Integer refundStatus;
	/**
	 * �˿�����[1-֧������2-΢�ţ�3-������4-���]
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
