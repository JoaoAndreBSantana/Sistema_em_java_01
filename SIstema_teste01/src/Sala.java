import java.util.Scanner;

public class Sala {
  

    String cod;
    Filme filme1;//unico filme
    
 

    public Sala(String cod){//coonstutor com o codigo ou nuemro dela
      this.cod=cod;
    }

    public void gerenciarfilme(){
       Scanner teclado = new Scanner(System.in);
       //int op;//opção

      System.out.println("DIGITE O NOME DO FILME ");
      String nome= teclado.nextLine();

      System.out.println("DIGITE O GENERO DO FILME ");
      String genero= teclado.nextLine();

      System.out.println("DIGITE A DURACAO DO FILME ");
      String duracao= teclado.nextLine();

      System.out.println("DIGITE O CODIGO DO FILME ");
      int codigo= teclado.nextInt();



       filme1= new Filme(nome, genero, duracao,codigo);


    }

    public void apresentarfilme(){
      
     // System.out.println("Código: " + filme.getCodigo());
      System.out.println("Nome do filme: " + filme1.getNome());
      System.out.println("Genero do filme: " + filme1.getGenero());
      System.out.println("Duracao do filme: " + filme1.getDuracao());
      System.out.println("Codigo do filme:" + filme1.getCodigo());
  }
      
       
    }

   

