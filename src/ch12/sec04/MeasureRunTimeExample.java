package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime(); // 루틴 실행전 시간 체크
        int sum = 0;
        for (int i =1; i<=1000000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime(); //루틴 실행이 끝난 시간 체크

        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println(("계산에 " + (time2-time1) + " 나노초가 소요되었습니다."));
    }
}
