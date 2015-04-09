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
public class Shift {
   
    private Jadwal jadwal;
    private int shift;
    
    public Shift(int shift){
        this.shift = shift;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }   
}