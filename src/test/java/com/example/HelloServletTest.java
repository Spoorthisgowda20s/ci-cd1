package com.example;

import static org.mockito.Mockito.*;
import java.io.*;
import javax.servlet.http.*;
import org.junit.jupiter.api.Test;

public class HelloServletTest {
	
	@Test
	void testDoGet() throws Exception {

	HelloServlet s = new HelloServlet();
	HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
		
	StringWriter sw = new StringWriter();
	when(res.getWriter()).thenReturn(new PrintWriter(sw));

	s.doGet(req, res);

	assert(sw.toString().length() > 0);
	}
}
