package cn.shadow.event;

import java.lang.reflect.Method;

public class Event {

	// 事件源,时间是由谁发起的
	private Object source;
	// 要通知谁
	private Object target;
	// 事件出发要做什么动作；回调
	private Method callback;
	// 事件名称
	private String trigger;
	// 事件触发的时间
	private long time;

	
	public long getTime() {
		return time;
	}

	public Event setTime(long time) {
		this.time = time;
		return this;
	}

	public Event setSource(Object source) {
		this.source = source;
		return this;
	}

	public Event(Object target, Method callback) {
		this.target = target;
		this.callback = callback;
	}

	public Object getSource() {
		return source;
	}

	public Object getTarget() {
		return target;
	}

	public Method getCallback() {
		return callback;
	}

	
	public Event setTrigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	public String getTrigger() {
		return trigger;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Event{\n" + "source=" + source + ",\n" + "target=" + target + ",\n" + "callback=" + callback + ",\n"
				+ "trigger=" + trigger + "}";
	}

}
