package ch02.sec12;


//printf 활용 실습 및 숫자 뒤쪽에 정렬
public class P71 {
    public static void main(String[] args) {
        int value = 123;
        int age =2;
        System.out.printf("상품의 가격:%d\n", value);
        System.out.printf("상품의 가격:%6d\n", value);
        System.out.printf("상품의 가격:%-6d\n", value);
        System.out.printf("상품의 가격:%06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        System.out.printf("이름: %s, 나이:%s\n", name, job);
        //자릿수 조정
        System.out.printf("나이 : %3d\n", age);
        System.out.printf("나이 : %d \n", value);

        //자리올림 확인, 소수점자리 반올림해서 사라짐
        System.out.println("나의 실적률 : " + area+"\n");
        System.out.printf("나의 실적률 :%10.1f ", area);

    }
}
