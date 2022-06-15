package menu.languageMenu;

import java.util.Locale;
import java.util.Scanner;

public class LanguageMenu {

    public void greet(){
        System.out.println("Welcome!");
    }

    public void languageSelect() {
        System.out.println("Please select language!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Romana\nEnglish\nFrench\n>");
        String selectedLanguage = scanner.nextLine();
        selectedLanguage = selectedLanguage.toLowerCase(Locale.ROOT);

        if (selectedLanguage.equals("romana")) {
            System.out.println("Ati ales limba Romana!");

        }

        else if (selectedLanguage.equals("english")) {
            System.out.println("You have chosen the english language!");

        }

        else if (selectedLanguage.equals("french")) {
            System.out.println("Vous avez choisi le français!");

        }

        else {
            System.out.println("Unknown language!");
            languageSelect();
        }
    }
}

