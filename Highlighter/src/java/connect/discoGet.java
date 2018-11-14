/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

public class discoGet{
    
    private int id_disco;
    private String titulo_disco;
    private String capa_disco;
    private String release_disco;
    private double preco_disco;
    private int id_banda;

    public int getId_disco() {
        return id_disco;
    }

    public void setId_disco(int id_disco) {
        this.id_disco = id_disco;
    }

    public String getTitulo_disco() {
        return titulo_disco;
    }

    public void setTitulo_disco(String titulo_disco) {
        this.titulo_disco = titulo_disco;
    }

    public String getCapa_disco() {
        return capa_disco;
    }

    public void setCapa_disco(String capa_disco) {
        this.capa_disco = capa_disco;
    }

    public String getRelease_disco() {
        return release_disco;
    }

    public void setRelease_disco(String release_disco) {
        this.release_disco = release_disco;
    }

    public double getPreco_disco() {
        return preco_disco;
    }

    public void setPreco_disco(double preco_disco) {
        this.preco_disco = preco_disco;
    }

    public int getId_banda() {
        return id_banda;
    }

    public void setId_banda(int id_banda) {
        this.id_banda = id_banda;
    }
    
}