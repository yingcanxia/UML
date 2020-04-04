package cn.shadow.uml.factory.abfactory;


import cn.shadow.uml.factory.entity.Milk;
import cn.shadow.uml.factory.entity.instance.Mengniu;
import cn.shadow.uml.factory.entity.instance.Telunsu;

public class AbstractFactoryImpl extends AbstractFactory{
	@Override
	public Milk getMengniu() {
		return new Mengniu();
	}
	@Override
	public Milk getTelunsu() {
		return new Telunsu();
	}
}
