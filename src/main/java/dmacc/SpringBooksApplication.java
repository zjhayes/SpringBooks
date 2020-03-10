package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class SpringBooksApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBooksApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book", Book.class);
		
		System.out.println(b.toString());
	}

}
