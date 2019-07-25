package za.co.wethinkcode.swingy.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseController {

    public static void connect(){
        Connection conn = null;
        try{
            Class.forName("org.sqlite.JDBC");
            //db parameters
            String url = "jdbc:sqlite:swingy.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connected successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}

/*
CREATE TABLE Hero (
name text,
rank text,
level Int,
experience Int,
attack Int,
defence Int,
hit_points Int,
artefact_id Int UNIQUE,
id Int PRIMARY KEY
);

CREATE TABLE Artefact (
name text,
type text,
id Int PRIMARY KEY
);


 */