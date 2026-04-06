package Employee_registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Employee_registration.application.Employees;

public class Employee_registration {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        
        List<Employees> employee = new ArrayList<>();
        
        
        for(int i = 0; i<n; i++){
            System.out.printf("Employee #%d%n", (i+1));
            
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            
            System.out.print("Name: ");
           sc.next();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            
            employee.add(i, new Employees(id, name, salary));
            }
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idSearch = sc.nextInt();
        
        
        Employees idFinder = employee.stream().filter(x -> x.getId().equals(idSearch)).findFirst().orElse(null);

        if(idFinder == null){
            System.out.println("This id does not exist! ");
        }
        else{
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

            idFinder.addSalary(percentage);
        }
        System.out.println();
        
        System.out.println("List of employees: ");       
            for(Employees l : employee){
                System.out.println(l);
        }
        
            
sc.close();
    }
    
}
