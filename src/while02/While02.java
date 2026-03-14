package while02;

import java.util.Locale;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int qtd_alcool = 0;
        int qtd_gasolina = 0;
        int qtd_diesel = 0;
              
        
        int inserir = 0;
       
        while(inserir != 4){
            System.out.println("Digite [1]para alcool [2] para gasolina e [3] para diesel e [4] para combustiveis utilizados");
            inserir = sc.nextInt();
            
            switch(inserir){
                case 1:
                    qtd_alcool += 1;
                break;
                
                case 2:
                    qtd_gasolina += 1;
                break;
                
                case 3:
                    qtd_diesel += 1;
                break;
                
                case 4:
                break;

                default:
                    System.out.println("valor invalido");
                break;
             }
            }
            System.out.printf(" MUITO OBRIGADO %n Alcool: %d%n Gasolina: %d%n Diesel: %d%n ", qtd_alcool, qtd_gasolina, qtd_diesel);
sc.close();
    }
}
