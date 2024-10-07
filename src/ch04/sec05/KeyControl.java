package ch04.sec05;

import java.util.Scanner;

public class KeyControl {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 종료");
            System.out.println("-------------------------");
            System.out.print("선택 : ");

            String strNum = stdIn.nextLine();

            if (strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = " + speed);
            }else if (strNum.equals("2")){
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {
                break;  //run = false
            }
        }
        System.out.println("프로그램 종료");
    }
}
