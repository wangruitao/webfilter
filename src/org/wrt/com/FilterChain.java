package org.wrt.com;

import java.util.ArrayList;
import java.util.List;

import org.wrt.com.model.Request;
import org.wrt.com.model.Response;

public class FilterChain implements Filter {

	private List<Filter> filters = new ArrayList<Filter>();
	
	private int index=0;
	
	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	@Override
	public void doFilter(Request req, Response resp, FilterChain fc) {
		
		if(index == filters.size()) {
			return;
		}
		filters.get(index++).doFilter(req, resp, fc);
	}

}
