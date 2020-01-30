package cn.shadow.entity.instance;

import cn.shadow.entity.Person;

public class Canying implements Person{

	@Override
	public void findLove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findJob() {
		// TODO Auto-generated method stub
		eat();
		System.out.println("这是找工作方法");
	}

	@Override
	public void buyTicket() {
		// TODO Auto-generated method stub
		
	}
	
	public void eat() {
		System.out.println("我在吃饭");
	}

}
