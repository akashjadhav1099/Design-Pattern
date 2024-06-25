package abstract_design;

public class Client {

	public static void main(String[] args) {

		// I want to get Android Developer
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		e1.name();
		System.out.println(e1.salary());

		System.out.println("-------------");
		// I want to get Web Developer
		Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
		e2.name();
		System.out.println(e2.salary());
	}
}
