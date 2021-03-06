package org.javastack.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 42L;
	private static final byte[] OK = "OK\r\n".getBytes();

	@Override
	protected void service(final HttpServletRequest req, final HttpServletResponse res) //
			throws ServletException, IOException {
		res.setHeader("Pragma", "no-cache");
		res.setHeader("Cache-Control", "private, no-cache, no-store, must-revalidate");
		res.setContentLength(OK.length);
		res.setContentType("text/plain");
		res.setCharacterEncoding("ISO-8859-1");
		final ServletOutputStream out = res.getOutputStream();
		out.write(OK);
		out.flush();
	}
}
