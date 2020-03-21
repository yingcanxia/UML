package cn.shadow.uml.strategy.util;

public class PayStatus {
	private String code;
	private Object data;
	private String msg;
	
	public PayStatus(String code,String msg) {
		// TODO Auto-generated constructor stub
		this.code=code;
		this.msg=msg;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
