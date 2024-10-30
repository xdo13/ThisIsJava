package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * The {@code ReadExample} class demonstrates how to read characters from a file using
 * {@code FileReader} and {@code Reader} in two different approaches:
 * reading one character at a time and reading into a character array.
 * <br>
 * The class handles exceptions such as {@code FileNotFoundException} and {@code IOException}.
 * <br>
 * It contains the {@code main} method which serves as the entry point of the program execution.
 *
 * <ul>
 *     <li>In the first approach, it reads and prints one character at a time until end-of-file (EOF) is reached.</li>
 *     <li>In the second approach, it reads chunks of characters into a character array and prints them until EOF is reached.</li>
 * </ul>
 *
 * <strong>Note:</strong> The file path "C:/Temp/test.txt" should be adjusted to match the actual file location you are reading from.
 */
public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            // 한 문자씩 읽기
            reader = new FileReader("C:Temp/test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.print((char) data);
            }
            reader.close();
            System.out.println();

            //문자 배열로 일기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}