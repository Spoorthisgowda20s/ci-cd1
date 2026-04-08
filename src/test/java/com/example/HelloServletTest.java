package com.example;

import static org.mockito.Mockito.*;
import java.io.*;
import org.junit.jupiter.api.Test;
import javax.servlet.http.*;

public class HelloServletTest {
	
	@Test
	void testDoGet() throws Exception {

	HttpServlet s = new HttpServlet();
	HttpServletResponse res = mock(HttpServletResponse.class);
	HttpServletRequest req = mock(HttpServletRequest.class);

	StringWriter sw = new StringWriter();
	when(res.getWriter()).thenReturn(new PrintWriter(sw));

	s.doGet(req, res);

	assert(sw.toString().length() > 0);
	}
}
