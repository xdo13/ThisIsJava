package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 예외 발생 (java.util.NoSuchElementException)
        // 주석 처리된 코드: 리스트가 비어있어 평균을 구할 수 없을 때 예외가 발생
        /*double avg= list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .getAsDouble();*/

        // 방법 1: Optional을 사용하여 평균 계산 / 코드가 길지만 가독성이 좋음
        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if (optional.isPresent()){
            System.out.println("방법1_평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0"); // 리스트가 비어있으면 0.0 출력
        }

        // 방법 2: orElse를 사용하여 기본값 설정 / 코드 간결
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0); // 리스트가 비어있으면 0.0 반환
        System.out.println("방법2_평균: " + avg);

        // 방법 3: ifPresent를 사용하여 값이 있을 때만 출력 / 명시적
        list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a)); // 값이 있으면 출력
    }
}
