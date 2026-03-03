package Quiz1;

public class Cafe05 {
    String namaMenu;
    double harga;
    int jumlah;
    double total;

    public void inputData(String nama, double hrg, int jml) {
        namaMenu = nama;
        harga = hrg;
        jumlah = jml;
    }

    public void hitungTotal() {
        total = harga * jumlah;
    }

    public void tampilData() {
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga     : " + harga);
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Total     : " + total);
        System.out.println("-----------------------");
    }

    public void ubahHarga(double hargaBaru) {
        harga = hargaBaru;
    }

    public static double totalSemua(Cafe05[] menu) {
        double totalAkhir = 0;
        for (int i = 0; i < menu.length; i++) {
            totalAkhir += menu[i].total;
        }
        return totalAkhir;
}
}