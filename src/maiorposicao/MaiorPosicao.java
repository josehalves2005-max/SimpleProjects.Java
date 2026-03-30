package maiorposicao;

import java.util.Locale;
import java.util.Scanner;
import maiorposicao.application.Calculator;

public class MaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        
        Calculator[] vetor = new Calculator[n];
        
        for(int i = 0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            double numeros = sc.nextDouble();
            vetor[i] = new Calculator(numeros);
        }
        double mValor = 0;
        
        int pNumero = 0;
        
        for(int i = 0; i<vetor.length; i ++){
           if(vetor[i].getNumeros() > mValor){
            mValor = vetor[i].getNumeros();
            pNumero = i;
               
           }
               }
               
               System.out.println(mValor);
            
            
            
            
        
    sc.close();
    }
    
}
