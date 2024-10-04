package ch03.sec05;

public class InfinityAndNan {
    public static void main(String[] args) {
        int x =5;
        double y =0.0;
        double z = x/y;
        //double z = x%y;

        System.out.println(z + 2);
        //Infinity가 나오는것을 값 산출 불가로 나오게 하는 코드 ->try catch
        if (Double.isInfinite(z) || Double.isNaN(z)) { //false 일 경우에만 출력 -1
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z + 2);//false 일 경우에만 출력-1
        }
    }
}
