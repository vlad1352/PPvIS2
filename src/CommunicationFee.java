public class CommunicationFee extends Operation {
    private String type;
    private int number;
    private String operator;
    private double amountOfMoney;

    @Override
    public void execute() {

    }

    public Boolean checkSolvency(Account account){
        Boolean check = false;

        return check;
    }

    public Boolean makeATransfer(Account account){
        Boolean tranfer = false;

        return tranfer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
