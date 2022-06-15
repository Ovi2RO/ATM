package db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "CardInfo")
public class CardInfo {

    @Id
    @Column(name = "cardNumber")
    private String cardNumber;

    @Column(name = "cvv2")
    private String cvv2;

    @Column(name = "cardExpDate")
    private Date cardExpDate;


    public CardInfo() {
        super();
    }

    public CardInfo(String cardNumber, String cvv2, Date cardExpDate) {
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.cardExpDate = cardExpDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public Date getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(Date cardExpDate) {
        this.cardExpDate = cardExpDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardInfo)) return false;
        CardInfo cardInfo = (CardInfo) o;
        return Objects.equals(cardNumber, cardInfo.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }
}
