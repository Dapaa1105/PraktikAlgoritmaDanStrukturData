package Pertemuan12;

public class MahasiswaAntrian05 {
    String nim;
    String nama;
    String jurusan;

    public MahasiswaAntrian05(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " - " + jurusan);
    }
}