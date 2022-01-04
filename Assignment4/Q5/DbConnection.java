public class DbConnection {
	private static DbConnection db = null;
	

	public static DbConnection getObject() {
		
		 if (db == null) {
	            db = new DbConnection();

	        }
		 else {
			 throw new IllegalArgumentException("Already existing");
		 }
	return db;
	}
	private DbConnection() {
	
	}
}
