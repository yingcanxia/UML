package cn.shadow.passport;

import cn.shadow.entity.Member;
import cn.shadow.msg.ResultMsg;

public class SignService {

	public ResultMsg regist(String username, String password) {

		return new ResultMsg("200", "注册成功", new Member());
	}

	public ResultMsg logic(String username, String password) {
		return null;

	}
}
