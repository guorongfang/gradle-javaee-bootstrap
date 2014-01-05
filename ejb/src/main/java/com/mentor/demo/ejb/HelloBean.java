package com.mentor.demo.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName = "Hello3")
public class HelloBean implements Hello {

	public String hello(String name) {
		return "Hello  " + name + "  !";
	}
}
