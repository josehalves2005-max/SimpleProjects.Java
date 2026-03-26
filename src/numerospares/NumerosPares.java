package numerospares;

import java.util.Locale;
import java.util.Scanner;
import numerospares.application.Separador;

public class NumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        Separador[] vetor = new Separador[n];
        
        for(int i = 0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            
            vetor[i] = new Separador(numero);
        }
        
        System.out.println();
        
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i].getNumeros() % 2 <= 0){
                System.out.print(vetor[i].getNumeros() + " "); 
            }
        }

        int quantidade = 0;

        for(int i = 0; i<vetor.length; i ++){
            if(vetor[i].getNumeros() % 2 <= 0){
                
                quantidade += 1; 
            }
    }
        System.out.println();
        System.out.println();
        
        System.out.println("QUANTIDADE DE PARES = " + quantidade);

sc.close();
    }
    
}
