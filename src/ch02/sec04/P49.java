package ch02.sec04;

//데이터 타입 실습 float와 double의 유효자릿수 차이 실습
public class P49 {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1: "+ var1);
        System.out.println("var2: "+ var2);

        //10진수 리터럴 확인
        double var3 = 3e6;
        float var4 = 3e5F;
        double var5 = 2e-3;
        double var6 = 3e2;
        System.out.println("var3: "+ var3);
        System.out.println("var4: "+ var4);
        System.out.println("var5: "+ var5);
        System.out.println("var6: "+ var6);


    }
}
