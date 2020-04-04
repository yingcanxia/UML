package cn.shadow.uml.proxy.entity.instance;


import cn.shadow.uml.proxy.entity.Person;

public class Canying implements Person {

	@Override
	public void findLove() {

	}

	@Override
	public void findJob() {
		eat();
		System.out.println("这是找工作方法");
	}

	@Override
	public void buyTicket() {

	}
	
	public void eat() {
		System.out.println("我在吃饭");
	}

}
