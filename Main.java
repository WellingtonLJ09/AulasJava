import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        new Main().caso_3_2();
    }
    public void caso_3_2() {
        System.out.println("Digite um dos comentados abaixo do menu");
        System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");
        
        Scanner scan = new Scanner(System.in);    
        int opcao = scan.nextInt();
        
        if(opcao == 1) {    
            System.out.println("Voce acessou COMPRAR");    
        } else if(opcao == 2) {    
            System.out.println("Voce acessou VENDER");    
        } else if (opcao == 3) {    
            System.out.println("Voce acessou LISTAR");    
        } else {    
            System.out.println("Saindo do sistema");    
        }
        
    }
}

