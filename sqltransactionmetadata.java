import java.sql.*;
public class transaction {
    public static void   main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(jdbc_url, name, pwd);
        String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
        String name = scott;
        String pwd = tiger;
        DatabaseMetaData dmbd = con.getMetaData();
        System.out.println(dmbd.getDatabaseProductName());
        System.out.println(dmbd.getDatabaseProductVersion());
        System.out.println(dmbd.getDatabaseMajorVersion());
        System.out.println(dmbd.getDatabaseMinorVersion());
        System.out.println(dmbd.getJDBCMajorVersion());
        System.out.println(dmbd.getJDBCMinorVersion());
        System.out.println(dmbd.getDriverName());
        System.out.println(dmbd.getDriverVersion());
        System.out.println(dmbd.getURL());
        System.out.println(dmbd.getUserName());
        System.out.println(dmbd.getMaxColumnsInIndex());
        System.out.println(dmbd.getMaxRowSize());
        System.out.println(dmbd.getMaxStatementLength());
        System.out.println(dmbd.getMaxTableNameLength());
        System.out.println(dmbd.getSQLKeywords());
        System.out.println(dmbd.getSystemFunctions());
        System.out.println(dmbd.supportsSavepoints());
        System.out.println(dmbd.supportsFullOuterJoins());
        System.out.println(dmbd.supportsStoredProcedures());
    } 
}
        
