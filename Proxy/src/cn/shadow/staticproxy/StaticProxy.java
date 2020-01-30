package cn.shadow.staticproxy;

import cn.shadow.entity.Person;

public class StaticProxy {
	// 本代理类为静态代理代理一直代码
	// 通过MyProxy代理类为一直的person进行代理
	// 业务不断亏站会有更多代码需要手写
	private Person p1;

	public StaticProxy(Person p1) {
		this.p1 = p1;
	}

	public void findLove() {
		// 获取需求
		System.out.println("获取需求");
		this.p1.findLove();
		System.out.println("执行完成");
	}
}
