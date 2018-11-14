package serv;
import connect.discoGet;
import connect.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class discoSelect {
    public ArrayList<discoGet> ListarDisco() {
        ArrayList<discoGet> ListaDisco = new ArrayList<discoGet>();
        try {
            String sql = "SELECT * FROM disco ORDER BY RAND() LIMIT 11";
            Connection con = conexao.conectar();
            Statement stDisco = con.createStatement();
            ResultSet rsDisco = stDisco.executeQuery(sql);
            while ( rsDisco.next() ) {
                discoGet disco = new discoGet();
                disco.setId_disco(rsDisco.getInt("id_disco"));
                disco.setTitulo_disco(rsDisco.getString("titulo_disco"));
                disco.setCapa_disco(rsDisco.getString("capa_disco"));
                disco.setRelease_disco(rsDisco.getString("release_disco"));
                disco.setPreco_disco(rsDisco.getFloat("preco_disco"));
                disco.setId_banda(rsDisco.getInt("id_banda"));
                ListaDisco.add(disco);
            }
            rsDisco.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Erro ao listasr discoss");
            System.out.println(e.getMessage());
        }
        return ListaDisco;
    }

}