package cn.shadow.app;

import cn.shadow.dynamicproxy.JdkLoveProxy;
import cn.shadow.entity.Person;
import cn.shadow.entity.instance.Canying;
import cn.shadow.entity.instance.Xiaodi;
import cn.shadow.staticproxy.StaticProxy;

public class App {

	public static void main(String[] args) {
		/* 静态代理部分 
		 * StaticProxy类是代理类，相当于staticProxy是person的乙方
		 * StaticProxy必须持有被代理类
		 */
		
		Person p1=new Xiaodi(); StaticProxy proxy=new StaticProxy(p1);
		proxy.findLove();
		/*
		 * 动态代理部分
		 */
		try {
			Person p2=(Person)new JdkLoveProxy().getInstance(new Canying());
			
			p2.findJob();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
