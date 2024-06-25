package abstract_design;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 7000;
	}

	@Override
	public String name() {
		System.out.println("I am Web Developer");
		return "WEB DEVEOPER";
	}

}
