/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;
import connect.conexao;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karoline
 */
public class logarUsuario extends HttpServlet {

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException{
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
        
        //variaveis para a conexao com o banco de dados
        
       
        try{
           
            String email =request.getParameter("usuario");
            String senha =request.getParameter("senha");

           // converte a senha em SHA-516
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
             String sql ="SELECT * FROM usuario WHERE  email='" + email + "' AND senha= '" + senha + "'";
             
             HttpSession session = request.getSession(true);
            
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            //realiza a execução   da instrução SQL
            st.execute(sql);
            ResultSet resultado;
             resultado= st.getResultSet();
            if( resultado.next()){
                
            session.setAttribute("logado","true");
            session.setAttribute("erro","0");
            session.setAttribute("nome",resultado.getString("nome"));
            response.sendRedirect("logado.jsp");
            
            
            } 
            else
            {
                out.println("Login ou senha inválidos. <a href='login.jsp'>Voltar</a>"); 
            }
            //fecha a conexao com o banco de dados
            st.close();
            //redirecionamento
            
 
        }
       catch(Exception e){
           
       }}


        }}



