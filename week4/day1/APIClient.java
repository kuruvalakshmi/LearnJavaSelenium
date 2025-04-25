package week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		System.out.println(endpoint +" "+ requestBody +" "+ requestStatus);

	}
	public static void main(String[] args) {
		APIClient options = new APIClient ();
		options.sendRequest("endpoint");
		options.sendRequest("endpoint", "requestBody", true);
	}

}
