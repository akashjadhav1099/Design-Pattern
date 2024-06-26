package observer;

public interface Subject {

	void subscribe(Observer observer);
	void unsubsribe(Observer observer);
	void videoUploaded(String title);
}
