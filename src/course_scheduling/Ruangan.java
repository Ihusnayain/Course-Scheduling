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
    private final int nHari = 6;

    public Ruangan(String namaRuangan, int kuotaRuangan) {
        this.namaRuangan = namaRuangan;
        this.kuotaRuangan = kuotaRuangan;
        initSlotJadwal();
    }

    public void initSlotJadwal() {
        // satu ruangan hanya memiliki 6 slot hari(dlam satu minggu)
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        slotJadwal = new SlotJadwal[nHari];
        for (int i = 0; i < nHari; i++) {
            slotJadwal[i] = new SlotJadwal(days[i]);
        }
    }
    
    public void setSlotJadwal(int key, int shift, Jadwal jadwal){
        slotJadwal[key].setShift(shift, jadwal);
    }
    
    public SlotJadwal getSlotJadwal(int key){
        return slotJadwal[key];
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

    public String toString() {  //menampilkan keseluruhan slot jadwal di ruangan tersebut
        String out = "";
        out += "Ruangan " + namaRuangan + "\n";
        for (int i = 0; i < nHari; i++) {
            out += slotJadwal[i].toString();
            out += "\n";
        }
        return out;
    }

}
