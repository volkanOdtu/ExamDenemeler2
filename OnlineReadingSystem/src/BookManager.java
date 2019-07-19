import java.util.HashMap;

public class BookManager implements IBasicOperations<Book> {

	HashMap<Integer, Book> books = new HashMap<>();
	
	@Override
	public void Add(Book item) {
	
		books.put( item.id , item) ;
	}

	@Override
	public void Remove(Book item) {
		books.remove(item.id );
	}
	
	public HashMap<Integer, Book> GetBooks()
	{
		return books;
	}
	
	public void ReadBook(Book item)
	{
		if(item.isUsedNow)
		{
			System.out.println("Sorry this book is being read by somebody else ,so you cant read it");
			return;
		}
		item.isUsedNow= true;
		DisplayPanel panel = new DisplayPanel();
		panel.display();
		System.out.println( item.getContent());
	}
	public void CloseBook(Book item)
	{
		item.isUsedNow = false;
	}
	@Override
	public Book get(int id) {
		// TODO Auto-generated method stub
		return books.get(id);
	}

}
