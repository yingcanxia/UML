package cn.shadow.uml.builder.general;

public class Director {

	public static void main(String[] args) {
		IBuilder builder=new ConcreteBuilder();
		builder.build();
	}
}
