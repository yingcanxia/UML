package cn.shadow.uml.proxy.dynamicproxy;

import cn.shadow.uml.proxy.entity.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JdkLoveProxy implements InvocationHandler {
	// 被代理的对象并将其白保存在target中
	// 本类为jdk动态代理
	// 本变量必须为借口
	private Person target;

	public Object getInstance(Person p1) throws Exception {
		target = p1;
		Class<?> clazz = target.getClass();
		// 由字节码重组充足实现
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("媒婆A已经拿到需求");
		System.out.println("开始无得");
		method.invoke(this.target, args);
		System.out.println("执行之后");
		return null;
	}


}
