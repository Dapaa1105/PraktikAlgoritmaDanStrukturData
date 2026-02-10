package Jobsheet1;

import java.util.Scanner;

public class tugas105 {
    public static void main(String[] args) {
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        String[][] KOTA = {
                { "Banten" },
                { "Jakarta" },
                { "Bandung" },
                { "Cirebon" },
                { "Bogor" },
                { "Pekalongan" },
                { "Semarang" },
                { "Surabaya" },
                { "Malang" },
                { "Tegal" }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat: ");
        char input = sc.next().charAt(0);

        boolean ketemu = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Kota: " + KOTA[i][0]);
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Kode tidak ditemukan");
        }
    }
}
