package cn.shadow.payment;

import java.math.BigDecimal;

import cn.shadow.util.PayStatus;

public interface Payment {
	public PayStatus pay(String uid,BigDecimal money);
}
