package ch08.sec02;

//extends는 한개뿐만 상속되지만 interface는 다중상속이 가능함
public class Television implements RemoteControl{
    @Override

    public void turnOn(){
        System.out.println("TV를 켭니다");
    }

}
