package Pertemuan12;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05(String nm, String nama, String kls, double ipk) {
        this.nim = nm;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

}
