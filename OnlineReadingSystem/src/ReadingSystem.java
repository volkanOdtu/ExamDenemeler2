
public class ReadingSystem {

	BookManager bookManager ;
	UserManager userManager;
	
	boolean userInSystem = false;
	
	public ReadingSystem()
	{
		bookManager = new BookManager() ;
		userManager = new UserManager();
	}
	
	
	public void Enter(int id ,String pwd)
	{
		if(userInSystem)
		{
			System.out.println("Unfortunately ,there is  somebody in the system , so you cant read a book!!!");
			return;
		}
		else
		{
			if( userManager.Authenticate(id, pwd) )
			{
				userInSystem = true;
				System.out.println("You logged in and can read a book");
				return;
			}
		}	
		
		System.out.println("You arent authorized to read!");
	}
	public void Exit()
	{
		userInSystem = false;
	}
}
