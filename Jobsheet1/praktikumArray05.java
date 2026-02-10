package Jobsheet1;

import java.util.Scanner;

public class praktikumArray05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = { 2, 2, 2, 3, 2, 3, 1, 2 };

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        double totalNilai = 0;
        int totalSKS = 0;

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

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
        }

        System.out.println();
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        double ip = totalNilai / totalSKS;

        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);
        sc.close();
    }
}
