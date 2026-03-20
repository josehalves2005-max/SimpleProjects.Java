package Employee_project;

import java.util.Locale;
import java.util.Scanner;

public class Ex_fixacao2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.Tax =  sc.nextDouble();
        
        System.out.println("employee: " + employee.name + " $ " + employee.NetSalary());
        
        System.out.print("Which percetage to increase salary? ");
        double percentage = sc.nextDouble();
        
        employee.IncreaseSalary(percentage);
        
        System.out.println(employee.text());
        
    }
    
    
}
