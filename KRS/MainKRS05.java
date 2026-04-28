package KRS;

import java.util.Scanner;

public class MainKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS05 antrian = new AntrianKRS05(10);

        int pilih;
        do {
            System.out.println("\n=== ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Paling Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Sisa Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa05(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.dequeue2Mahasiswa();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampil2Depan();
                    break;

                case 5:
                    antrian.tampilAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah proses: " + antrian.getJumlahProses());
                    break;

                case 8:
                    System.out.println("Belum proses: " + antrian.getSisaBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }

        } while (pilih != 0);
    }
}