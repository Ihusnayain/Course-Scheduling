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
public class SlotJadwal {

    private String hari;
    private final int nShift = 6; //jumlah shift dalam 1 slot
    private Shift[] shift = null;

    public SlotJadwal(String hari) throws UnsupportedOperationException{
        this.hari = hari;
        initShift();
    }

    public void initShift(){
        shift = new Shift[nShift];
        for(int i = 0; i < nShift; i++){
            shift[i] = new Shift(i);
        }
    }
    
    public void setShift(int key, Jadwal jadwal) {
        //memanggil method setIdShift pda Shift, menginputkan id dan menambah jumlah shift terisi
        key--;
        if (key < nShift) {
            // key untuk lebih fleksibel menaruh di shift ke berapa
            shift[key].setJadwal(jadwal);
        } else {
            System.out.println("Tidak bisa lebih dari 6 shift");
        }

    }

    public Shift getShift(int key) {
        // Mengembalikan object shift
        // Apabila memanggil method ini jangan lupa untuk mengecek kondisi null 
        // jika null muncul pesan belum terisi
        return shift[key];
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    @Override
    public String toString() {
        //menampilkan shift terisi pada slot di tanggal tersebut
        String out = "=== Hari" + hari + " === \n";
        for (int i = 0; i < nShift; i++) {
            if (shift[i].getJadwal() != null) {
                out += "Shift " + i + " : " + shift[i].getJadwal().getMatakuliah().getNamaMK() + "\n";
            }
        }
        out += "\n";
        return out;
    }
}