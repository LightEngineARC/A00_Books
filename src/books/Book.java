/********************************************************
 *
 *  Project :  <Name of project|assignment>
 *  File    :  <Name of source code file>
 *  Name    :  Ashton Chatelain
 *  Date    :  <Date created (project due date)>
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *
 *    2) What data-structures are used.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  <Description|date of modifications>
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
public class Book<T> implements Comparable<T>
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
	 * 
	 */
	public static List<Book> getList(String file) throws IOException
	{
		ArrayList<Book> booksList = new ArrayList<Book>();
		int count = 0;
		// pattern of line must match regex
		String lineRegex = "[^,]*+[,]{1}[^,]+[,]{1}[0-9]{4}";
		// File bookFile = new File(ClassLoader.getSystemResourceAsStream(file));
		Scanner sc = new Scanner(ClassLoader.getSystemResourceAsStream("books/" + file));
		while (sc.hasNext())
		{
			String text = sc.nextLine();
			if (text.matches(lineRegex))
			{
				count++;
				String[] parsedText = new String[3];
				parsedText = text.split(",");
				booksList.add(new Book<Object>(parsedText[0], parsedText[1], Integer.parseInt(parsedText[2])));
				booksList.sort(null);

			} else
			{
				System.out.println("Problem reading in \"" + text + "\"");
			}

		}

		// TODO read file and return list.
		// TODO output errors to error stream
		sc.close();
		System.out.println("Number of books read in: " + count);
		return booksList;

	}

	/**
	 * @param <T>
	 * 
	 */
	@Override
	public int compareTo(T arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public String toString()
	{
		return title + " by " + author + " (" + year + ")";
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

}
