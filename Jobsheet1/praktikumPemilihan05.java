package Jobsheet1;

import java.util.Scanner;

public class praktikumPemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf;
        String keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("======================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
                uts < 0 || uts > 100 || uas < 0 || uas > 100) {

            System.out.println("Nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");

        } else {
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                keterangan = "ANDA TIDAK LULUS";
            } else {
                keterangan = "SELAMAT ANDA LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            System.out.println(keterangan);
        }

        sc.close();
    }
}
