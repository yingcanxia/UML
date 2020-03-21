package cn.shadow.uml.factory.simple;


import cn.shadow.uml.factory.entity.Milk;
import cn.shadow.uml.factory.entity.instance.Mengniu;
import cn.shadow.uml.factory.entity.instance.Telunsu;

public class SimpleFactory {
	public Milk getMilk(String name) {
		if("蒙牛".equals(name)) {
			return new Mengniu();
		}else if("特仑苏".equals(name)) {
			return new Telunsu();
		}else {
			return null;
		}
	}
}
