import java.util.HashMap;

public class DBManager implements IBasicOperations<User> {
	//Actually here we must access DB store to get users
	HashMap<Integer , User> users = new HashMap<>();
	
	public void LoadUsersFromDB()
	{
		User user1 = new User(1, "ali") ; user1.pwd = "111";
		User user2 = new User(2, "ali") ; user2.pwd = "111";
		User user3 = new User(3, "ali") ; user3.pwd = "111";
		
		users.put(user1.id, user1);
		users.put(user2.id, user2);
		users.put(user3.id, user3);
		
	}
	public boolean Authenticate(User user)
	{
		//Normally burasi DB den dolucak when object loads first to memory
		
		boolean isAuthenticated = false;
		
		if(users.containsKey(user.id) )
		{
			User userInDB = users.get(user.id);
			if( user.pwd.equals(userInDB.pwd))
				isAuthenticated = true;
		}
		
		return isAuthenticated;
	}

	@Override
	public void Add(User item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(User item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return users.get(id);
	}
}
