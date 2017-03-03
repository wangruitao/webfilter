package org.wrt.com;

import org.wrt.com.model.Request;
import org.wrt.com.model.Response;

public class Main {

	public static void main(String[] args) {
		
		Request req = new Request();
		req.setRequestStr("大家好，<html>，副院长，总局局长，国务委员，相信很多人都看过一部电影");
		Response resp = new Response();
		resp.setResponseStr("response啊啊啊");
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
		fc.doFilter(req, resp, fc);
		System.out.println(resp.getResponseStr());

	}

}
