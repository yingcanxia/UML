package cn.shadow.abFactory;

import cn.shadow.entity.Milk;
import cn.shadow.entity.instance.Mengniu;
import cn.shadow.entity.instance.Telunsu;

public class AbstractFactoryImpl extends AbstractFactory{
	@Override
	public Milk getMengniu() {
		// TODO Auto-generated method stub
		return new Mengniu();
	}
	@Override
	public Milk getTelunsu() {
		// TODO Auto-generated method stub
		return new Telunsu();
	}
}
