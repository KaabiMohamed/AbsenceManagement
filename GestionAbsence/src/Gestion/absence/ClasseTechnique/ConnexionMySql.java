/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.absence.ClasseTechnique;

/**
 *
 * @author Personal computer
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionMySql {

    private Connection connection;
    private Statement st;
    private ResultSet rs;
    private String sql;
     private static ConnexionMySql instance;

        private ConnexionMySql()  {
            this.seConnecter();
        }

         public static ConnexionMySql getInstance()  {
            if(null== instance) //premiére appel
                {
                    instance = new ConnexionMySql();
                }
            return instance;
            }


	public boolean seConnecter(){

		String url="jdbc:mysql://127.0.0.1:3306/gesabsence";
		String login="root";
		String mdp="";

		try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return false;

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
		 connection = DriverManager.getConnection(url, login, mdp);

		} catch (SQLException e1) {

			e1.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean executerUpdate(String sql){
		try {
			st=connection.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

                return true;

	}
	public boolean executerRequete(String sql){
		try {
			st=connection.createStatement();
			setRs(st.executeQuery(sql));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public ResultSet getRs() {
		return rs;
	}

    /**
     * @return the connection
     */

    }

