package operations;

import UI.UserWindow;

public class Operation {

    private  Check check;
    protected String operationName;
    public UserWindow userWindow;

    public void execute(){

    }

    public String getOperationName(){
        return operationName;
    }

    public void setUserWindow(UserWindow userWindow) {
        this.userWindow = userWindow;
    }
}
