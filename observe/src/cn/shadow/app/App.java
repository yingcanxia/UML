package cn.shadow.app;

import cn.shadow.eventtype.EventTypeA;
import cn.shadow.listener.EventCallBack;

public class App {

	public static void main(String[] args) {
		EventCallBack callBack=new EventCallBack();
		Mouse mouse=new Mouse();
		mouse.addListener(EventTypeA.AAA, callBack);
		mouse.AAA();
	}
}
