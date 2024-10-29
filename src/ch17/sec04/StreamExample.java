package ch17.sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Product> list = new ArrayList<>();

        // 1부터 5까지 반복하여 Product 객체를 생성하고 리스트에 추가
        for (int i = 1; i <= 5; i++) {
            // 랜덤 가격을 가진 Product 객체 생성
            Product product = new Product(i, "상품" + i, "멋진 회사", (int) (10000 * Math.random()));
            list.add(product); // 리스트에 Product 객체 추가
        }

        // 리스트에서 스트림을 얻음
        Stream<Product> stream = list.stream();

        // 각 Product 객체를 출력
        stream.forEach(p -> System.out.println(p));
    }
}