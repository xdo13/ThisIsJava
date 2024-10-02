package ch03.sec01;
// 증감연산자 실습
public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int c = ++a + b++;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        //a = 6, b = 4, c = 9
    }
}
