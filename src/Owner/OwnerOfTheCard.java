package Owner;

import ATM.ATM;
import  ATM.BankCard;

public class OwnerOfTheCard {
    private BankCard bankCard;
    private Money money = new Money();

    public  void insertCard(ATM atm){
        atm.acceptCard(bankCard);

    }

    public  void pickUpTheCard(ATM atm){
        bankCard = atm.returnCard();
    }

    public void depositCash(ATM atm, double money){

    }

    public void takeCash(double money){
        this.money.addMoney(money);
    }

    public String insert() {
        String str = "";
        return str;
    }
}

