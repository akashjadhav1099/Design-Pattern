package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList();
	
	
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
	
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
	public void loadImportantData() throws InterruptedException {
		this.importantData = "Very Very Important Data";
		domains.add("www.xyz.com");
		domains.add("www.infy.com");
		domains.add("www.abc.com");
	
		Thread.sleep(5000);
		//takes lots of time
	}
	
	
	
	//shallow copy
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//	
	
	//deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnection networkConnection =  new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setImportantData(this.getImportantData());
		for(String d: this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		return networkConnection;
	}
	
	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}


	
	
}
