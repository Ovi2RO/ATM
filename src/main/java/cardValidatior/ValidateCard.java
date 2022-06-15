package cardValidatior;

import cardConstructor.CardCvv2Constructor;
import cardConstructor.CardExpDateConstructor;
import db.model.Card;
import java.util.Date;


public class ValidateCard {
    private Card card;

    private void validCard(){
        CardNumberValidator cardNumberValidator = new CardNumberValidator();
        card = cardNumberValidator.cardIsValid();
    }

    private void validCvv2(){
        CardCvv2Constructor cvv2Constructor = new CardCvv2Constructor();
        String cvv2construct = cvv2Constructor.constructCvv2WithNumber();
        if(card.getCvv2() != cvv2construct){
            System.out.println("Cvv2 incorrect! Retry!");
            validCvv2();
        }
    }

    private void validExpDate(){
        CardExpDateConstructor expDateConstructor = new CardExpDateConstructor();
        Date expDateConstruct = expDateConstructor.constructCardDateWithScanner();
        if(card.getCardExpDate() != expDateConstruct){
            System.out.println("Expiration date incorrect! Retry!");
            validExpDate();
        }
    }

    public Card getCard(){
        validCard();
        validCvv2();
        validExpDate();
        return card;
    }
}
