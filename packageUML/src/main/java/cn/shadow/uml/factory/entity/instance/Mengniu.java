package cn.shadow.uml.factory.entity.instance;


import cn.shadow.uml.factory.entity.Milk;

public class Mengniu implements Milk {
	@Override
	public String getname() {
		return "蒙牛";
	}
}
