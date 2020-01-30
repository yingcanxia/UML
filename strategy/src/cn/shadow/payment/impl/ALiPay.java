package cn.shadow.payment.impl;

import java.awt.SystemColor;
import java.math.BigDecimal;

import cn.shadow.payment.Payment;
import cn.shadow.util.PayStatus;

public class ALiPay implements Payment{

	@Override
	public PayStatus pay(String uid,BigDecimal money) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用支付宝");
		System.out.println("正在支付");
		PayStatus payStatus=new PayStatus("200", "支付成功");
		return payStatus;
	}

}
