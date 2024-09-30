package ch02.sec01;

//데이터 타입에 따른 허용 범위 테스트

public class Test {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 2147483647;
        System.out.println("a= " + a + " b= "+b);


        long c = 0;
        c = a + b;
        System.out.println("c= "+ c);
        //오류는 발생하지않지만 계산결과는 틀림
    }
}
