package BDDRH.controller;

import BDDRH.view.*;
import BDDRH.model.*;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controller {

	public void traiterRequete() throws SQLException {
		Statement stmt1=null;

		ResultSet rst1=null;
		Properties props = new Properties();
		String url = "jdbc:mysql://localhost:3306/concours";
		props.setProperty("user","root");
		props.setProperty("password","");

		Connection conn=null;
		try {
			//Appel de la méthode getConnexio() via la classe Connexion 1
			conn = Connexion.getConnexion(url, props);

			//Création d'objets de la classe Vue 2
			Vue vue1 = new Vue();

			//Appel de la classe Repository du modèle 2
			Repository rep1 = new Repository(stmt1);

			//Récupération des résultats du requête du modèle 2
			String req1 = "SELECT * FROM salarie";

			//Lancement des requêtes et récupération des résultats 2
			rst1 = rep1.requete(conn, req1);

			//Appel de la vue 2
			vue1.showView(rst1);
		}
		catch (SQLException se) {
			se.getMessage();
		}
	}
}
