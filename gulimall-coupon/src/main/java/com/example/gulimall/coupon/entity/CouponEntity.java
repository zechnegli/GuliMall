package com.example.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * �Ż�ȯ��Ϣ
 * 
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:05:02
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �Żݾ�����[0->ȫ����ȯ��1->��Ա��ȯ��2->������ȯ��3->ע����ȯ]
	 */
	private Integer couponType;
	/**
	 * �Ż�ȯͼƬ
	 */
	private String couponImg;
	/**
	 * �Żݾ�����
	 */
	private String couponName;
	/**
	 * ����
	 */
	private Integer num;
	/**
	 * ���
	 */
	private BigDecimal amount;
	/**
	 * ÿ����������
	 */
	private Integer perLimit;
	/**
	 * ʹ���ż�
	 */
	private BigDecimal minPoint;
	/**
	 * ��ʼʱ��
	 */
	private Date startTime;
	/**
	 * ����ʱ��
	 */
	private Date endTime;
	/**
	 * ʹ������[0->ȫ��ͨ�ã�1->ָ�����ࣻ2->ָ����Ʒ]
	 */
	private Integer useType;
	/**
	 * ��ע
	 */
	private String note;
	/**
	 * ��������
	 */
	private Integer publishCount;
	/**
	 * ��ʹ������
	 */
	private Integer useCount;
	/**
	 * ��ȡ����
	 */
	private Integer receiveCount;
	/**
	 * ������ȡ�Ŀ�ʼ����
	 */
	private Date enableStartTime;
	/**
	 * ������ȡ�Ľ�������
	 */
	private Date enableEndTime;
	/**
	 * �Ż���
	 */
	private String code;
	/**
	 * ������ȡ�Ļ�Ա�ȼ�[0->���޵ȼ�������-��Ӧ�ȼ�]
	 */
	private Integer memberLevel;
	/**
	 * ����״̬[0-δ������1-�ѷ���]
	 */
	private Integer publish;

}
