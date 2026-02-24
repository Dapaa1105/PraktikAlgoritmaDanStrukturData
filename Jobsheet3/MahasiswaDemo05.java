package Jobsheet3;

import java.util.Scanner;
public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa05[] arrayofMahasiswa05 = new Mahasiswa05[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa05[i] = new Mahasiswa05();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayofMahasiswa05[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayofMahasiswa05[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa05[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayofMahasiswa05[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.println("NIM    : " + arrayofMahasiswa05[i].nim);
            System.out.println("Nama   : " + arrayofMahasiswa05[i].nama);
            System.out.println("Kelas  : " + arrayofMahasiswa05[i].kelas);
            System.out.println("IPK    : " + arrayofMahasiswa05[i].ipk);
            System.out.println("--------------------------------");
        }
    }
}
