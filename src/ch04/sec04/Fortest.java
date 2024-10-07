package ch04.sec04;

public class Fortest {
    public static void main(String[] args) {

       // int i;
        for (int i=1; i<=10; i++)
            System.out.print(i + " ");

        System.out.println();

        //여러가지 방법중에 수가 커질수록 속도가 빠른 것을 테스트하여 그것을 사용하는게 바람직함
        for (int i=0; i<10; i++)
            System.out.print((i+1) + " ");
    }
}
