package projet;
import java.sql.*;

public class BaseDeDonnees {
	
	private String nomBase;
	private Connection con = null;

	/**
	 * @param nomBase
	 */
	public BaseDeDonnees(String nomBase) {
		super();
		this.nomBase = nomBase;
	}
	
	
	public void etablirConnexion() {
		/*établir la connexion*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test",
					"root",
					"");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}


	/**
	 * @return the nomBase
	 */
	public String getNomBase() {
		return nomBase;
	}
	
	
	
}
