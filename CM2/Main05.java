package CM2;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianPembeli05 antrian = new AntrianPembeli05();
        DaftarPesanan05 daftarPesanan = new DaftarPesanan05();

        int pilihan;
        int nomorAntrean = 1;

        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN PEMBELI");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = scanner.nextLine();

                    System.out.print("No HP: ");
                    String noHp = scanner.nextLine();

                    Pembeli05 pembeli = new Pembeli05(nomorAntrean, namaPembeli, noHp);
                    antrian.tambahAntrian(pembeli);
                    nomorAntrean++;
                    break;

                case 2:
                    antrian.tampilAntrian();
                    break;

                case 3:
                    Pembeli05 deletedPembeli = antrian.hapusAntrian();
                    if (deletedPembeli != null) {
                        System.out.println("Pembeli yang dilayani: " + deletedPembeli.namaPembeli);
                        System.out.print("Kode Pesanan: ");
                        int kode = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nama Pesanan: ");
                        String nama = scanner.nextLine();

                        System.out.print("Harga: ");
                        int harga = scanner.nextInt();
                        scanner.nextLine();

                        Pesanan05 pesanan = new Pesanan05(kode, nama, harga);
                        daftarPesanan.tambahPesanan(pesanan);
                    }
                    break;

                case 4:
                    daftarPesanan.sortPesanan();
                    daftarPesanan.tampilPesanan();
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 5);

    }

}
