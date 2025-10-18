package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            System.out.println("input: " + input);

        } catch (IOException e) {
            throw new IllegalArgumentException("입력 처리 중 오류가 발생했습니다.");
        }
    }
}
