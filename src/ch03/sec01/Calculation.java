package ch03.sec01;

import java.util.Scanner;

// 숫자를 입력받아서 사칙연산을 하는 계산기
public class Calculation {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 :"); int a = stdIn.nextInt();
        System.out.print("두번째 정수를 입력하세요 :"); int b = stdIn.nextInt();

        double c = (double)a/b;

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        //System.out.println("나누기 = " + (a/(double)b));
        System.out.printf("나누기 = %3.3f", c);
    }
}
