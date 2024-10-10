package ch05.sec03;

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3 };
        arr2 = new int[] {1,2,3 };
        arr3 = arr2;
        //주소를 비교 값을 비교하고 싶으면 equals 를 쓰면 된다
        System.out.println(arr1 == arr2);

        System.out.println(arr2 == arr3);


    }
}
