/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connect.conexao;

/**
 *
 * @author Karoline
 */
public class cadUsuario extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException{
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
        
        //variaveis para a conexao com o banco de dados
        
       
        try{
           
            String nome =request.getParameter("nome");
            String email =request.getParameter("email");
            String senha =request.getParameter("senha");

           
            MessageDigest mdAlgorithm= MessageDigest.getInstance("SHA-512");
            mdAlgorithm.update(senha.getBytes());
            
            byte[] digest = mdAlgorithm.digest();
            StringBuffer hexString = new StringBuffer();
            
            for(int i=0;i<digest.length;i++){
                senha= Integer.toHexString(0xFF & digest[i]);
                
                if(senha.length()<2){
                    senha="0"+senha;
                }
                hexString.append(senha);
                
            }
            senha=hexString.toString();
             String sql="INSERT INTO usuario (nomeCompleto,email,senha) VALUES('"+nome+"','"+email+"','"+senha+"')";
            
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            //realiza a execução   da instrução SQL
            st.execute(sql);
            //fecha a conexao com o banco de dados
            st.close();
            //redirecionamento
            response.sendRedirect("login.jsp");
            
 
        }
        catch(Exception e){
    out.println("Erro ao inserir os dados!!\n\n"+e.getMessage());
        }
}
        


        }

}