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
            System.out.println("=== SISTEM ANTRIAN PEMBELI ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Keluar");

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
                    antrian.hapusAntrian();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 4);

    }

}
