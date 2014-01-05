package com.mentor.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface Hello {
	public String hello(String h);
}
