package test;

import java.util.Scanner;
//팩토리얼 함수 구하기
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.println(factorial(a));
    }

        public static int factorial (int x) {
        int result = 1;
        for (int i= 1; i <= x; i++) {
            result = result * i;
        }
            return result;
        }



}
