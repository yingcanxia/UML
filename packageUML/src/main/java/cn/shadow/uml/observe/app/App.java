package cn.shadow.uml.observe.app;


import cn.shadow.uml.observe.eventtype.EventTypeA;
import cn.shadow.uml.observe.listener.EventCallBack;

public class App {

	public static void main(String[] args) {
		EventCallBack callBack=new EventCallBack();
		Mouse mouse=new Mouse();
		mouse.addListener(EventTypeA.AAA, callBack);
		mouse.AAA();
	}
}
