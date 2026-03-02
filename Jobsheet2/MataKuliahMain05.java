package Jobsheet2;

public class MataKuliahMain05 {
    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05();
        MataKuliah05 mk2 = new MataKuliah05("MK002", "Struktur Data", 4, 5);

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        System.out.println();
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        System.out.println();
        mk1.ubahSKS(4);
        System.out.println();
        mk2.tambahJam(2);
        System.out.println();
        mk1.kurangiJam(1);
    }
}
