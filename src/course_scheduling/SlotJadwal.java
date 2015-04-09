/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package course_scheduling;

import java.util.Date;

/**
 *
 * @author Ihda Husnayain
 */
public class SlotJadwal {
    private Date tanggal;
    private int[] shift = new int[8];
    private int nShift = 0; //jumlah shift terisi dalam 1 slot jadwal
    
    public SlotJadwal(Date tanggal){
        this.tanggal = tanggal;
        for(int i=0; i<=8; i++){
            shift[i] = -1;
            i++;
        }
    }
    
    public void setShift(int idShift){   //memanggil method setIdShift pda Shift, menginputkan id dan menambah jumlah shift terisi
        if(nShift<6){
            shift[idShift] = idShift;
            nShift=+1;
        }
        else{
            System.out.println("Shift sudah penuh");
        }
        
    }
    
    public int getShift(){  //mengeluarkan nilai idShift
        return nShift;
    }   
   
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() { //menampilkan shift terisi pada slot di tanggal tersebut
        System.out.println("Shift terisi pada slot jadwal ini");
        String out = null;
        for(int i=0; i<=nShift; i++) {
            out = "tanggal  "+ getTanggal() + " Shift " + getShift() +" ";
            i++;
        }
        return out;
        
    }
}

    

