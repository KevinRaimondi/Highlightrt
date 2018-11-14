/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Karoline
 */
public class conexao {
    public static Connection conectar() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection("jdbc:mysql://localhost/high","root","");

       // return DriverManager.getConnection("jdbc:mysql:highlighter.mysql.uhserver.com", "highlighter", "Arucard91745743*");
    }
}
