package lambdafunction_test;

public class LambdaFunctionExample {

    public static void main(String[] args) {
        Object obj;
       // obj = (a, b) -> a > b ? a : b;  / 람다식 익명 객체
      /* MyFunction2 f = new MyFunction2(){
            public int max(int a, int b){           //오버라이딩 = 접근제어는 못 바꿈
                return a > b ? a : b;
            }
        };
        */
       MyFunction2 f = (a, b) -> a >b ? a:b;
        int value = f.max(3, 5);
        System.out.println("value= " + value);
    }
}

