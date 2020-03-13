package dmacc;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BookRepository;

@SpringBootApplication
public class SpringBooksApplication implements CommandLineRunner
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBooksApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book", Book.class);
		
		System.out.println(b.toString());
	}
	
	@Autowired
	BookRepository repo;

	@Override
	public void run(String... args) throws Exception
	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book bookA = appContext.getBean("book", Book.class);
		bookA.setCheckedOut(true);
		repo.save(bookA);
		
		String date = "1925-04-10";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate publicationDate = LocalDate.parse(date, formatter);
		Book bookB = new Book("The Great Gatsby", "F. Scott Fitzgerald", 813.52f, publicationDate, false);
		repo.save(bookB);
		
		List<Book> allBooks = repo.findAll();
		
		for(Book book : allBooks)
		{
			System.out.println(book.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
