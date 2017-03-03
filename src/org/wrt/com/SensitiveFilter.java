package org.wrt.com;

import org.wrt.com.model.Request;
import org.wrt.com.model.Response;

public class SensitiveFilter implements Filter {

	public void doFilter(Request req, Response resp, FilterChain fc) {
		
		System.out.println("------------SensitiveFilter##########");
		
		resp.setResponseStr(req.getRequestStr().replaceAll("院长", "**").replaceAll("委员", "**"));
		fc.doFilter(req, resp, fc);
		System.out.println("##########SensitiveFilter------------");
	}

}
