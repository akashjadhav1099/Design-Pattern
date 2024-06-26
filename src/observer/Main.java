package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber aman = new Subscriber("aman");
		Subscriber ramesh = new Subscriber("ramesh");
		
		channel.subscribe(aman);
		channel.subscribe(ramesh);
		
		channel.videoUploaded("Learn Design Pattern");
		channel.videoUploaded("Lets Learn JAVA");
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload video");
			System.out.println("Press 2 to create new Subscriber");
			System.out.println("Press 3 to exit");
			
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				//new video uploaded
				System.out.println("Enter Video Title: ");
				String videoTitle = br.readLine();
				channel.videoUploaded(videoTitle);
			}else if(c==2) {
				//create new subscriber
				System.out.println("Enter Subscriber name: ");
				String subscriberName = br.readLine();
				Subscriber sub = new Subscriber(subscriberName);
				channel.subscribe(sub);
			}else if(c==3) {
				//exit 
				System.out.println("Thank You for using app ");
				break;
			}else {
				//exit wrong input
				System.out.println("Wrong input");
			}
		}
	}

}
