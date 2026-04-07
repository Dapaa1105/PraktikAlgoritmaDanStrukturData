package CM1;

public class Mahasiswa05 {
    int nim;
    String nama;
    String prodi;

    public Mahasiswa05(int nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
