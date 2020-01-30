package cn.shadow.app;

import cn.shadow.abFactory.AbstractFactory;
import cn.shadow.abFactory.AbstractFactoryImpl;
import cn.shadow.entity.Milk;
import cn.shadow.methodfactory.MethodFactory;
import cn.shadow.methodfactory.impl.MengniuFactory;
import cn.shadow.simplefactory.SimpleFactory;

public class Main {

	public static void main(String[] args) {
		//这里是简单工厂输入蒙牛就是蒙牛，输入特仑苏就是特仑苏
		SimpleFactory factory=new SimpleFactory();
		Milk milk=factory.getMilk("蒙牛");
		//此处利用了java的多态使用抽象方法工厂
		//MengniuFactory实现接口MethodFactory。生产出蒙牛的类，当我有一个任务然后指定有哪个工厂完成我的需求
		MethodFactory factoryB=new MengniuFactory();
		Milk milkB=factoryB.getmilk();
		//抽象工厂，每增加一个新的类，就需要新增一个方法需要修改抽象类或接口和对应的实现类
		AbstractFactory factoryC=new AbstractFactoryImpl();
		factoryC.getMengniu();
		factoryC.getTelunsu();
	}

}
