package cn.shadow.uml.builder.simple;

public class Test {
	
	/**
	 * 主方法使用的普通建造模式
	 * @param args
	 */
	public static void main(String[] args) {
		CourseBuilder builder=new CourseBuilder();
		builder.addName("name");
		builder.addHomeWork("homewrok");
		builder.build();
	}
}
