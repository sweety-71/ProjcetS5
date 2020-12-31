package projet;
import java.sql.*;

public abstract class Table {

	private String infoTable;
	private String dropTable;
	/**
	 * @param infoTable
	 * @param dropTable
	 */
	public Table(String infoTable, String dropTable) {
		super();
		this.infoTable = infoTable;
		this.dropTable = dropTable;
	}
	
	public void creerTable (Connection con) {
		/*supprimer la table existante (reinitialisation)*/
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(dropTable);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		/*ajouter la nouvelle table*/
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(infoTable);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void ajouterInfo (Connection con, String infoAAjouter) {
		try {
			Statement stmt = con.createStatement();
			int nbMaj = stmt.executeUpdate(infoAAjouter);
			System.out.println("nb mise a jour = " +nbMaj);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
