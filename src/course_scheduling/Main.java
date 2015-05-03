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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("Pemrograman Berabasis Java", "PBO");
        MataKuliah dap = new MataKuliah("Dasar Algoritma Pemrograman", "DAP");
        
        Dosen knr = new Dosen("Kurniawan Nur R", "KNR", "110313112");
        Dosen fsv = new Dosen("Febryanti Sthevanie", "FSV", "112938102");
        
        Kelas if02 = new Kelas("IF-37-02", 39);
        Kelas if08 = new Kelas("IF-37-08", 40);
        
        Ruangan a101 = new Ruangan("A101", 50);
        Ruangan e301 = new Ruangan("E301", 120);
        
        Jadwal j1 = new Jadwal(if08, dap, fsv);
        Jadwal j2 = new Jadwal(if02, pbo, knr);
        
        a101.setSlotJadwal(1, 1, j1);
        a101.setSlotJadwal(1, 2, j2);
        System.out.println(a101.toString());
        
        new MatakuliahGUI("List Jadwal", 400, 600).showMainFrame();
    }
    
}

