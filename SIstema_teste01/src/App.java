import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int condicao;

        Sala sala1 = new Sala("Sala 01");
    
    
        System.out.println("--Cinema Aberto--");

        
        System.out.println("ESCOLHAS:\nGerenciar filme(1)");
        condicao = entrada.nextInt();

        if(condicao==1){
            sala1.gerenciarfilme();
            sala1.apresentarfilme();
        }else{
            System.out.println("Numero incorreto");
        }
        
        
    }
}
