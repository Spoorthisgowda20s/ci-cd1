package com.example;

import static org.mockito.Mockito.*;
import java.io.*;
import javax.io.IOException;
import javax.servlet.http.*;

@void testDoGet() throws Exception {

	HttpServlet s = new HttpServlet();
	HttpServletResponse res = mock(HttpServletResponse.class);

	StringWriter sw = new StringWriter();
	when(res.getWriter())thenReturn(new PrintWriter(sw));

	s.doGet(res, res);

	assert(sw.toString().length() > 0);