package dmacc.controller;

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
		return bean;
	}
}
