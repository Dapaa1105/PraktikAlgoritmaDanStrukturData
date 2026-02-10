package Jobsheet1;

public class praktikumFungsi05 {

    static int[][] stok = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int[] harga = { 75000, 50000, 60000, 10000 };

    static int hitungPendapatan(int cabang) {
        int total = 0;

        total = total + (stok[cabang][0] * harga[0]);
        total = total + (stok[cabang][1] * harga[1]);
        total = total + (stok[cabang][2] * harga[2]);
        total = total + (stok[cabang][3] * harga[3]);

        return total;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int pendapatan = hitungPendapatan(i);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan: Rp" + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status: Sangat Baik");
            } else {
                System.out.println("Status: Perlu Evaluasi");
            }

            System.out.println();
        }
    }
}
