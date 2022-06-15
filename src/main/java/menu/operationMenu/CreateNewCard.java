package menu.operationMenu;

import cardConstructor.*;
import db.dao.CardDao;
import db.model.Card;

import java.util.Date;

public class CreateNewCard {
    private String cardNumber;
    private String cvv2;
    private Date cardExpDate;
    private String ownerFirstName;
    private String ownerLastName;
    private double balance = 100.00;

    private Card newCard(){
        this.cardNumber = String.valueOf(new CardNoConstructor());
        this.cvv2 = String.valueOf(new CardCvv2Constructor());
        this.cardExpDate = new CardExpDateConstructor();
        this.ownerFirstName = String.valueOf(new CardOwnerFirstNameConstructor());
        this.ownerLastName = String.valueOf(new CardOwnerLastNameConstructor());

        Card card = new Card(cardNumber, cvv2, cardExpDate, balance, ownerFirstName, ownerLastName);

        return card;
    }

    public void addCardDao(){
        CardDao cardDao = new CardDao();
        Card card = newCard();
        cardDao.addNewCard(card);
    }
}
