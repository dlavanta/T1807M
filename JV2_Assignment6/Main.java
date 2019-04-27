package JV2_assement6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String URL = "jdbc:mysql://locolhost:8889/t1807m";
            Connection conn = DriverManager.getConnection(URL,"t1807m","huy20011998");

            boolean start = true;
            Scanner scanner = new Scanner(System.in);
            while (start){
                System.out.println("Nha vao lua chon:");
                System.out.println("1.login");
                System.out.println("2. register");
                System.out.println("3. listing");
                System.out.println("4.delete");
                System.out.println("5. exit");

                int menu = scanner.hasNext()?scanner.nextInt():0;
                switch (menu){
                    case 1:login(conn); break;
                    case 2:break;
                    case 3:break;
                    case 4:break;
                    case 5:start= false;break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void login(Connection conn) throws Exception{
        Scanner username = scanner.nextLine();
        Statement statement = conn.createStatement();

        System.out.println("nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String sql = "SELECT * FROM user WHERE passwourd LIKE"+password + "'AND username LIKE '"+username+'";
                ResultSet rs = statement.executeQuery(sql);
        if(rs.next()){
            sys
        }

    }
}