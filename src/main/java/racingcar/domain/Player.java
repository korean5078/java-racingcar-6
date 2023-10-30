package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<String> inputNames() throws IllegalArgumentException {
        String[] inputs = Console.readLine().split(",");
        List<String> names = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        for (String name : inputs) {
            validateName(name);
            names.add(name);
        }

        return names;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}