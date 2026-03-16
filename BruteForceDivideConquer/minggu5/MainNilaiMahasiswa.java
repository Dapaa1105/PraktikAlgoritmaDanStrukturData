package BruteForceDivideConquer.minggu5;

public class MainNilaiMahasiswa {
    static int maxUTS(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    static int minUTS(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    static double rataUAS(NilaiMahasiswa[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }

        return (double) total / arr.length;
    }

    public static void main(String[] args) {

        NilaiMahasiswa[] data = {
            new NilaiMahasiswa("Ahmad","220101001",2022,78,82),
            new NilaiMahasiswa("Budi","220101002",2022,85,88),
            new NilaiMahasiswa("Cindy","220101003",2021,90,87),
            new NilaiMahasiswa("Dian","220101004",2021,76,79),
            new NilaiMahasiswa("Eko","220101005",2023,92,95),
            new NilaiMahasiswa("Fajar","220101006",2020,88,85),
            new NilaiMahasiswa("Gina","220101007",2023,80,83),
            new NilaiMahasiswa("Hadi","220101008",2020,82,84)
        };

        int maxUTS = maxUTS(data,0,data.length-1);
        int minUTS = minUTS(data,0,data.length-1);
        double rataUAS = rataUAS(data);

        System.out.println("Nilai UTS Tertinggi : " + maxUTS);
        System.out.println("Nilai UTS Terendah : " + minUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}
