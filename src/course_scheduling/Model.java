/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author computing01
 */
public class Model {
    private Connection conn;
    private Statement st;
    private ResultSet rs=null;
    public void connect() throws SQLException{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubes_course", "root", "");
        st = conn.createStatement();
    }
    
    public void runQuery(String query) throws SQLException{
        st.execute(query);
    }
    
    public ResultSet getData(String query) throws SQLException{
        st.execute(query);
        rs = st.getResultSet();
        return rs;
    }
    
}
