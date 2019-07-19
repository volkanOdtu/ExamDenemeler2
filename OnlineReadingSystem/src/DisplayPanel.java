
public class DisplayPanel {
	
	Book activeBook;
	
	public void display()
	{
		System.out.println( "Kitap adi: " + activeBook.name + " page no: " + activeBook.activePage  );
	}
	public void setBook(Book book)
	{
		this.activeBook = book;
	}
	public Book getBook()
	{
		return this.activeBook;
	}
	
	public void turnPageForward()
	{
		this.activeBook.activePage++;
	}
	public void turnPageBack()
	{
		this.activeBook.activePage--;
	}
}
