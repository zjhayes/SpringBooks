package dmacc.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String author;
	private float deweyDecimal;
	private LocalDate publicationDate;
	private boolean isCheckedOut = false;
	
	public Book() 
	{
		super();
	}
	
	public Book(String title)
	{
		super();
		this.title = title;
	}
	
	public Book(String title, String author, float deweyDecimal, LocalDate publicationDate, boolean isCheckedOut)
	{
		super();
		this.title = title;
		this.author = author;
		this.deweyDecimal = deweyDecimal;
		this.publicationDate = publicationDate;
		this.isCheckedOut = isCheckedOut;
	}
	
	public Book(long id, String title, String author, float deweyDecimal, LocalDate publicationDate, boolean isCheckedOut)
	{
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.deweyDecimal = deweyDecimal;
		this.publicationDate = publicationDate;
		this.isCheckedOut = isCheckedOut;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public float getDeweyDecimal()
	{
		return deweyDecimal;
	}

	public void setDeweyDecimal(float deweyDecimal)
	{
		this.deweyDecimal = deweyDecimal;
	}

	public LocalDate getPublicationDate()
	{
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate)
	{
		this.publicationDate = publicationDate;
	}

	public boolean isCheckedOut()
	{
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut)
	{
		this.isCheckedOut = isCheckedOut;
	}

	@Override
	public String toString()
	{
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", deweyDecimal=" + deweyDecimal
				+ ", publicationDate=" + publicationDate + ", isCheckedOut=" + isCheckedOut + "]";
	}
}
