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

    public Jadwal(Kelas kelas, MataKuliah matakuliah, Dosen dosen) {
        this.kelas = kelas;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
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

    public Kelas getKelas() {
        return kelas;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

}
