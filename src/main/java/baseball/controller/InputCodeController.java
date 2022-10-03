package baseball.controller;

import baseball.model.InputCodeModel;

import java.util.List;

public class InputCodeController {
    public void inputCode(String data, List<Integer> numbers){
        expLengthInputData(data);
        expNumberInputData(data);
        new InputCodeModel().dataInspection(data,numbers);
    }
    private void expLengthInputData(String data){
        if (data.length() != 3){
            throw new IllegalArgumentException("문자열 입력 길이 오류");
        }
    }
    private void expNumberInputData(String data){
        if(!data.matches("[0-9]+")){
            throw new IllegalArgumentException("숫자가 아닌 값 입력");
        }
    }
}

