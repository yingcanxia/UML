package cn.shadow.uml.observe.subject;

import cn.shadow.uml.observe.event.Event;

import java.util.Observable;


public class Observe extends Observable{
	public void advice(Event e) {
		// 通知打出日志
		System.out.println("==========吃法事件===========\n" + e);

	}
}
