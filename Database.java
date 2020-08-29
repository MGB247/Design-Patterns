public class Database {
  private static Database instance = null;
  private String connectionString = "MySqlConnectionString";

  private Database() {
  }

  public static Database getInstance() {
    if (instance == null) {
      synchronized (Database.class) {
        if (instance == null) {
          instance = new Database();
          instance.connect();
        }
      }
    }
    return instance;
  }

  public boolean connect() {
    System.out.println("Connecting to SQL Server with Connection String: " + this.connectionString);
    return true;
  }

  public boolean disconnect() {
    System.out.println("Disconnected from SQL Server");
    return true;
  }

  public boolean executeQuery(String query) {
    System.out.println("Executing Query: " + query);
    return true; // if query successful returns true else false
  }
}