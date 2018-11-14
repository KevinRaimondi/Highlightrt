
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
    String sql="SELECT*FROM livro ORDER BY RAND() LIMIT 11";
    Connection con = conexao.conectar();
    Statement stLivro = con.createStatement();
    ResultSet rsLivro = stLivro.executeQuery(sql);
    
    
    while(rsLivro.next()){
                livroGetSet livro= new livroGetSet();
                livro.setnomeLivro(rsLivro.getString("nomeLivro"));
                livro.setcategoria(rsLivro.getString("categoria"));
                livro.setdescricao(rsLivro.getString("descricao"));
                livro.setautor(rsLivro.getString("autor"));
                livro.setimagem(rsLivro.getString("imagem"));
                livro.setId(rsLivro.getInt("id"));
                ListarLivro.add(livro);
    }
    rsLivro.close();
    con.close();
    
}
    catch(Exception e){
            System.out.println("Erro ao listar livros!");
             System.out.println(e.getMessage());
            }
           return ListarLivro;
            
            }    




}