
public abstract class Book {

	public int id;
	public String name;
	public String content ;
	public int numberOfPages;
	public int activePage;
	
	boolean isUsedNow = false;
	
	public Book(int id ,String name)
	{
		this.id = id ; this.name = name;
	}
	
	public void read()
	{
		this.isUsedNow = true;
	}
	public abstract String getContent() ;
	
	public void close()
	{
		this.isUsedNow = false;
	}
}
