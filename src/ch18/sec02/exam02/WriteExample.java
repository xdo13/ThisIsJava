package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            //파일 열기
            OutputStream os = new FileOutputStream("C:Temp/test2.db");

            byte [] array = { 10, 20, 30 };

            os.write(array);

            //즉시 데이터를 보냄/ 안하면 파일에 데이터가 기록되지 않을 수 있음
            os.flush();
            //파일 닫기
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
