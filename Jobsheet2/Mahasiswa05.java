package Jobsheet2;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

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
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
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