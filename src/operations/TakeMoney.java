package operations;

import ATM.ATM;
import ATM.Account;
import Owner.OwnerOfTheCard;

public class TakeMoney extends Operation{

    private String currency;
    private double amount;

    public TakeMoney(){
        operationName = "Забрать деньги";
    }

    public Boolean checkSolvency(Account account, double checkMoney){
        Boolean check = false;
        if (account.amountOnTheAccount() > checkMoney)
            check = true;
        return check;
    }

    public Boolean takeMoney (Account account, ATM atm, OwnerOfTheCard ownerOfTheCard, double money) {
        Boolean check = false;
        if (checkSolvency(account, money)){
            check = true;
            atm.giveOutMoney(money);
            ownerOfTheCard.takeCash(money);
        }
        return  check;

    }
}
