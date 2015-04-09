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
public class Ruangan {
    private String namaRuangan;
    private int kuotaRuangan;
    private SlotJadwal[] slotJadwal;
    //private static int nRuangan;

    public Ruangan(String namaRuangan, int kuotaRuangan) {
        this.namaRuangan = namaRuangan;
        this.kuotaRuangan = kuotaRuangan;
        this.slotJadwal = new SlotJadwal[6]; // satu ruangan memiliki 6 slot (dlam satu minggu)
        //nRuangan ++;        //jumlah ruangan yg telah digunakan bertambah
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public void setKuotaRuangan(int kuotaRuangan) {
        this.kuotaRuangan = kuotaRuangan;
    }
     
    public String getNamaRuangan() {
        return namaRuangan;
    }

    public int getKuotaRuangan() {
        return kuotaRuangan;
    }
    
    public void setIsiShiftRuangan(int idSlot, Shift shift, int idShift){
        
    }

    public String getSlotJadwal() {  //menampilkan keseluruhan slot jadwal di ruangan tersebut
        return slotJadwal.toString();
    }
    
    
    
}
