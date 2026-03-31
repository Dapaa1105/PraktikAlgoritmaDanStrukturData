package Praktikum5;

public class Dosen05 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen05(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("JK    : " + jk);
        System.out.println("Usia  : " + usia);
    }
}