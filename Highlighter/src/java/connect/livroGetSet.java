package connect;
public class livroGetSet {
    String nomeLivro,descricao,categoria,imagem;
    String autor;
    int Id;


      public int getId() {
        return Id;
    }


    public void setId(int Id) {
        this.Id = Id;
    }

    public String getnomeLivro() {
        return nomeLivro;
    }

    public void setnomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getimagem(){
        return imagem;
    }
    public void setimagem(String string) {
        this.imagem = imagem;
    }
    
}