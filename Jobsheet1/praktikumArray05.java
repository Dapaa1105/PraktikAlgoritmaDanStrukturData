package Jobsheet1;

import java.util.Scanner;

public class praktikumArray05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] mk = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobot = new double[jumlahMK];

        double totalNilai = 0;
        int totalSKS = 0;

        System.out.println();
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            mk[i] = input.nextLine();

            System.out.print("Masukkan SKS Mata Kuliah: ");
            sks[i] = input.nextInt();

            System.out.print("Masukkan Nilai Angka Untuk Mata Kuliah " + mk[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.0;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.0;
            } else {
                nilaiHuruf[i] = "D";
                bobot[i] = 1.0;
            }

            totalNilai = totalNilai + (bobot[i] * sks[i]);
            totalSKS = totalSKS + sks[i];
            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        double ip = totalNilai / totalSKS;

        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);
    }
}
