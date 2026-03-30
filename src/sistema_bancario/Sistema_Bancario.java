//Codigo de sistema bancário
//Cadastro de usuário, deposito efetuado pelo usuário, retirada de dinheiro efetuada pelo usuário com taxa de 5.00.


package sistema_bancario;

import java.util.Locale;
import java.util.Scanner;
import sistema_bancario.application.Account;
        
public class Sistema_Bancario {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        
        System.out.print("Is there an inintial deposit(y/n)? ");
        char open = sc.next().charAt(0);

        if(open == 'y'){
            System.out.print("Enter the initial deposit value: ");
            double InitialValue = sc.nextDouble();
      
            account = new Account(number, name, InitialValue);
        }
        
        else{
            account = new Account(number, name);
        }
        
        System.out.println();
        System.out.println("Account data: \n" + account);
        
        
        System.out.println();
        System.out.print("Enter deposit value: ");
        double ValueDeposit = sc.nextDouble();
        account.Addeposit(ValueDeposit);
        
        System.out.println("Updated account data: \n" + account);
        
        System.out.println();
        System.out.print("Enter de withdraw value: ");
        double valueWithdraw = sc.nextDouble();
        account.removeDeposit(valueWithdraw);
        
        System.out.println("Updated account data: \n" + account);

        
        

        
        
        sc.close();
    }
    
}
