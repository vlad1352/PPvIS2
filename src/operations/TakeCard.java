package operations;

import ATM.ATM;

public class TakeCard extends Operation{


    public TakeCard(){
        operationName = "Забрать карту";
    }

    @Override
    public void execute(){
        userWindow.createWindow(this);

    }

    public void takeCard(ATM atm){
        atm.returnCard();
    }

}
