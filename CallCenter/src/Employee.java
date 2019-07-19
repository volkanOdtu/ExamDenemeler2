
public  class Employee implements ILevel {
	CallCenter callCenter;
	
	String name;	
	public Employee(String name ,CallCenter callCenter)
	{
		this.name = name;
		this.callCenter = callCenter;
	}
	public Employee(CallCenter callCenter)
	{
		this.callCenter = callCenter;
	}
	
	public boolean isFree = true;
	
	@Override
	public void answerCall(Call call)
	{
		if( this.isFree)
		{
			System.out.println("Hello my name is " + name + " ,how can I help you?");
			call.isAnswered = true;
			isFree = false;
		}
		else
			escalateCall(call );
	}
		
	@Override
	public void escalateCall(Call call ) 
	{
		boolean found = callCenter.findSomebody(call, this) ;
		if(!found )
			System.out.println("Sorry ,nobody is available now");
		
	}
	
}
