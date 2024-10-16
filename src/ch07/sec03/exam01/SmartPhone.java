package ch07.sec03.exam01;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color){
        super();// 자동으로 만들어지지만 매개변수가 들어갈경우 직접 만들어야한다
        this.model = model;
        this.color = color;
        //초기값을 안줬기때문에 상속이 없으면 쓰지 못함
        System.out.println("\"SmartPhone(String model, String color)생성자 실행됨.\"");
    }

}
