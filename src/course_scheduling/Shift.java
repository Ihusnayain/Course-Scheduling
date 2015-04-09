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
    //private Date tanggal;
    //private int[] slot = new int[nRuangan];
    public int idShift;
    
   /* public void addShift(Jadwal jadwal){
        //mengisi status shift dari 0 menjadi 1
    }
    public void replaceSlot(int id, Jadwal jadwal){
        
    }
    
    public void deleteSlot(int nSlot){
        
    }
    */
    public void setIdShift(int idShift){
        this.idShift = idShift;
    }
    public int getIdShift(){
        return idShift; 
    }
    
}
