public class MoneyTranfer extends Operation {
    private int recipient;
    private int amountOfMoney;

    @Override
    public void execute(){

    }

    public Boolean checkSolvency(Account account){
        Boolean check = false;

        return check;
    }

    public Boolean makeATransfer(Account account){
        Boolean tranfer = false;

        return tranfer;
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
