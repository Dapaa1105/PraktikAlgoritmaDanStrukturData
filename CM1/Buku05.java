package CM1;

public class Buku05 {
    String kode;
    String judul;
    int tahunTerbit;

    public Buku05(String kode, String judul, int tahunTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilInformasi() {
        System.out.println("Kode: " + kode);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

}
