package cn.shadow.uml.strategy.app;

import cn.shadow.uml.strategy.util.PayType;

import java.math.BigDecimal;


public class Test {

	public static void main(String[] args) {
		// 完美的解决了switch过程。不需要再代码中写switch了，更不需要去写ifelse
		Order order = new Order("123", "987465432", new BigDecimal(9816));
		order.pay(PayType.ALiPay.getPayment());
		// 设计模式是用于解决复杂问题的
		/* 在spring中有很多factory比如说beanfactory，listableFactory通常会与抽象工厂组合使用 */

	}

}
