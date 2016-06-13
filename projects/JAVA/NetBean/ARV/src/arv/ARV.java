package arv;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.*;
import javax.swing.table.*;

/**
 *
 * @author Elev8
 */
public class ARV {

    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/db1"
            + "?verifyServerCertificate=false" 
            + "&useSSL=false"
            + "&requireSSL=true";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";
 
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    

    
    public static void main(String[] args) {
        
//        Book JustBook = new Book("123456","111111111", "Unknown", 100000);
//        JustBook.skrivUt();
//        ChildrensBook enBarnBok = new ChildrensBook();
//        enBarnBok.skrivUt();
//        ChildrensBook enBarnBok1 = new ChildrensBook("16");
//        enBarnBok1.skrivUt();

String query = "select id, short_name, img_link from goodies";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(URL, USER, PASSWORD);
             // getting Statement object to execute query
            stmt = con.createStatement();
             // executing SELECT query
            rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            
            DefaultTableModel dtm = new DefaultTableModel();
            
            Vector columns_name = new Vector();
            //Vector data_rows = new Vector();        
            
            for (int i = 1; i <= columns; i++) {
                columns_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(columns_name);
            
            while (rs.next()) {                
              Vector data_rows=new Vector();  
              for (int j=1;j<=columns;j++){
                  data_rows.addElement(rs.getString(j));
              }  
              dtm.addRow(data_rows);
            }
            JFrame1 s = new JFrame1(dtm);
            //s.setTablemodel(dtm);
            //dtm.fireTableDataChanged();
            s.show1();
            JFrame1 s1 = new 
          } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        
    }
    
}
