package for4;

import java.util.Locale;
import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valorUm = 0;
        double valorDois = 0;
        double valorTres = 0;
        double valorFinal = 0;
        
        
        System.out.println("Digite o numero de vezes: ");
        int vezes = sc.nextInt();
        
        
        for(int i = 0; i != vezes; i++){
            System.out.println("Digite Tres numeros com casas decimais: ");
            valorUm = sc.nextDouble();
            valorDois = sc.nextDouble();
            valorTres = sc.nextDouble();
            
            valorFinal = (valorUm * 2) + (valorDois * 3) + (valorTres * 5);
            valorFinal = valorFinal / 10;
            
            System.out.printf("Media ponderada: %.1f%n ", valorFinal);
         }
        sc.close();








    }
    
}
