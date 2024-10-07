package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); int score = stdIn.nextInt();
        //int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90-100입니다");
            System.out.println("등급은 A입니다");
        }
        else if (score >= 80){
            System.out.println("점수가 80-89입니다");
            System.out.println("등급은 B입니다");
        }
        else if (score >= 70){
            System.out.println("점수가 70-79입니다");
            System.out.println("등급은 C입니다");
        }
        else if (score >=60){
            System.out.println("점수가 60-69입니다");
            System.out.println("등급은 D입니다");
        }
        else{
            System.out.println("점수가 60보다 작습니다");
            System.out.println("등급은 E입니다");
        }
    }
}
