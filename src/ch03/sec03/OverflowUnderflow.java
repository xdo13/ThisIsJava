package ch03.sec03;

public class OverflowUnderflow {
    public static void main(String[] args) {
        byte var1 = 125;
        //메모리가 0부터 시작해서 보통 int i =0을 쓴다
        for(int i =0; i<5; i++){
            var1 ++;
            System.out.println("var1 : "+ var1);
        }

        System.out.println("-----------------------");

        byte var2 = -125;
        for (int i = 0; i <5; i++){
            var2--;
            System.out.println("var2: " + var2);
        }
    }
}
