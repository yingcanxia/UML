package cn.shadow.uml.strategy.util;

import cn.shadow.uml.strategy.payment.impl.ALiPay;
import cn.shadow.uml.strategy.payment.impl.WeChatPay;
import cn.shadow.uml.strategy.payment.Payment;

public enum PayType {
	ALiPay(new ALiPay()),
	WeChatPay(new WeChatPay());
	
	private Payment payment;
	PayType(Payment payment) {
		this.payment=payment;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
