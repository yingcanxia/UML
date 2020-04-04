package cn.shadow.uml.observe.listener;

import cn.shadow.uml.observe.event.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class EventListener {

	protected Map<String, Event> events =new HashMap<String,Event>();
	
	public void addListener (String eventType,Object target) {
		try {
			this.addListener(eventType, target, target.getClass().getMethod("on"+eventType,Event.class));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public void addListener (String eventType,Object target,Method callback) {
		events.put(eventType, new Event(target, callback));
	}
	private void trigger(Event event) {
		event.setSource(this);
		event.setTime(System.currentTimeMillis());
		try {
			event.getCallback().invoke(event.getTarget(), event);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	protected void trigger(String trigger) {
		if(!this.events.containsKey(trigger)) {
			return;
		}
		trigger(this.events.get(trigger).setTrigger(trigger));
	}
}
