package Quiz1;

import java.util.Scanner;

public class MainCafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();
        sc.nextLine();

        Cafe05[] menu = new Cafe05[n];
        for (int i = 0; i < n; i++) {
            menu[i] = new Cafe05();
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama Menu : ");
            String nama = sc.nextLine();
            System.out.print("Harga     : ");
            double harga = sc.nextDouble();
            System.out.print("Jumlah    : ");
            int jumlah = sc.nextInt();
            sc.nextLine();
            menu[i].inputData(nama, harga, jumlah);
        }

        for (int i = 0; i < n; i++) {
            menu[i].hitungTotal();
        }

        System.out.println("\n=== DATA PESANAN ===");
        for (int i = 0; i < n; i++) {
            menu[i].tampilData();
        }
         System.out.println("Total Semua Pesanan : " + Cafe05.totalSemua(menu));

        sc.close();
    }
}