package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        // 메일 정보 배열 생성
        String[][] mails = new String[1000][3];
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "admin@my.com"; // 발신자
            mails[i][1] = "member" + i + "@my.com"; // 수신자
            mails[i][2] = "신상품 입고"; // 내용
        }

        // 스레드풀 생성 (고정 크기 5)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1000; i++) {
            final int idx = i; // 인덱스를 기호 상수로 설정
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread(); // 현재 스레드 정보
                    String from = mails[idx][0]; // 발신자
                    String to = mails[idx][1]; // 수신자
                    String content = mails[idx][2]; // 내용
                    // 메일 전송 출력
                    System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
                }
            });
        }

        executorService.shutdown(); // 스레드풀 종료
    }
}
