package cn.shadow.uml.strategy.payment.impl;

import cn.shadow.uml.strategy.payment.Payment;
import cn.shadow.uml.strategy.util.PayStatus;

import java.math.BigDecimal;


public class WeChatPay implements Payment {

	@Override
	public PayStatus pay(String uid, BigDecimal money) {
		// TODO Auto-generated method stub
		
		
		System.out.println("欢迎使用微信支付");
		System.out.println("正在支付");
		PayStatus payStatus=new PayStatus("200", "支付成功");
		System.out.println("支付成功");
		return payStatus;
	}
}
