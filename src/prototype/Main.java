package prototype;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating object using prototype design");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("92.18.18.2000");
		networkConnection.loadImportantData(); //it will take 5 sec to execute
		System.out.println(networkConnection);
		
		
		//we want new object of network creation.
		//so instead of creating new one , we can copy the instance and save the time
		try {
			//will create instantly
		 	NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
		 	System.out.println(networkConnection2);
		 	
		 	NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
		 	System.out.println(networkConnection3);
		 	
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
