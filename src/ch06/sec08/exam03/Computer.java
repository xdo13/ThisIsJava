package ch06.sec08.exam03;

public class Computer {
    int sum(int ... values){ // 가변길이 매개변수
        int sum = 0;

        for (int i =0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
