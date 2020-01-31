package cn.shadow.passport.impl;

import cn.shadow.msg.ResultMsg;
import cn.shadow.passport.SignInService;

public class LoginFromQQ implements SignInService{

	@Override
	public boolean support(Object adapter) {
		// TODO Auto-generated method stub
		return adapter instanceof LoginFromQQ;
	}

	@Override
	public ResultMsg regist(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMsg logic(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMsg login(String username, String password, Object clazz) {
		// TODO Auto-generated method stub
		return null;
	}

}
