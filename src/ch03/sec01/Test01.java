package ch03.sec01;

import java.util.Scanner;
//홀수, 짝수를 구분하는 프로그램
public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1 이상의 정수를 입력하세요 :");
        int a = stdIn.nextInt();

        if(a % 2 == 1)
            System.out.println("입력한 정수는 홀수입니다");
        else if(a % 2 == 0)
            System.out.println("입력한 정수는 짝수입니다");
        else
            System.out.println("잘못된 입력입니다");

    }
}
