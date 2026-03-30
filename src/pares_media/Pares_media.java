package pares_media;

import java.util.Locale;
import java.util.Scanner;

public class Pares_media {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        
        int[] vetor = new int[n];
        
        int mediaPares = 0;
        int qtdNumeros = 0;
        
        for(int i = 0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] % 2 == 0){
                mediaPares += vetor[i]; 
                qtdNumeros += 1;
            }
        }
        
        if(mediaPares > 0){
            mediaPares = mediaPares / qtdNumeros;
            System.out.println("MEDIA DOS PARES = " + mediaPares);
        }
        else{
            System.out.println("NENHUM NUMERO PAR");
        }
        
        
        
    sc.close();    
    }
    
}
