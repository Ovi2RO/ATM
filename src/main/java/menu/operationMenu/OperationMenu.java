package menu.operationMenu;

import cardValidatior.ValidateCard;
import db.model.Card;
import java.util.Locale;
import java.util.Scanner;

public class OperationMenu{
    private Card card;

    public void setCard(){
        ValidateCard validateCard = new ValidateCard();
        card = validateCard.getCard();
    }

    public void choseOption() {


        Scanner scan = new Scanner(System.in);
        System.out.println("Possible operations are:");
        System.out.println("Query balance\nCash withdrawal\nDeposit\nAdd new card\nExit");

        String option = scan.nextLine().toLowerCase(Locale.ROOT);

        if (option.equals("query balance")) {
            System.out.println("Current balance is: " + card.getBalance());
            choseOption();
        }
        else if (option.equals("cash withdrawal")) {
            System.out.print("Enter the desired amount: ");
            Long sumaRetrasa = scan.nextLong();

            if (sumaRetrasa > card.getBalance()) {
                System.out.println("Insufficient credit!");
                choseOption();
            } else {
                System.out.println(sumaRetrasa + "have been withdrawn from your account!");
                double newBalance = card.getBalance() - sumaRetrasa;

                card.setBalance(newBalance);
                choseOption();
            }
        }
        else if (option.equals("deposit")){
            System.out.print("Enter the desired amount: ");
            double sumaDepusa = scan.nextLong();
            double newBalance = card.getBalance() + sumaDepusa;
            card.setBalance(newBalance);
            choseOption();
        }
        else if (option.equals("add new card")) {
            System.out.println("Adding new card");
            CreateNewCard newCard = new CreateNewCard();
            newCard.addCardDao();
            choseOption();
        }

        else if (option.equals("exit")) {
            System.exit(0);
        }
    }
}
