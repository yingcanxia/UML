package cn.shadow.passport.impl;

import cn.shadow.msg.ResultMsg;
import cn.shadow.passport.SignService;

public class SiginForThirdService extends SignService {
	public ResultMsg loginForQQ(String id) {
		ResultMsg msg = super.regist(id, null);
		msg = super.logic(id, null);
		return msg;

	}

	public ResultMsg loginForWeChat(String id) {
		return null;

	}

	public ResultMsg loginForToken(String token) {
		return null;

	}

	public ResultMsg loginForPhone(String phoneNum, String code) {
		return null;

	}

	public ResultMsg loginForRegist(String username, String password) {
		ResultMsg msg = super.regist(username, password);
		return super.logic(username, password);
	}
}
