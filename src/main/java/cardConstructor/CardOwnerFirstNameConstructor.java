package cardConstructor;

import java.util.Scanner;

public class CardOwnerFirstNameConstructor {
    private Scanner scan = new Scanner(System.in);
    private String ownerFirstName;

    public String constructCardNumberWithScanner(){
        System.out.print("Please insert your first name: ");
        ownerFirstName = scan.nextLine();

        if (ownerFirstName == null) {
            System.out.println("First name incorrect!");
            constructCardNumberWithScanner();
        }
        return ownerFirstName;
    }
}
