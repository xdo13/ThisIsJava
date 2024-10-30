package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            //파일 열기
            OutputStream os = new FileOutputStream("C:Temp/test1.db");

            byte a= 10;
            byte b= 20;
            byte c= 30;

            os.write(a);
            os.write(b);
            os.write(c);

            //즉시 데이터를 보냄/ 안하면 파일에 데이터가 기록되지 않을 수 있음
            os.flush();
            //파일 닫기
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
