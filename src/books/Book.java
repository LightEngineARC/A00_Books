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

/**
 * @author iamsp
 *
 */
public class Book implements Comparable<T>
{
	/**
	 * 
	 */
	String title, author;
	int year;

	/**
	 * 
	 */
	public Book()
	{
		// TODO Auto-generated constructor stub
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
		// TODO override to string
		return title + " by " + author + "(" + year + ")";
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
