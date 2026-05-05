package Pertemuan12;

import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList05 sll = new SingleLinkedList05();

        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nHasil Linked List:");
        sll.print();
    }
}
