import menu.languageMenu.LanguageMenu;
import menu.operationMenu.OperationMenu;

public class MainApp {
    public static void main(String[] args) {
        LanguageMenu languageMenu = new LanguageMenu();
        languageMenu.greet();
        languageMenu.languageSelect();

        OperationMenu operationMenu = new OperationMenu();
        operationMenu.setCard();
        operationMenu.choseOption();
    }
}
