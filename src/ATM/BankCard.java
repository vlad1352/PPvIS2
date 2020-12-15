package ATM;

public class BankCard {

    private int pinCode = 1111;
    private int number = 12345678;
    private String type;
    private Account account = new Account(this);


    public int getPinCode(){
        return pinCode;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        number = num;
    }

    public void setPinCode(int pin){
        pinCode = pin;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

