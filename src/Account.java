public class Account {

    private  double amountOfMoney;
    private BankCard bankCard;

    public double amountOnTheAccount(){
        return amountOfMoney;
    }

    public Boolean withdrawMoney(double amount) {
        Boolean check;
        if (amountOfMoney - amount >= 0) {
            check = true;
            amountOfMoney -= amount;
        }
        else {
            check = false;
        }
        return check;
    }

    public void setAmountOfMoney(double amount){
        amountOfMoney = amount;
    }


    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }
}
