package cn.shadow.listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import cn.shadow.event.Event;

public class EventListener {

	protected Map<String,Event> events =new HashMap<String,Event>();
	
	public void addListener (String eventType,Object target) {
		try {
			this.addListener(eventType, target, target.getClass().getMethod("on"+eventType,Event.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
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
