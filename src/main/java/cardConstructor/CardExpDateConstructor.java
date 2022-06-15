package cardConstructor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CardExpDateConstructor extends Date {
    private Scanner scan = new Scanner(System.in);
    private Date cardDate;


    public Date constructCardDateWithScanner(){
        System.out.print("Please insert card expiration month: ");
        String expDateMonth = scan.nextLine();
        System.out.print("Please insert card expiration year: ");
        String expDateAn = scan.nextLine();

        String expDate = expDateMonth + "-" + expDateAn;

        DateFormat formatter = new SimpleDateFormat("MM-yyyy");
        Date dataExpCard = null;
        try {
            dataExpCard = formatter.parse(expDate);
        } catch (ParseException e) {
            System.out.println("Input date incorrect");
            System.out.println(e);
        }

        if (!dataExpCard.after(new Date())) {
            System.out.println("Card date incorrect!");
            constructCardDateWithScanner();

        }
        return cardDate;
    }
}
