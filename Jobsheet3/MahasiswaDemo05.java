package Jobsheet3;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Mahasiswa05[] arrayofMahasiswa05 = new Mahasiswa05[3];
        arrayofMahasiswa05[0] = new Mahasiswa05();
        arrayofMahasiswa05[0].nim = "244107060033";
        arrayofMahasiswa05[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa05[0].kelas = "SIB-1E";
        arrayofMahasiswa05[0].ipk = (float) 3.75;

        arrayofMahasiswa05[0] = new Mahasiswa05();
        arrayofMahasiswa05[0].nim = "2341720172";
        arrayofMahasiswa05[0].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa05[0].kelas = "TI-2A";
        arrayofMahasiswa05[0].ipk = (float) 3.36;

        arrayofMahasiswa05[0] = new Mahasiswa05();
        arrayofMahasiswa05[0].nim = "244107023306";
        arrayofMahasiswa05[0].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa05[0].kelas = "TI-2E";
        arrayofMahasiswa05[0].ipk = (float) 3.80;

        System.out.println("NIM    : " + arrayofMahasiswa05[0].nim);
        System.out.println("Nama   : " + arrayofMahasiswa05[0].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa05[0].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa05[0].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM    : " + arrayofMahasiswa05[1].nim);
        System.out.println("Nama   : " + arrayofMahasiswa05[1].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa05[1].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa05[1].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM    : " + arrayofMahasiswa05[2].nim);
        System.out.println("Nama   : " + arrayofMahasiswa05[2].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa05[2].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa05[2].ipk);
        System.out.println("-------------------------------------");

    }
}
