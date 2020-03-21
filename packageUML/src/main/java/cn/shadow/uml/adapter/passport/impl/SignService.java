package cn.shadow.uml.adapter.passport.impl;


import cn.shadow.uml.adapter.entity.Member;
import cn.shadow.uml.adapter.msg.ResultMsg;

/**
 * 可以继承也可以使用接口来实现但是该类最好设置成抽象类
 * 该类主要是适应那种老系统，老系统已经完成了登录注册的相关内容
 * @author notto
 *
 */
public class SignService {

	public ResultMsg regist(String username, String password) {

		return new ResultMsg("200", "注册成功", new Member());
	}

	public ResultMsg logic(String username, String password) {
		return null;

	}
}
