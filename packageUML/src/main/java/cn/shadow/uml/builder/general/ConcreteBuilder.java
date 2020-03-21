package cn.shadow.uml.builder.general;

public class ConcreteBuilder implements IBuilder{

	private Product product=new Product();
	@Override
	public Product build() {
		// TODO Auto-generated method stub
		return product;
	}

}
