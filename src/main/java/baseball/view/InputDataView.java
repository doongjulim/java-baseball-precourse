package baseball.view;

import baseball.controller.InputCodeController;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class InputDataView {

    public void statingGame(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1,9,3);
        inputDataScanner(numbers);
    }
    private void inputDataScanner(List<Integer> numbers) {
        while (true){
            System.out.print("숫자를 입력해주세요 : ");
            String data = Console.readLine();
            new InputCodeController().inputCode(data, numbers);
        }
    }
}