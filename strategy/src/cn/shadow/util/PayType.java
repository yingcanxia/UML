package cn.shadow.util;

import cn.shadow.payment.Payment;
import cn.shadow.payment.impl.ALiPay;
import cn.shadow.payment.impl.WeChatPay;

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
