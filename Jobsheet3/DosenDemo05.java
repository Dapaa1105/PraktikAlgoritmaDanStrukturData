package Jobsheet3;

import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah dosen:");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen05[] arrayDosen05 = new Dosen05[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode            : ");
            String kode = sc.nextLine();
            System.out.print("Nama            : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            boolean jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia            : ");
            int usia = sc.nextInt();
            System.out.println("-------------------------");
            sc.nextLine();
            arrayDosen05[i] = new Dosen05(kode, nama, jenisKelamin, usia);

        }

        int no = 1;
        for (Dosen05 d : arrayDosen05) {
            System.out.println("Data Dosen ke-" + no);
            d.tampilData();
            System.out.println();
            no++;
           

        }

    }
}