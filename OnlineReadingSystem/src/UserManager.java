import java.util.HashMap;

public class UserManager implements IBasicOperations<User>  {
	//Aslinda bu collection classlari ,program ilk calistiginda dolar ,load olur
	static HashMap<Integer , User> users = new HashMap<>();
		
	
	@Override
	public void Add(User item) {
		users.put(item.id, item );
	}
	@Override
	public void Remove(User item) {
		users.remove(item.id);
	}
	@Override
	public User get(int id) {
		return users.get(id) ;
	}

	public boolean Authenticate(int id , String pwd)
	{
		//DBManager ile DB de var mi yok mu bakariz
		return true;
	}
	
}
