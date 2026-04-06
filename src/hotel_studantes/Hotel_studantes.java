package hotel_studantes;

import java.util.Locale;
import java.util.Scanner;

public class Hotel_studantes {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        int numQ = 10;
        String[] rooms = new String[numQ];
        String[] emails = new String[numQ];
        int roomNumber = 0;
        
        for(int i = 0; i<n; i++){
            System.out.printf("Rent #%d:%n", (1+i));
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Room: ");
            roomNumber = sc.nextInt();
            
            System.out.println();
            
            if(roomNumber > 0){
                rooms[roomNumber] =  name;
                emails[roomNumber] =  email;
            }
        }
        System.out.println();
        
        System.out.println("Busy rooms:");
        for(int i = 0; i<numQ; i++){
            if(rooms[i] !=  null){
            System.out.printf("%d: %s, %s%n", (i), rooms[i], emails[i]);
            }
            }
        
        
     sc.close();
    }
        
}

