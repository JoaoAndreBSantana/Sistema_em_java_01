public class Filme {
   
   private String genero;
   private String duracao;
   private String nome;
   private int codigo;
   


    public Filme(String nome, String genero,String duracao,int codigo){
      
        this.nome=nome;
        this.genero= genero;
        this.duracao= duracao;
        this.codigo= codigo;

    }


    
    
     public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getCodigo(){
        return codigo;

    }
}
