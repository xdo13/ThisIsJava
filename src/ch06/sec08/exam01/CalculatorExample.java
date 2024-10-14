package ch06.sec08.exam01;

// CalculatorExample 클래스: Calculator 클래스를 사용해보는 예제
public class CalculatorExample {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator(); // Calculator 클래스의 인스턴스를 생성

        myCalc.powerOn();

        int result1 = myCalc.plus(5,6);
        //Calculator 클래스에 있는 덧셈 수행해서 대입
        System.out.println("result1: " + result1);
        int x =10;
        int y =4;
        double result2 = myCalc.divide(x,y);
        //Calculator 클래스에 있는 나눗셈 수행해서 대입
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
