package ch06.sec11.exam01;
//final필드 예제 실습
public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final필드를 쓴 ssn과 nation은 값을 변경 할수 없다 but 초기값은 들어감
        //k1.nation = "USA";
        //k1.ssm = "123-12";

        k1.name= "김자바";
        //final 필드가 아닌 값은 변경이 가능하다
    }
}
