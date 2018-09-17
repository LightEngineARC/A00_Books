/********************************************************
 *
 *  Project :  A00 Books
 *  File    :  books
 *  Name    :  Ashton Chatelain
 *  Date    :  8/25/2018
 *
 *  Description : Assignment Books
 *
 *    1) Test class for Book.java
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
import java.util.Collections;
import java.util.List;

/**
 * @author iamsp
 *
 */
public class BookApp
{

	/****************************************************
	 * Method : NAME
	 *
	 * Purpose : DESCRIPTION
	 *
	 * Parameters : type - description number_of_elements - the number of elements
	 * in the type
	 *
	 * Returns : What does it return
	 * 
	 * @throws IOException
	 *
	 ****************************************************/
	public static void main(String[] args) throws IOException
	{
		// create list of books by sending it the file books.csv
		List<Book> bookList = Book.getList("books.csv");

		bookList.sort(null);

		// System.out.println("\n\nSorted Book List:\n");
		// for (int i = 0; i < bookList.size(); i++)
		// {
		// System.out.println(bookList.get(i));
		// }

		Collections.sort(bookList, Book.BY_AUTHOR);

		System.out.println("\n\nsorting by author:\n");
		for (int i = 0; i < bookList.size(); i++)
		{
			System.out.println(bookList.get(i));
		}
		Collections.sort(bookList, Book.BY_TITLE);

		System.out.println("\n\nsorting by Title:\n");
		for (int i = 0; i < bookList.size(); i++)
		{
			System.out.println(bookList.get(i));
		}

	}

}
