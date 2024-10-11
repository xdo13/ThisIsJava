package ch06.sec07.exam03;

public class KoreanExam {
    public static void main(String[] args) {
        Korean kor = new Korean();
        Korean kor1 = new Korean("kim");

        Korean kor2 = new Korean("kwon","blue");
        System.out.println("1차이름 " + kor1.name);

        System.out.println("2차이름 "+ kor2.name);
        System.out.println("2차색상 "+ kor2.ssn);
    }
}
