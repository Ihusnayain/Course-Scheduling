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
public class Dosen {
    private String namaDosen;
    private String kodeDosen;
    private String nip;

    public Dosen(String namaDosen, String kodeDosen, String nip) {
        this.namaDosen = namaDosen;
        this.kodeDosen = kodeDosen;
        this.nip = nip;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public String getNip() {
        return nip;
    }
    
    
}
