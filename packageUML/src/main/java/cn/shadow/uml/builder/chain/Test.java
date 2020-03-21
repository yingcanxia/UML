package cn.shadow.uml.builder.chain;

public class Test {
	/**
	 * 这里已经开始使用链式创建模式
	 * 定制化过程但是结果是一致的
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CourseBuilder builder=new CourseBuilder();
		builder.addName("name").addPPT("ppt");
		builder.build();
	}
}
