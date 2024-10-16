package ch07.sec02.exam01;

public class Phone {
    public  String model;
    public  String color;
//기본 생성자는 직접 만들지 않아도 자동으로 만들어진다.

    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void  sendVoice(String message){
        System.out.println("자기: " + message);
    }
    public void receiveVoice(String message){
        System.out.println(("상대방: " + message));
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }
}
