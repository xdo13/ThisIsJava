package test;

import java.util.Scanner;
//학점구하기
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요 (0~100): "); int a = scanner.nextInt();

        if (a <101 && 0 <= a) {
            if (a >= 90) {
                System.out.println("학점은 A입니다");
            } else if (a >= 80) {
                System.out.println("학점은 B입니다.");
            } else if (a >= 70) {
                System.out.println("학점은 C입니다.");
            } else if (a >= 60) {
                System.out.println("학점은 D입니다");
            } else
                System.out.println("학점은 F입니다.");
        }
        else
            System.out.println("잘못된 입력입니다");
    }
}
