/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package course_scheduling;

/**
 *
 * @author Ihda Husnayain
 */
public class MataKuliah {
    private String namaMK;
    private String kodeMK;

    public MataKuliah(String namaMK, String kodeMK) {
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }
    
    
}
