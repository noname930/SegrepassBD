/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segrepassbd;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.*;

/**
 *
 * @author Alessio Spina
 */
public class ConnessioneDB {
   
  /*==========PARAMETRI CONNESSIONE DB=============*/  
   static protected Connection connection = null;
   static protected String Host = "localhost";
   static protected int Porta= 1521;
   static protected String Servizio="XE";
   static protected String Utente="";
   static protected String Password="";
 /*=================================================*/  
   static private OracleDataSource ods;
   // parametro OracleDataSource in grado di stabilire una connessione al DB
   
   
    
    
     public void Connection() {
         

     }
     
     
     
     /*Effettua la connessione al DB e salva il paramentro della connessione nelll'attributo connection.
     WARNING: in caso di problemi, lancia una SQLException*/
     protected static void StartConnection() throws SQLException
     {
      ods = new OracleDataSource();
      ods.setDriverType("thin");
      ods.setServerName(Host);
      ods.setPortNumber(Porta);
      ods.setUser(Utente);
      ods.setPassword(Password);
      ods.setDatabaseName(Servizio);
      
      //setto l'attributo connection della classe, uguale alla connessione stabilita tratime .getconnection()
      connection=ods.getConnection(); 
     }
    
}
