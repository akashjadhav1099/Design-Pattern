package adapter;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Program Started");
		
		AppleCharger charger = new AdapterCharger(new DkCharger());
		
		Iphone13 iphone13 = new Iphone13(charger);
		iphone13.chargeIphone();
	}

}
