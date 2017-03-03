package org.wrt.com;

import org.wrt.com.model.Request;
import org.wrt.com.model.Response;

public class HTMLFilter implements Filter {

	
	
	public void doFilter(Request req, Response resp, FilterChain fc) {
		
		System.out.println("------------HTMLFilter##########");
		
		resp.setResponseStr(req.getRequestStr().replaceAll("<", "[").replaceAll(">", "]"));
		fc.doFilter(req, resp, fc);
		System.out.println("##########HTMLFilter------------");
	}

}
