
package serv;

import connect.conexao;
import connect.livroGetSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karoline
 */
public class livroSelect extends HttpServlet {
public ArrayList<livroGetSet> ListarLivro() throws SQLException{
    ArrayList<livroGetSet> ListarLivro = new ArrayList<livroGetSet>();
       try{
    String sql="SELECT*FROM disco ORDER BY RAND() LIMIT 11";
    Connection con = conexao.conectar();
    Statement stDisco = con.createStatement();
    ResultSet rsDisco = stDisco.executeQuery(sql);
    
    while(rsDisco.next()){
        livroGetSet disco= new livroGetSet();
        disco.setId_disco(rsDisco.getInt("id_disco"));
                disco.setTitulo_disco(rsDisco.getString("titulo_disco"));
                disco.setCapa_disco(rsDisco.getString("capa_disco"));
                disco.setRelease_disco(rsDisco.getString("release_disco"));
                disco.setPreco_disco(rsDisco.getFloat("preco_disco"));
                disco.setId_banda(rsDisco.getInt("id_banda"));
                ListarLivro.add(disco);
    }
    rsDisco.close();
    con.close();
    
}
    catch(Exception e){
            System.out.println("Erro ao listar livros!");
             System.out.println(e.getMessage());
            }
           return ListarLivro;
            
            }    




}