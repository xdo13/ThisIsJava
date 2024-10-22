package debugging;

public class Calculator {

    // 덧셈
    public double add(double a, double b) {
        double c= 0;
        c= a + b;
        return c;
    }

    // 뺄셈
    public double sub(double a, double b) {
        return a - b;
    }

    // 곱셈
    public double mul(double a, double b) {
        return a * b;
    }

    // 나눗셈
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("덧셈: " + calculator.add(a, b));
        System.out.println("뺄셈: " + calculator.sub(a, b));
        System.out.println("곱셈: " + calculator.mul(a, b));
        System.out.println("나눗셈: " + calculator.div(a, b));
    }
}
