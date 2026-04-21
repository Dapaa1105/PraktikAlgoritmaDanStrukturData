package CM1;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tampilkan Pinjaman");
            System.out.println("2. Sorting Berdasarkan Denda");
            System.out.println("3. Cari Berdasarkan Nama");
            System.out.println("4. Keluar");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.println("Data Pinjaman:");
                for (Peminjaman05 p : pinjam) {
                    p.tampilInformasi();
                    System.out.println();
                }
            } else if (pilihan == 2) {
                insertionSort(pinjam);
                System.out.println("Data Pinjaman Setelah Sorting:");
                for (Peminjaman05 p : pinjam) {
                    p.tampilInformasi();
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan nama yang ingin dicari: ");
                String cariNama = sc.next();
                cariByNama(pinjam, cariNama);
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
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

    static void cariByNama(Peminjaman05[] data, String cari) {
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].mhs.nama.equalsIgnoreCase(cari)) {
                System.out.println("Data ditemukan:");
                data[i].tampilInformasi();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan nama " + cari + " tidak ditemukan.");
        }
    }
}
