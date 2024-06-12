/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlealunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    static Connection con;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/epjaime", "root", "");
            return con;
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
