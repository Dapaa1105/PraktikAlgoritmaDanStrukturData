package Jobsheet3;

import java.util.Scanner;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah05[] arrayofMataKuliah05 = new MataKuliah05[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayofMataKuliah05[i] = new MataKuliah05(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayofMataKuliah05[i].kode);
            System.out.println("Nama       : " + arrayofMataKuliah05[i].nama);
            System.out.println("SKS        : " + arrayofMataKuliah05[i].sks);
            System.out.println("Jumlah Jam : " + arrayofMataKuliah05[i].jumlahJam);
            System.out.println("--------------------------------");
        }
    }
}
