import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int condicao;
        int op;
        Sala sala1 = new Sala("Sala 01");
    
    
        System.out.println("--SISTEMA DE CINEMA--");
        while(true){
        System.out.println("ESCOLHAS:\ngerenciar filme(1)");
       // System.out.println("apresentar filme(2)");
        System.out.println("sair(3)");
        condicao = entrada.nextInt();
       

        if(condicao==1){
            sala1.gerenciarfilme();
            System.out.println("DESEJA APRESENTAR SUA SALA?\n sim(1)\nnao(2)");
            op= entrada.nextInt();
            switch (op) {
                case 1:
                    sala1.apresentarfilme();
                    break;
                case 2:
                System.out.println("voltando para escolhas");

                break;

                default:
                System.out.println("incorreto");

                   break;
            }
            //sala1.apresentarfilme();
        
        }else if (condicao==3){
            System.out.println("saindo...");
            break;
        }else{
            System.out.println("incorreto");
        }
        
    }
    }
}
