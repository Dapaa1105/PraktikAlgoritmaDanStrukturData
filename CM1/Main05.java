package CM1;

public class Main05 {
    public static void main(String[] args) {
        Mahasiswa05[] mhs = new Mahasiswa05[3];
        mhs[0] = new Mahasiswa05(22001, "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa05(22002, "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa05(22003, "Citra", "Sistem Informasi Bisnis");

        Buku05[] buku = new Buku05[4];
        buku[0] = new Buku05("B001", "Algoritma", 2020);
        buku[1] = new Buku05("B002", "Basis Data", 2019);
        buku[2] = new Buku05("B003", "Pemrograman", 2021);
        buku[3] = new Buku05("B004", "Fisika", 2024);

        Peminjaman05[] pinjam = new Peminjaman05[5];
        pinjam[0] = new Peminjaman05(mhs[0], buku[0], 7);
        pinjam[0].hitungDenda();
        pinjam[1] = new Peminjaman05(mhs[1], buku[1], 3);
        pinjam[1].hitungDenda();
        pinjam[2] = new Peminjaman05(mhs[2], buku[2], 10);
        pinjam[2].hitungDenda();
        pinjam[3] = new Peminjaman05(mhs[2], buku[3], 6);
        pinjam[3].hitungDenda();
        pinjam[4] = new Peminjaman05(mhs[0], buku[1], 6);
        pinjam[4].hitungDenda();

        System.out.println("=== SEBELUM SORT ===");
        for (int i = 0; i < pinjam.length; i++) {
            System.out.println("Peminjaman ke-" + (i + 1));
            pinjam[i].tampilInformasi();
            System.out.println("--------------------");
        }

        insertionSort(pinjam);
        System.out.println("=== SETELAH SORT ===");
        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i].tampilInformasi();
            System.out.println("--------------------");
        }

    }

    static void insertionSort(Peminjaman05[] data) {
        for (int i = 1; i < data.length; i++) {
            Peminjaman05 temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].denda < temp.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    static void cariByNIM(Peminjaman05[] data, int cari) {
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].mhs.nim == cari) {
                System.out.println("Data ditemukan:");
                data[i].tampilInformasi();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan NIM " + cari + " tidak ditemukan.");
        }
    }
}
