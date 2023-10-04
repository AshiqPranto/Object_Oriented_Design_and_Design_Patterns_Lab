package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of Owner");
        String ownerName = scanner.next();
        System.out.println("Enter the age of Owner");
        int ownerAge = scanner.nextInt();
        System.out.println("Enter the address of Owner");
        String ownerAddress = scanner.next();
        System.out.println("Enter the email of Owner");
        String ownerEmail = scanner.next();
        System.out.println(ownerName + ownerAge + ownerAddress + ownerEmail);

        IOwner owner = new Owner(ownerName, ownerAge, ownerAddress, ownerEmail);
        System.out.println("owner name = " + owner.getOwnerName());

        // boolean checker = true;
        // int option;
        // while(checker)
        // {
        //     System.out.println("0 -> Exit");
        //     System.out.println("1 -> Add a Cat");
        //     System.out.println("2 -> Add a Dog");
        //     System.out.println("3 -> Add a Bird");

        //     option = scanner.nextInt();

        //     switch (option) {
        //         case 0:
        //             checker = false;
        //             break;
        //         case 1:

            
        //         default:
        //             break;
        //     }
        // }
    }
}
