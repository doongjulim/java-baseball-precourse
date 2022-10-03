package baseball.model;

import java.util.Arrays;
import java.util.List;

public class InputCodeModel {
    public void dataInspection(String data, List<Integer> numbers){
        List<String> datas = Arrays.asList(data.split(""));
        int strike = 0;
        int ball = 0;
        for (int i=0;i<3;i++){
            Integer nowData = Integer.valueOf(datas.get(i));
            strike = strikeCounting(nowData,numbers.get(i),strike);
            ball = ballCounting(nowData,numbers,ball,i);
        }
    }
    private int strikeCounting(Integer data, Integer number, int strike){
        if(data == number){
            strike += 1;
        }
        return strike;
    }

    private int ballCounting(Integer data, List<Integer> numbers, int ball, int step){
        if(numbers.indexOf(data) != step && numbers.indexOf(data) > -1){
            ball += 1;
        }
        return ball;
    }
}
