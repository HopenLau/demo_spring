package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.User;

public class TestServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config;

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// 1. 加载Spring配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. 得到配置创建的对象
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("This is your first Servlet!");
		out.println("</body></html>");
		out.flush();
		out.close();
	}

	public void destroy() {
	}

}