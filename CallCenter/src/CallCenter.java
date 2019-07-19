import java.util.ArrayList;

public class CallCenter {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	public boolean startCall(Call call)
	{
		return findSomebody(call ,new Respondent(this) ); //an
	}
	
	public boolean findSomebody(Call call, Employee e)
	{
		 
		for (Employee employee : employees) 
		{
			if( employee instanceof Respondent )
			{ 
				if( employee.isFree)
				{
					employee.answerCall(call) ;
					return true;
				}
			}
		}
		for (Employee employee : employees) 
		{
			if( employee instanceof Manager )
			{ 
				if( employee.isFree)
				{
					employee.answerCall(call) ;
					return true;
				}
			}
		}
		for (Employee employee : employees) 
		{
			if( employee instanceof Director )
			{ 
				if( employee.isFree)
				{
					employee.answerCall(call) ;
					return true;
				}
			}
		}
		
		return false;
	}
	
	
}
