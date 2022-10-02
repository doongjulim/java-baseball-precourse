package baseball.controller;

public class InputCodeController {
    public void inputCode(String data){
        if(expInputData(data)){

        }
    }

    private Boolean expInputData(String data){
        if (data.length() != 3){
            throw new IllegalArgumentException();
        }
        return true;
    }
}

