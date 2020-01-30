package cn.shadow.payment.impl;

import java.math.BigDecimal;

import cn.shadow.payment.Payment;
import cn.shadow.util.PayStatus;

public class WeChatPay implements Payment{

	@Override
	public PayStatus pay(String uid,BigDecimal money) {
		// TODO Auto-generated method stub
		
		
		System.out.println("欢迎使用微信支付");
		System.out.println("正在支付");
		PayStatus payStatus=new PayStatus("200", "支付成功");
		System.out.println("支付成功");
		return payStatus;
	}
}
