package projet;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDeDonnees bdTest = new BaseDeDonnees("test");
		
		/*établir la connexion*/
		bdTest.etablirConnexion();
		Batiment tableBat = new Batiment("CREATE TABLE Batiment (nomBatiment VARCHAR(50),etage INTEGER,piece VARCHAR(10), PRIMARY KEY(nomBatiment))", "DROP TABLE Batiment");
		
		tableBat.creerTable(bdTest.getCon());
		tableBat.ajouterInfo(bdTest.getCon(), "INSERT INTO Batiment VALUES ('U2',2,'B02')");
		tableBat.setInfoBat(bdTest.getCon(), "SELECT * FROM Batiment");
		
		System.out.println("Nom de la base de données : " + bdTest.getNomBase());
		System.out.println("Nom batiment : " + tableBat.getNomBat() + "numéro Etage : " + tableBat.getNumEtage() + "nom pièce : " + tableBat.getNomPiece());
		
	}


}
