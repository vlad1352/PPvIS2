package operations;


import ATM.Account;

public class MoneyTranfer extends Operation {
    private int recipient;
    private int amountOfMoney;

    public MoneyTranfer(){
        operationName = "Перевод денег";
    }

    @Override
    public void execute(){
        userWindow.createWindow(this);
    }

    public Boolean checkSolvency(Account account, double money){
        Boolean check = false;
        if(account.withdrawMoney(money))
            check = true;
        return check;
    }

    public Boolean makeATransfer(Account account, double money){
            return checkSolvency(account, money);
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
