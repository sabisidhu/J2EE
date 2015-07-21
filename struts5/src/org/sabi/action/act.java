package org.sabi.action;
import org.sabi.service.*;

public class act {
	public String execute() {
bean obj = new bean();
String a = obj.getBean();
System.out.println(a);
		return "Success";
	}

}
