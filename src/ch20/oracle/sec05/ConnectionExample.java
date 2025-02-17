package ch20.oracle.sec05;
// 연결확인하는 코드
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {

        Connection conn = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe",
                    "java",
                    "oracle"
            );

            System.out.println("연결 성공");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("연결 끊기");
                }catch (SQLException e) {}
            }
        }
    }
}