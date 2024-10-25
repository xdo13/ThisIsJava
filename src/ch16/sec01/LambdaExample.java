package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        // 덧셈을 수행하는 람다 표현식
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        // 뺄셈을 수행하는 람다 표현식
        action((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });
    }


//action 함수와 데이터
    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);

    }
}
