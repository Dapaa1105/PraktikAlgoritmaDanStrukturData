package Jobsheet1;

import java.util.Scanner;

public class tugas205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();
        }

        System.out.println("=== DATA JADWAL ===");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    jadwal[i][0] + " | " +
                            jadwal[i][1] + " | " +
                            jadwal[i][2] + " | " +
                            jadwal[i][3]);
        }
    }
}
