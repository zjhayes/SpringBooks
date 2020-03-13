package dmacc.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Book;

@Configuration
public class BeanConfiguration
{
	@Bean
	public Book book()
	{
		Book bean = new Book();
		bean.setTitle("The Catcher in the Rye");
		bean.setAuthor("J.D. Salinger");
		bean.setDeweyDecimal(813.54f);
		String date = "1951-07-16";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate publicationDate = LocalDate.parse(date, formatter); // 7-16-1951
		bean.setPublicationDate(publicationDate);
		return bean;
	}
}
