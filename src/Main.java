import ATM.*;
import Owner.*;
import UI.*;

public class Main {

    Main(){
        ATM atm = new ATM();

        Money money = new Money();
        money.setAmountOfMoney(2000);
        money.setCurrency("BYN");
        atm.setAtmMoney(money);

        UserWindow userWindow = new UserWindow(atm);
        atm.setUserWindow(userWindow);
        atm.setOperations();

        BankCard bankCard = new BankCard();
        Account account = new Account(bankCard);
        atm.setBankCard(bankCard);


    }

    public static void main(String[] args) {
        new Main();

    }

}
