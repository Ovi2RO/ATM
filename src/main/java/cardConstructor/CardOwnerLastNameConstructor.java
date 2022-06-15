package cardConstructor;

import java.util.Scanner;

public class CardOwnerLastNameConstructor {
    private Scanner scan = new Scanner(System.in);
    private String ownerLastName;

    public String constructCardNumberWithScanner(){
        System.out.print("Please insert your first name: ");
        ownerLastName = scan.nextLine();

        if (ownerLastName == null) {
            System.out.println("First name incorrect!");
            constructCardNumberWithScanner();
        }
        return ownerLastName;
    }
}
