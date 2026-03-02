package Jobsheet2;

public class MataKuliah05 {
    private String kodeMk;
    private String nama;
    private int sks;
    private int jumlahJam;

    public MataKuliah05() {
        this.kodeMk = "MK001";
        this.nama = "Pemrograman Berorientasi Objek";
        this.sks = 3;
        this.jumlahJam = 4;
    }

    public MataKuliah05(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + this.kodeMk);
        System.out.println("Nama Mata Kuliah : " + this.nama);
        System.out.println("SKS : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + this.sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Jam sekarang : " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jam sekarang : " + this.jumlahJam);
        } else {
            System.out.println("Tidak dapat mengurangi jam lebih dari jumlah jam yang ada.");
        }
    }
}
