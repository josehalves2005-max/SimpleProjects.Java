package Student_Class;

import java.util.Locale;
import java.util.Scanner;

public class Ex_fixacao3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();

        
        System.out.print("Type your name: ");
        student.name = sc.nextLine();
        
        System.out.println("Type your grade from three semesters: ");
        student.first = sc.nextDouble();
        student.second = sc.nextDouble();
        student.third = sc.nextDouble();
        
        
        if (student.grade() > 60.00){
            System.out.println("FINAL GRADE = " + student.grade());
            System.out.println("Pass ");
        }
        else{
            System.out.println("FINAL GRADE = " + student.grade());
            System.out.println("FAILED ");
            System.out.printf("MISSING %.2f POINTS%n", student.missing());
        }
        
        
        


    }
    
}
