/********************************************************
 *
 *  Project :  <Name of project|assignment>
 *  File    :  <Name of source code file>
 *  Name    :  Ashton Chatelain
 *  Date    :  <Date created (project due date)>
 *
 *  Description : (Narrative desciption, not code)
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
		List<Book> bookList = Book.getList("books.csv");
		for (int i = 0; i < bookList.size(); i++)
		{
			System.out.println(bookList.get(i));
		}

	}

}
