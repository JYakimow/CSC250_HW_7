public class BibleBook 
{
	private String name;
	private String description;
	private int chapterNum;

	public BibleBook(String name, String description, int chapterNum)
	{
		this.name = name;
		this.description = description;
		this.chapterNum = chapterNum;
	}
	
	public void display()
	{
		System.out.println("Book Title: " + this.name);
		System.out.println("Book Description: " + this.description);
		System.out.println("Total Number of Chapters: " + this.chapterNum);
		System.out.println("");
	}
	
	public BibleBook(String colonDelimited)
	{
		String[] parts = colonDelimited.split(":");
		this.name = parts[0];
		this.chapterNum = Integer.parseInt(parts[1]);
		this.description = (parts[2]);
	}
	
	public void toArray(String desc)
	{
		String[] bibleDesc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getChapterNum() {
		return chapterNum;
	}
}