package Jobsheet2;

public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05();
        Dosen05 dosen2 = new Dosen05("D002", "Dr. Siti Aminah", false, 2015, "Struktur Data");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        System.out.println();
        System.out.println("Informasi Dosen 2:");
        dosen2.tampilInformasi();
        System.out.println();
        dosen1.setStatusAktif(false);
        System.out.println();
        int masaKerjaDosen2 = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja Dosen 2 : " + masaKerjaDosen2 + " tahun");
        System.out.println();
        dosen1.ubahKeahlian("Basis Data");
    }
}
