import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int cond;

        Sala sala1 = new Sala("01","batman","Homem-Aranha");
        Sala sala2= new Sala("02","Annabelle","Ted 2");

        System.out.println("Cinema Aberto");
        System.out.println("Vc deseja escolher qual sala:\nSALA 1\t(digite 1)\nSALA2\t(digite 2)");
       cond= teclado.nextInt();
       
        if (cond==1) { sala1.apresentarfilme(); }
        if (cond==2) { sala2.apresentarfilme(); }
        if(cond!=1 && cond!=2){System.out.println("Numero incorreto");}
        
    }
}
