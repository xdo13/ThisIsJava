package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);

        System.out.println("모델명은 " + myCar.model+"색깔은 " + myCar.color+"이고 최고속도는 " + myCar.maxSpeed + "입니다");
    }
}
