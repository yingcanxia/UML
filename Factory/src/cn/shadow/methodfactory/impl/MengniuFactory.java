package cn.shadow.methodfactory.impl;

import cn.shadow.entity.Milk;
import cn.shadow.entity.instance.Mengniu;
import cn.shadow.methodfactory.MethodFactory;

public class MengniuFactory implements MethodFactory{

	@Override
	public Milk getmilk() {
		// TODO Auto-generated method stub
		return new Mengniu();
	}

}
