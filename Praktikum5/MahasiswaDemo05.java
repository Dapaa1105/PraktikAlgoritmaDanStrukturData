package Praktikum5;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("menggunakan sequential searching");
        System.out.println("------------------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println("------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting (IPK DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC):");
        list.insertionSort();
        list.tampil();

    }
}