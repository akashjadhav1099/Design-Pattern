package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

	List<Observer> subscribers = new ArrayList();
	
	@Override
	public void subscribe(Observer observer) {
		this.subscribers.add(observer);
	}

	@Override
	public void unsubsribe(Observer observer) {
		this.subscribers.remove(observer);
	}

	@Override
	public void videoUploaded(String title) {
		for(Observer ob: this.subscribers) {
			ob.notified(title);
		}
	}

}
