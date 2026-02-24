package Jobsheet3;

import java.util.Scanner;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan data mata kuliah");
        int jumlahMk = sc.nextInt();
        sc.nextLine();
        MataKuliah05[] arrayofMataKuliah05 = new MataKuliah05[jumlahMk];

        for (int i = 0; i < jumlahMk; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJamM = sc.nextInt(); 
            sc.nextLine();

            arrayofMataKuliah05[i] = new MataKuliah05(kode, nama, sks, jumlahJamM);
        }

       System.out.println("\n====== Data Mata Kuliah ======");
        for (MataKuliah05 mataKuliah : arrayofMataKuliah05) {
            mataKuliah.cetakInfo();
        }
    }
}
