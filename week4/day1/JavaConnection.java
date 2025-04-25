package week4.day1;

public class JavaConnection extends MySqlConnection {


	public void connect() {
		System.out.println("Connected");
		
	}

    public void disconnect() {
    System.out.println("Disconnected");
		
	}
    public void executeUpdate() {
		System.out.println("Updated");
		
	}
    public void executeQuery() {
    	super.executeQuery();
    	System.out.println("Query Executed");
    }
	
      public static void main(String[] args) {
    	JavaConnection options = new JavaConnection ();
    	options.connect();
    	options.disconnect();
    	options.executeUpdate();
    	options.executeQuery();
	
		
	
      }
	
}

