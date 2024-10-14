package ch06.sec08.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer(); //인스턴스 생성

        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 : " +result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 : " +result2);

        int[] values = {1, 2, 3, 4, 5}; // 배열에 입력된 값들 더하기
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);

        int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result4: "+ result4);
    }
}
