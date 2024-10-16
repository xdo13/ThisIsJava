package ch07.sec02.exam01;

public class SmartPhone extends Phone{
    public boolean wifi ;

    public SmartPhone(String model, String color){
        //super(); 자동으로 만들어지지만 매개변수가 들어갈경우 직접 만들어야한다
        this.model = model;
        this.color = color;
        //초기값을 안줬기때문에 상속이 없으면 쓰지 못함

    }
    public void setWifi(boolean wifi){
        this.wifi = wifi ;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
