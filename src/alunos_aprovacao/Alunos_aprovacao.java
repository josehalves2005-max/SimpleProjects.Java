package alunos_aprovacao;

import java.util.Locale;
import java.util.Scanner;

public class Alunos_aprovacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        
        String[] nome = new String[n];
        double[] notaUm = new double[n];
        double[] notaDois = new double[n];
        
        int contador = 0;
        String[] alunosAprovados = new String[n];
        
        for(int i = 0; i<n; i++){
            contador += 1;
        
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", contador);
            nome[i] = sc.next();
            sc.next();
            
            notaUm[i] = sc.nextDouble();
            notaDois[i] = sc.nextDouble();
                        
        }
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i<n; i++){
            if((notaUm[i] + notaDois[i]) / 2 >= 6){
                System.out.println(nome[i]);
            }
        }
            
        sc.close();

    }
}
