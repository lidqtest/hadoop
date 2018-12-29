package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveConnect {
    public static void main(String[] args) throws  Exception {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.203.136:10000/default","root","hadoop");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select code,salary from default.sample_07");
        while(rs.next()){
            System.out.println(rs.getInt(1) + "," + rs.getString(2)) ;
        }
        rs.close();
        st.close();
        conn.close();
    }
}
