package ch04.sec06;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        String inputString; // 사용자 입력을 저장할 변수 선언

        // 프로그램 시작 메시지 출력
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        // do-while 루프 시작
        do {
            System.out.print(">");
            inputString = stdIn.nextLine(); // 사용자로부터 입력 받기
            System.out.println(inputString); // 입력된 메시지 출력
        } while (!inputString.equals("q")); // 입력이 "q"가 아닐 경우 루프를 계속 실행, string 클래스라 ==이 아닌 equals를 사용

        // 루프 종료 후 메시지 출력
        System.out.println();
        System.out.println("프로그램 종료");
    }
}