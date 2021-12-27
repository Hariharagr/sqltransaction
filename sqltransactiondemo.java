import java.sql.*;
import java.util.*;
public class sqltransactiondemo {
    public static void   main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(jdbc_url,name,pwd);
        String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE"; String name = scott; String pwd = tiger;
        Statement st = con.createStatement();
        System.out.println("database before transaction");
        ResultSet rs = st.executeQuery("select * from table");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"....."+rs.getString(2));}
            System.out.println("intialization of transaction");
        con.setAutoCommit(false);
        st.executeQuery("update accounts set balance=balance-10000 where name ='name1'");
        st.executeQuery("update accounts set balance=balance+10000 where name ='name2'");
        System.out.println("continue transaction[YES/NO]");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        if(option.equalsIgnoreCase("yes")){
            con.commit();
           System.out.println("transaction completed");}
        else { con.rollback(); System.out.println("transaction declined");}
        System.out.println("database after transaction");
        ResultSet rs1 = st.executeQuery("select * from table");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"....."+rs.getString(2));}
        con.close();}


    }
}