
public  class  Call {
	CallCenter callCenter ;
	
	public Call(CallCenter callCenter )
	{
		this.callCenter = callCenter;
	}
	public boolean isAnswered = false;

	public void start()
	{
		callCenter.findSomebody(this, new Respondent(callCenter));
	}
	
	public String incomingDate;
	public Employee answeringEmployee; //cagiriyi cevaplayan
}
