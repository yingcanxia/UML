package cn.shadow.uml.adapter.app;


import cn.shadow.uml.adapter.passport.impl.SiginForThirdService;

public class App {
	public static void main(String[] args) {
		SiginForThirdService service=new SiginForThirdService();
		//当调取对应的需要的函数时
		//可以添加一层策略模式
		//service.loginForQQ("adawe");
		//适配器的需求时,在不改原来代码的情况下,兼容其他的项目
	}
}
