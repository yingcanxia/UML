package cn.shadow.uml.factory.method.impl;


import cn.shadow.uml.factory.entity.Milk;
import cn.shadow.uml.factory.entity.instance.Mengniu;
import cn.shadow.uml.factory.method.MethodFactory;

public class MengniuFactory implements MethodFactory {

	@Override
	public Milk getmilk() {
		// TODO Auto-generated method stub
		return new Mengniu();
	}

}
