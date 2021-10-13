package BDDRH.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Vue {

	public void showView(ResultSet result) throws SQLException {

		try {
			System.out.println("Liste des employe.e.s");

			while (result.next()) {
				//Traitement requête
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String id = result.getString("id");
				System.out.println(nom+"\t\t\t"+prenom+"\t\t\t"+id) ;
			}
		}
		catch(SQLException se) {
			se.getMessage();
		}
	}
}
