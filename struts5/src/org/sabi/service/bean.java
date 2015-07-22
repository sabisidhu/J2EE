package org.sabi.service;

public class bean {

	public String getBean(String in) {
		if (in.equals("result")) {
			return "result page";
		} else if (in.equals("syllabus")) {
			return "syllabus page";
		} else {
			return "not avail";
		}

	}
}
