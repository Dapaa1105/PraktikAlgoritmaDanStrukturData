package Jobsheet2;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("NIM   : " + nama);
        System.out.println("Nama  : " + nim);
        System.out.println("Kelas : " + ipk);
        System.out.println("IPK   : " + kelas);

    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinjerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
