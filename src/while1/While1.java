package while1;

import java.util.Locale;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        //int senha_inserida = 0;
        int senha = 2002;
        
        System.out.println("Digite  senha: ");
                
        int senha_inserida = 0;
        
        senha_inserida = sc.nextInt();
        
        while(senha_inserida != senha){
            System.out.println("Senha Invalida");
            senha_inserida = sc.nextInt();

        }
        System.out.println("Acesso Permitido");
        



//Exercicio pronto



        



        
    }
    
}
