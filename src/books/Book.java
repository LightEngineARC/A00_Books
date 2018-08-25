/********************************************************
 *
 *  Project :  A00 Books
 *  File    :  A00_Books
 *  Name    :  Ashton Chatelain
 *  Date    :  8/25/2018
 *
 *  Description : Assignment Books
 *
 *    1) review implementing interface Comparable<T>
 *
 *    2) A List is used to store and compare books.
 *
 *    3) Methods used: compareTo, toString, sort(), 
 *
 *
 ********************************************************/
package books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ashton
 * @param <T>
 *
 */
public class Book implements Comparable<Book>
{
	/**
	 * Fields
	 */
	String title, author;
	int year;

	/**
	 * Parameterized Constructor
	 */
	public Book(String title, String author, int year)
	{
		this.title = title;
		this.author = author;
		this.year = year;
	}

	/**
	 * @throws IOException
	 */
	public static List<Book> getList(String file) throws IOException
	{
		ArrayList<Book> booksList = new ArrayList<Book>();
		int count = 0;
		// pattern of line must match regex to be a valid book
		String lineRegex = "[^,]*+[,]{1}[^,]+[,]{1}[0-9]{4}";
		Scanner sc = new Scanner(ClassLoader.getSystemResourceAsStream("books/" + file));
		while (sc.hasNext())
		{
			String text = sc.nextLine(); // capture a line of text to check
			if (text.matches(lineRegex))
			{
				count++;
				String[] arrayOfSplitText = new String[3];
				arrayOfSplitText = text.split(","); // create array of the values by commas
				booksList
						.add(new Book(arrayOfSplitText[0], arrayOfSplitText[1], Integer.parseInt(arrayOfSplitText[2])));
				booksList.sort(null);

			} else
			{
				// when text patter does not match the requirements
				System.out.println("Problem reading in \"" + text + "\"");
			}

		}

		sc.close();
		System.out.println("Number of books read in: " + count);
		return booksList;

	}

	/**
	 * Override toString method to title by author (year)
	 */
	@Override
	public String toString()
	{
		return title + " by " + author + " ( " + year + " )";
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/**
	 * @return the year
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * Override compareTo method
	 */
	@Override
	public int compareTo(Book o)
	{
		return this.getTitle().compareTo(o.getTitle());
	}

}
