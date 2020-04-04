package cn.shadow.uml.proxy.entity.instance;


import cn.shadow.uml.proxy.entity.Person;

public class Xiaodi implements Person {

	@Override
	public void findLove() {
		System.out.println("要求A");
		System.out.println("要求B");
		System.out.println("要求C");
	}

	@Override
	public void findJob() {
		System.out.println("这是找工作方法");
	}

	@Override
	public void buyTicket() {

	}

}
