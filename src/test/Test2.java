package test;

import java.util.Scanner;
//1-10만 출력 또는 A-Z만 출력
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String input = scanner.nextLine();

        char inData = input.charAt(0);

        if ((inData >= '0' && inData <='9') || (inData >= 'A' && inData <='Z')){
            System.out.println(inData);
            System.out.println("유효한 숫자 또는 문자입니다");
        }else{
            System.out.println("유효하지않은 데이터입니다.");
        }

    }
}
