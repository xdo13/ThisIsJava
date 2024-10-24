package ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor //모든인자를 갖는 생성자
@Getter @Setter  //롬복 활용

public class Board {
    private String subject;
    private String content;
    private String writer;



}
