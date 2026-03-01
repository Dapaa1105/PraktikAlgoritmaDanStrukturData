package Jobsheet3;

public class DataDosen05 {
    public static void dataSemuaDosen(Dosen05[] arrayofDosen05) {
        int no = 1;
        for (Dosen05 d : arrayofDosen05) {
            System.out.println("Data Dosen ke-" + no);
            d.tampilData();
            System.out.println();
            no++;
        }

    }

    public static void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen05 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);

    }

    public static void rataRataUsiaDosen(Dosen05[] arrayOfDosen) {
        int totalUsia = 0;
        for (Dosen05 d : arrayOfDosen) {
            totalUsia += d.usia;
        }
        double rataRataUsia = (double) totalUsia / arrayOfDosen.length;
        System.out.println("Rata-rata Usia Dosen: " + rataRataUsia);
    }

    public static void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        Dosen05 palingTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > palingTua.usia) {
                palingTua = arrayOfDosen[i];
            }
        }
        System.out.println("Dosen paling tua : ");
        palingTua.tampilData();
    }

    public static void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        Dosen05 palingMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < palingMuda.usia) {
                palingMuda = arrayOfDosen[i];
            }
        }
        System.out.println("Dosen paling muda : ");
        palingMuda.tampilData();
    }

    }

   
       

