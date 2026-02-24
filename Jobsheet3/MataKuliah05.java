package Jobsheet3;

public class MataKuliah05 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah05(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS  : " + sks);
        System.out.println("Jam  : " + jumlahJam);
        System.out.println("-------------------------");
    }
}