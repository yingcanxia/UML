package cn.shadow.uml.adapter.passport.impl;


import cn.shadow.uml.adapter.msg.ResultMsg;
import cn.shadow.uml.adapter.passport.SignInService;

public class SiginForThirdService extends SignService {
	public ResultMsg loginForQQ(String id) {
		/*
		 * ResultMsg msg = super.regist(id, null); msg = super.logic(id, null); return
		 * msg;
		 */
		//适配器不一定要实现接口
		/*
		 * SignInService adapter=new LoginFromQQ(); if(adapter.support(adapter)) {
		 * return adapter.logic(id, null); } return null;
		 */
		return processLogin(id, LoginFromQQ.class);
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
	private ResultMsg processLogin(String key,Class<? extends SignInService> clazz) {
		try {
			SignInService adapter=clazz.newInstance();
			if(adapter.support(adapter)) {
				return adapter.logic(key, null);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
