package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try{
            findClass();
        }catch(ClassNotFoundException e){
            System.out.println("예외 처리: "+e.toString()); //에러에 발생한 문자를 출력하는 문구
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
