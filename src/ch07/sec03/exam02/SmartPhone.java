package ch07.sec03.exam02;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color){
        super(model, color);
        //초기값을 안줬기때문에 상속이 없으면 쓰지 못함
        System.out.println("SmartPhone(String model, String color)생성자 실행됨.");
    }
}
