
public class HistoryBook extends Book {

	public HistoryBook(int id ,String name)
	{
		super(id ,name);
	}

	@Override
	public String getContent() {
		return "This book is about Balkan History. After World Wor I ,.....";
	}
}
