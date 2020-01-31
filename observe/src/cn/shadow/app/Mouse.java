package cn.shadow.app;

import cn.shadow.eventtype.EventTypeA;
import cn.shadow.listener.EventListener;

public class Mouse extends EventListener{
	public void AAA() {
		System.out.println("测试AAA事件");
		this.trigger(EventTypeA.AAA);
	}
}
