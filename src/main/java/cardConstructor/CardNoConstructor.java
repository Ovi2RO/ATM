package cardConstructor;

import java.util.Scanner;

public class CardNoConstructor {
    private Scanner scan = new Scanner(System.in);
    private String cardNumber;

    public String constructCardNumberWithScanner(){
        System.out.print("Please insert your card number: ");
        cardNumber = scan.nextLine();

        if (cardNumber != null) {
            int cardLength = cardNumber.length();

            if (cardLength != 6) {
                System.out.println("Card number incorrect!");
                constructCardNumberWithScanner();
            }
        }
        return cardNumber;
    }
}
