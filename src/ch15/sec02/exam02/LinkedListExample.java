package ch15.sec02.exam02;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // ArrayList 객체 생성
        List<String> list1 = new ArrayList<String>();

        // LinkedList 객체 생성
        List<String> list2 = new LinkedList<String>();

        long startTime; // 시작 시간을 저장할 변수
        long endTime;   // 종료 시간을 저장할 변수

        // ArrayList에 10000개의 요소를 앞에 추가하는 데 걸린 시간 측정
        startTime = System.nanoTime(); // 시작 시간 기록
        for (int i = 0; i < 10000; i++) {
            // 0번째 인덱스에 요소 추가
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime(); // 종료 시간 기록
        // ArrayList의 걸린 시간 출력
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));

        // LinkedList에 10000개의 요소를 앞에 추가하는 데 걸린 시간 측정
        startTime = System.nanoTime(); // 시작 시간 기록
        for (int i = 0; i < 10000; i++) {
            // 0번째 인덱스에 요소 추가
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime(); // 종료 시간 기록
        // LinkedList의 걸린 시간 출력
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));
    }
}
