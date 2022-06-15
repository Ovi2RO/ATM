package cardValidatior;

import db.dao.CardDao;
import db.model.Card;

import java.util.Scanner;

public class CardNumberValidator {
    private Scanner scan = new Scanner(System.in);
    private String cardNumber;
    private Card card;

    private String validateCardNumberWithScanner(){
        System.out.print("Please insert your card number: ");
        cardNumber = scan.nextLine();

        if (cardNumber != null) {
            int cardLength = cardNumber.length();

            if (cardLength != 6) {
                System.out.println("Card number incorrect!");
                validateCardNumberWithScanner();
            }
        }
        return cardNumber;
    }

    private Card validateCardNumberWithDb(){
        try {
            Card card1 = new CardDao().getCardByCardNo(cardNumber);
            card = card1;
        } catch (Exception e){
            System.out.println("Card number incorrect!");
        }
        return card;
    }

    public Card cardIsValid(){
        validateCardNumberWithScanner();
        validateCardNumberWithDb();
        if(card != null){
            System.out.println("Card number found!");
        } else {
            cardIsValid();
        }
        return card;
    }
}
