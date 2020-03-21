package cn.shadow.uml.adapter.passport.impl;


import cn.shadow.uml.adapter.msg.ResultMsg;
import cn.shadow.uml.adapter.passport.SignInService;

public class LoginFromQQ implements SignInService {

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
