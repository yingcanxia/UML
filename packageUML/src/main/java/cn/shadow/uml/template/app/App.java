package cn.shadow.uml.template.app;


import cn.shadow.uml.template.dao.MemberDAO;

public class App {

	public static void main(String[] args) {
		// 本次的场景是查询数据库然后通过传的值将从数据库中查询的数据转化为我指定的累
		// 查询的步骤是完全不变的，变的是具体接收对象
		// 以后有机会修改的话要加上具体传入的对象
		MemberDAO dao=new MemberDAO();
		dao.query();
	}

}
