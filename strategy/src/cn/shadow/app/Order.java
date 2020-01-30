package cn.shadow.app;

import java.math.BigDecimal;

import cn.shadow.payment.Payment;
import cn.shadow.util.PayStatus;

public class Order {
	private String uid;
	private String orderId;
	private BigDecimal money;
	
	
	public Order(String uid,String orderId,BigDecimal money) {
		this.uid=uid;
		this.orderId=orderId;
		this.money=money;
	}
	
	public PayStatus pay(Payment payment) {
		return payment.pay(uid, money);
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	
	
	
}
