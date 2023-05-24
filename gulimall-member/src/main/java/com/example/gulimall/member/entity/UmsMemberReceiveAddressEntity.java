package com.example.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ա�ջ���ַ
 * 
 * @author chenshun
 * @email zechengli1997@gmail.com
 * @date 2023-04-26 21:23:41
 */
@Data
@TableName("ums_member_receive_address")
public class UmsMemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * �ջ�������
	 */
	private String name;
	/**
	 * �绰
	 */
	private String phone;
	/**
	 * ��������
	 */
	private String postCode;
	/**
	 * ʡ��/ֱϽ��
	 */
	private String province;
	/**
	 * ����
	 */
	private String city;
	/**
	 * ��
	 */
	private String region;
	/**
	 * ��ϸ��ַ(�ֵ�)
	 */
	private String detailAddress;
	/**
	 * ʡ��������
	 */
	private String areacode;
	/**
	 * �Ƿ�Ĭ��
	 */
	private Integer defaultStatus;

}
