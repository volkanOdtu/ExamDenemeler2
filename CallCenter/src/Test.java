
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallCenter callCenter = new CallCenter();
		Employee respondent1 = new Respondent("Respondent1" ,callCenter );
		Employee respondent2 = new Respondent("Respondent1" ,callCenter );
		Employee manager = new Manager("Manager1" ,callCenter );
		Employee director1 = new Director("Director1" ,callCenter );
		Employee director2 = new Director("Director2" ,callCenter );
		
				
		callCenter.addEmployee(respondent1);
		callCenter.addEmployee(respondent2);
		callCenter.addEmployee(manager);
		callCenter.addEmployee(director1);
		callCenter.addEmployee(director2);
		
		Call call1 = new Call(callCenter);
		call1.start();
		Call call2 = new Call(callCenter);
		call2.start();
		Call call3 = new Call(callCenter);
		call3.start();
		
		
	}

}
