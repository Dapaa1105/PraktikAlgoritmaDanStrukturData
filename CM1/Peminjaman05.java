package CM1;

public class Peminjaman05 {
    Mahasiswa05 mhs;
    Buku05 buku;
    int lamaPinjam;
    int denda;

    public Peminjaman05(Mahasiswa05 mhs, Buku05 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda(){
        if (lamaPinjam > 5){
            denda = (lamaPinjam - 5) * 2000;
        } else {
            denda = 0;
        }
    }

    void tampilInformasi() {
        mhs.tampilInformasi();
        buku.tampilInformasi();
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Denda: Rp " + denda);
    }
}
