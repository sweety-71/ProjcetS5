package projet;
import java.sql.*;

public class Batiment extends Table {
	
	private String nomBat;
	private int numEtage;
	private String nomPiece;
	

	public Batiment(String infoTable, String dropTable) {
		super(infoTable, dropTable);
	}

	public void setInfoBat (Connection con, String query) {
		ResultSet result = null;
		
		try {
			Statement stmt = con.createStatement();
			result = stmt.executeQuery(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(result.next()) {
				nomBat = result.getString(1);
				numEtage = result.getInt(2);
				nomPiece = result.getString(3);
			}
			else {
				System.out.println("BD NULL");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @return the nomBat
	 */
	public String getNomBat() {
		return nomBat;
	}

	/**
	 * @return the numEtage
	 */
	public int getNumEtage() {
		return numEtage;
	}

	/**
	 * @return the nomPiece
	 */
	public String getNomPiece() {
		return nomPiece;
	}
	
	
}
