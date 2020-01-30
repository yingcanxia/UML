package cn.shadow.entity.instance;

import cn.shadow.entity.Milk;

public class Mengniu implements Milk{
	@Override
	public String getname() {
		// TODO 获取当先牛奶的名称
		return "蒙牛";
	}
}
