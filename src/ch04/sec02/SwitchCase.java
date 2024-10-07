package ch04.sec02;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");  int score = stdIn.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("점수는 0에서 100 사이여야 합니다.");
        } else {
            switch (score / 10) { // 10의 자리로 나누어 범위를 확인
                case 10: // 100점에서 90점이어도 break가 없어 case9로 넘어가게됨
                case 9:  // 90-99점
                    System.out.println("점수가 90-100입니다");
                    System.out.println("등급은 A입니다");
                    break;
                case 8:  // 80-89점
                    System.out.println("점수가 80-89입니다");
                    System.out.println("등급은 B입니다");
                    break;
                case 7:  // 70-79점
                    System.out.println("점수가 70-79입니다");
                    System.out.println("등급은 C입니다");
                    break;
                case 6:  // 60-69점
                    System.out.println("점수가 60-69입니다");
                    System.out.println("등급은 D입니다");
                    break;
                default: // 0-59점
                    System.out.println("점수가 60보다 작습니다");
                    System.out.println("등급은 E입니다");
                    break;
            }
        }
    }
}
