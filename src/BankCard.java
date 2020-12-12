public class BankCard {

    private int pinCode;
    private int number;
    private String type;

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
}

