public class Sala {
  /*   String codigo="01";
    Filme filme1 = new Filme("Batman");
    Filme filme2 = new Filme("Homeme-Aranha");*/

    String cod;
    Filme filme1;
    Filme filme2;

    public Sala(String cod, String filme1,String filme2){
      this.cod=cod;
      this.filme1= new Filme(filme1);
      this.filme2= new Filme(filme2);
    }

    public void apresentarfilme(){
        System.out.println("--FILMES DiSPONiVEIS--");
        System.out.println("Filme: "+ filme1.getFilme());
        System.out.println("Filme: "+ filme2.getFilme());

    }
}
