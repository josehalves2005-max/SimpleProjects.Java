package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        
        String[] nome = new String[n];
        int[] idade = new int[n];
        
        String mVelha = null;
        int mIdade = 0;
        int numeroPessoa = 0;
        
        for(int i = 0; i<n; i++){
            numeroPessoa += 1;
            System.out.printf("Dados da %da pessoa: %n", numeroPessoa);
            
            System.out.print("Nome: ");
            nome[i] = sc.next();
            
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            
            if(mIdade < idade[i]){
                mIdade = idade[i];
                mVelha = nome[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + mVelha);
        
        sc.close();
        
        
        
        


    }
    
}
