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
public class Kelas {
    private String namaKelas;
    private int jmlMhs;

    public Kelas(String namaKelas, int jmlMhs) {
        this.namaKelas = namaKelas;
        this.jmlMhs = jmlMhs;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public int getJmlMhs() {
        return jmlMhs;
    }   
    
}
