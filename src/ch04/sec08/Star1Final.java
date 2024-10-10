package ch04.sec08;

public class Star1Final {
    // 각 줄에 1, 3, 5, 7, 5, 3, 1개의 별을 찍는 문제. 최종 풀이코드.
    public static void main(String[] args) {
        for(int i=-3; i<=3; i++)
            // String 클래스의 repeat 메소드 + Math 클래스의 abs()메소드를 사용해 풀이
            System.out.println(" ".repeat(Math.abs(i)) + "*".repeat(7 - (2*Math.abs(i))));
    }
}