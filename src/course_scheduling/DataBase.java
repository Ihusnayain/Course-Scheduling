/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package course_scheduling;

import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Ihda Husnayain
 */
public interface DataBase {
    public void save(String[] record) throws SQLException;
    public void update(String id,String[] record) throws SQLException;
    public void delete(String id) throws SQLException;
    public Vector<Vector<String>> show() throws SQLException;
    
}
