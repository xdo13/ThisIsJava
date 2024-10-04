package ch03.sec11;

public class ConditionalOperation {
    public static void main(String[] args) {
        int score = 65;
/*        char grade ;

        if ( score > 90)
            grade ='A';
        else
            grade = 'B';
*/
        //삼항연산자, if문을 대체할수있다
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' :
                (score>50) ? 'E': 'F');
        System.out.println(score + "점은 " + grade + " 등급입니다.");
    }
}
