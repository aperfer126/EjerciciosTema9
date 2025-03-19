package com.apf;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        loadDataConsole();
    }

    private void loadDataConsole() throws IOException{
    Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/Usuarios", "root", "root");
            System.out.println("La conexión ha sido realizada con exito");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios");
            while (rs.next()){
                System.out.println(rs.getString("id") + rs.getString("nick") + rs.getString("email"));
            }
            con.close();
        }
        catch(Exception e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }
}
