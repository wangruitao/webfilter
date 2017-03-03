package org.wrt.com;

import org.wrt.com.model.Request;
import org.wrt.com.model.Response;

public interface Filter {

	public void doFilter(Request req, Response resp, FilterChain fc);
}
