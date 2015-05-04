/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package course_scheduling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Ihda Husnayain
 */
public class MataKuliah extends Model implements DataBase {
    public MataKuliah() throws SQLException{
        this.connect();
    }

    @Override
    public void save(String[] record) throws SQLException {
        String query = "insert into matakuliah values('"
                + record[0] + "','"
                + record[1] + "','"
                + record[2] + "');";
        this.runQuery(query);
    }

    @Override
    public void update(String id,String[] record) throws SQLException {
        String query = "update matakuliah set nama_mk='"
                + record[1] + "',kode_mk='"
                + record[2] + "' where id_matakuliah='"
                + id + "';";
        this.runQuery(query);
    }

    @Override
    public void delete(String id) throws SQLException {
        String query = "delete from matakuliah "
                + "where id_matakuliah='"
                + id + "';";
        this.runQuery(query);
    }

    @Override
    public Vector<Vector<String>> show() throws SQLException {
        Vector<Vector<String>> data = new Vector<>();
        ResultSet rs = this.getData("select * from matakuliah;");
        int i = 0;
        while(rs.next()){
            data.add(new Vector<String>());
            for(int a = 1;a <= 3;a++){
                data.get(i).add(rs.getString(a));
            }
            i++;
        }
        data.add(new Vector<String>());
        for(int a = 1;a <= 3;a++){
            if(a==1){
                data.get(i).add(String.valueOf(Integer.parseInt(data.get(i-1).get(0))+1));
            }
            data.get(i).add("");
        }
        return data;
    }
}
