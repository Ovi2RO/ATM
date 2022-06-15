package cardConstructor;

import java.util.Scanner;

public class CardCvv2Constructor {
    private Scanner scan = new Scanner(System.in);
    private String cvv2;


    public String constructCvv2WithNumber(){
        System.out.print("Please insert your card cvv2 number: ");
        cvv2 = scan.nextLine();

        if (cvv2 != null) {
            int cardLength = cvv2.length();

            if (cardLength != 3) {
                System.out.println("Card number incorrect!");
                constructCvv2WithNumber();
            }
        }
        return cvv2;
    }
}
