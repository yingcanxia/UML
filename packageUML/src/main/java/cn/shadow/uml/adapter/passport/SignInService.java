package cn.shadow.uml.adapter.passport;

import cn.shadow.uml.adapter.msg.ResultMsg;

/**
 * 方法行适配器有可能要跟策略模式一起使用
 * 别跟模板模式混淆，这个接口也是可有可无
 * @author notto
 *
 */
public interface SignInService {
	boolean support(Object adapter);
	ResultMsg regist(String username, String password);
	ResultMsg logic(String username, String password);
	ResultMsg login(String username, String password, Object clazz);
}
