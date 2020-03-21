package cn.shadow.uml.observe.app;


import cn.shadow.uml.observe.eventtype.EventTypeA;
import cn.shadow.uml.observe.listener.EventListener;

public class Mouse extends EventListener {
	public void AAA() {
		System.out.println("测试AAA事件");
		this.trigger(EventTypeA.AAA);
	}
}
