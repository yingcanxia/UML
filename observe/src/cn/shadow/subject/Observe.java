package cn.shadow.subject;

import java.util.Observable;

import cn.shadow.event.Event;

public class Observe extends Observable{
	public void advice(Event e) {
		// 通知打出日志
		System.out.println("==========吃法事件===========\n" + e);

	}
}
