package ch05.sec03;
//null값을 넣고 자료형이나 길이를 재는것은 오류가 발생한다
public class NullPointerException {
    public static void main(String[] args) {
        int[] intArray = null/*{1,2,3}*/;
        //intArray[0] = 10;
       // System.out.println(intArray[0]);
        String str = "free";
        System.out.println("총 문자 수 : "+ str.length());
    }
}
