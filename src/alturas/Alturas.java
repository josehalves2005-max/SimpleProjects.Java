package alturas;

import java.util.Locale;
import java.util.Scanner;
import alturas.application.Solutioner;

public class Alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Solutioner[] vetor = new Solutioner[n];
        
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("Dados da %da:%n", i + 1);
            
            System.out.print("Nome: ");
            String nome = sc.next();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            vetor[i] = new Solutioner(nome, idade, altura);    
        }
        double sum = 0;
        
        for(int i = 0; i<vetor.length; i++){
            sum += vetor[i].getAltura();
        }
        
        double media = sum / n;
        
        System.out.println();
        
        System.out.printf("Altura media: %.2f%n", media);
        
        double abaixoDaIdade = 0;
        
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i].getIdade() < 16){
                abaixoDaIdade = i;
            }
        }
         
        abaixoDaIdade = abaixoDaIdade / vetor.length * 100;
            
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", abaixoDaIdade);    
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i].getIdade() < 16){
                System.out.println(vetor[i].getName());
            }
        }
            
        
        
        
        
        

sc.close();
    }
    
}
