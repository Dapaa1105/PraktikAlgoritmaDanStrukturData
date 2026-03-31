package Praktikum5;

import java.util.Scanner;

public class MainDosen05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen05 list = new DataDosen05();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda)");
            System.out.println("4. Sorting DESC (Usia tertua)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Kode: ");
                String kode = sc.nextLine();

                System.out.print("Nama: ");
                String nama = sc.nextLine();

                System.out.print("Jenis Kelamin (L/P): ");
                char jkInput = sc.next().charAt(0);
                boolean jk = (jkInput == 'L' || jkInput == 'l');

                System.out.print("Usia: ");
                int usia = sc.nextInt();
                sc.nextLine();

                Dosen05 d = new Dosen05(kode, nama, jk, usia);
                list.tambah(d);

            } else if (pilih == 2) {
                list.tampil();

            } else if (pilih == 3) {
                list.SortingASC();
                System.out.println("Data berhasil diurutkan ASC");
                list.tampil();

            } else if (pilih == 4) {
                list.sortingDSC();
                System.out.println("Data berhasil diurutkan DESC");
                list.tampil();

            } else if (pilih == 5) {
                System.out.println("Keluar program");

            } else {
                System.out.println("Menu tidak valid");
            }

        } while (pilih != 5);
    }
}