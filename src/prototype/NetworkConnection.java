package prototype;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String importantData;
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	
	public void loadImportantData() throws InterruptedException {
		this.importantData = "Very Very Important Data";
		Thread.sleep(5000);
		//takes lots of time
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	
	
}
