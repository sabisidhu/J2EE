package org.sabi.action;
import org.sabi.service.bean;

public class act {
	private String a;
	private String b;
	private String c;
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String execute() {
bean obj = new bean();
 setA(obj.getBean(b));
System.out.println(c);
		return a;
	}

}
