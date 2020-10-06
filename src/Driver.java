import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//BibleBook b1 = new BibleBook("Genesis", "The first book of the bible", 50);
		//BibleBook b2 = new BibleBook("Acts", "The gospel according to St. John", 21);
		//BibleBook b3 = new BibleBook("Mathew", "The gospel according to St. Mathew", 28);
		//b1.display();
		//b2.display();
		//b3.display();
		
		//BibleBook[] ar = new BibleBook[4];
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		while(input.hasNext())
		{
			BibleBook a = new BibleBook(input.nextLine());
			a.display();
		}
		input.close();
		

		//Scanner inputSearch = new Scanner(System.in);
		//System.out.println("Enter a word you wish to look for: ");
		//String search = inputSearch.nextLine();
		//inputSearch.close();
		
		String search = "gospel";
		
		while(true)
		{
			bibleDesc.indexOf(search);
			system.out.println(BibleBook.getName);
		}
		
		
	}
}