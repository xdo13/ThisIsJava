package test;

import java.util.Scanner;
// 키보드로 입력된 숫자가 양수, 음수, 0을 판단하는 프로그램
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수를 입력하시오 :"); int a = scanner.nextInt();

        if (a > 0){
            System.out.println("양수입니다");
        }else if (a<0){
            System.out.println("음수입니다");
        }else
            System.out.println("0입니다");

    }
}
