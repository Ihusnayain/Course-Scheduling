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
public class Jadwal {
    private Kelas kelas;
    private MataKuliah matakuliah;
    private Dosen dosen;
    private Ruangan ruangan;
    private int shift;

    public Jadwal(Kelas kelas, MataKuliah matakuliah, Dosen dosen, Ruangan ruangan) {
        this.kelas = kelas;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
       
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void setShift(int shift) {
        this.shift = shift; //yang nnti ditaro di array shift slotJadwal
    }

    public Kelas getKelas() {
        return kelas;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public int getShift() {
        return shift; //buat manggil jadwal ini ada di shift keberapa dan di slotJadwal yang mana
    }
    
    
}
