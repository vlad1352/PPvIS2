package operations;


import ATM.Account;

public class AccountView extends Operation {

    public AccountView(){
        operationName = "Просмотр счёта";
    }

    @Override
    public void execute(){
        userWindow.createWindow(this);
    }

    public double withdraw(Account account){
        return account.amountOnTheAccount();
    }
}
