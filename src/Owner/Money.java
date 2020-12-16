package Owner;

public class Money {
    private String currency;
    private double amountOfMoney = 100;

    public void addMoney(double money){
        amountOfMoney += money;
    }

    public void deductMoney(double money){
        amountOfMoney -= money;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
