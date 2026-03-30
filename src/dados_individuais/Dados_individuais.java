package dados_individuais;

import java.util.Locale;
import java.util.Scanner;

public class Dados_individuais {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        double[] alturas = new double[n];
        char[] generos = new char[n];
        
        int contador = 0;
        
        for(int i = 0; i<n; i++){
            contador += 1;
            System.out.printf("Altura da %da pessoa: ", contador);
            alturas[i] = sc.nextDouble();
            
            System.out.printf("Genero da %da pessoa: ", contador);                       
            generos[i] = sc.next().charAt(0);
        }
        
        double menorAlt = 0;
        double maiorAlt = 0;

        for(int i = 0; i<n; i++){
            if(maiorAlt < alturas[i]){
                maiorAlt = alturas[i];
            }
        }
        
        menorAlt = maiorAlt;
        
        for(int i = 0; i<n; i++){
            if(alturas[i] < menorAlt){
                menorAlt = alturas[i];    
            }    
        }
        
        
        
        System.out.println("Menor altura = " + menorAlt);
        System.out.println("Maior altura = " + maiorAlt);

        double mediaM = 0;
        double mediaH = 0;
        
        double qtdMulheres = 0;
        int qtdHomens = 0;
        
        for(int i = 0; i<n; i++){
            if(generos[i] == 'f' || generos[i] == 'F' ){
                mediaM += alturas[i];
                qtdMulheres += 1;
            }
        }
        
        for(int i = 0; i<n; i++){    
        if(generos[i] == 'm' || generos[i] == 'M'){
                qtdHomens += 1;
        }
    }
        
        mediaM = mediaM / qtdMulheres;
        
        System.out.printf("Media das alturas das mulheres = %.2f%n",  mediaM);
        System.out.println("Numero de homens = " + qtdHomens);
        
        
sc.close();
    }
    
}
