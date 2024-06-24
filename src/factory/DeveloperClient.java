package factory;

public class DeveloperClient {

	public static void main(String[] args) {
		//tight coupling
		//Employee employee= new AndroidDeveloper();
		
		//Loosely coupled
		Employee employee =  EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(employee.salary());
		
		System.out.println("------------------");
		Employee employee1 =  EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println(employee1.salary());
	}
}
