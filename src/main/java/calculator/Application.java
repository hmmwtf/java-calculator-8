package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        if (input.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }

        String[] numbers;
        String delimiter = ",|:";

        if (input.startsWith("//")) {
            int lineIndex = input.indexOf("\\n");

            if (lineIndex == -1) {
                lineIndex = input.indexOf("\n");
            }

            if (lineIndex == -1) {
                throw new IllegalArgumentException();
            }

            delimiter = input.substring(2, lineIndex);

            if (lineIndex + 2 < input.length()) {
                input = input.substring(lineIndex + 2);
            } else {
                input = "";
            }
        }

        numbers = input.split(delimiter);
        int sum = 0;
        for (String number : numbers) {
            int n = Integer.parseInt(number);
            if (n < 0) {
                throw new IllegalArgumentException();
            }
            sum += n;
        }

        System.out.println("결과 : " + sum);
    }
}
