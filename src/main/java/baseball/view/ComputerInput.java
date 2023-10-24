package baseball.view;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class ComputerInput {

    public static ArrayList<Integer> computer(){
        ArrayList<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
