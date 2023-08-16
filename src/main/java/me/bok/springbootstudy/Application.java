package me.bok.springbootstudy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import me.bok.Holoman;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*
		SpringApplication application = new SpringApplication(Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		*/
		/*
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		tomcat.getConnector();
		Context context = tomcat.addContext("/", "/");
		HttpServlet servlet = new HttpServlet() {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
				PrintWriter writer = resp.getWriter();
				writer.println("<html><head><title>");
				writer.println("Hello,tomcat");
				writer.println("</title></head>");
				writer.println("<body><h1>Hello, world</h1></body>");
				writer.println("</html>");
			}
		};

		String servletName = "helloServlet";
		tomcat.addServlet("/",servletName, servlet);
		context.addServletMappingDecoded("/hello", servletName);
		tomcat.start();
		tomcat.getServer().await();

		 */
	}

	/*
	@Bean
	public Holoman holoman() {
		Holoman holoman = new Holoman();
		holoman.setName("whiteShip");
		holoman.setHowLong(60);
		return holoman;
	}

	 */

}
