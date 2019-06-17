package com.movieadvisor.app;
import static java.lang.System.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.movieadvisor.services.MovieService;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		MovieService service = (MovieService) appContext.getBean("service");
		service.filterByGenre("Drama").forEach(out::println);
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
