package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(15);  //최대 볼륨 10을 넘으면 최대 볼륨인 10으로 설정되게해서 10출력
        rc.turnOff();

        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(-5);  //최소 볼륨 0보다 낮으면 최소 볼륨인 0으로 설정되게해서 0출력
        rc.turnOff();
    }
}
