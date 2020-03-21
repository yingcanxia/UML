package cn.shadow.uml.observe.subject;

public class Subject {

	// 通常采用动态代理
	// 避免代码侵入

	public void add() {
		System.out.println("调用一个添加的方法");
	}

	public void remove() {
		System.out.println("调用删除方法");
	}
}
