package cn.shadow.uml.strategy.payment;

import cn.shadow.uml.strategy.util.PayStatus;

import java.math.BigDecimal;


public interface Payment {
	public PayStatus pay(String uid, BigDecimal money);
}
