package Jobsheet2;

public class Dosen05 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    public Dosen05() {
        this.idDosen = "D001";
        this.nama = "Dr. Budi Santoso";
        this.statusAktif = true;
        this.tahunBergabung = 2010;
        this.bidangKeahlian = "Pemrograman";
    }

    public Dosen05(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen : " + this.idDosen);
        System.out.println("Nama Dosen : " + this.nama);
        System.out.println("Status Aktif : " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + this.tahunBergabung);
        System.out.println("Bidang Keahlian : " + this.bidangKeahlian);
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
        System.out.println("Status aktif dosen berhasil diubah menjadi " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - this.tahunBergabung;
        return masaKerja;
    }

    public void ubahKeahlian(String bidangKeahlianBaru) {
        this.bidangKeahlian = bidangKeahlianBaru;
        System.out.println("Bidang keahlian dosen berhasil diubah menjadi " + this.bidangKeahlian);
    }

}
