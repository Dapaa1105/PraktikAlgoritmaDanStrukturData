package KRS;

public class AntrianKRS05 {
    Mahasiswa05[] data;
    int front, rear, size, max;
    int jumlahProses;

    public AntrianKRS05(int max) {
        this.max = max;
        data = new Mahasiswa05[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa05 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian");
    }

    // proses 2 mahasiswa
    public void dequeue2Mahasiswa() {
        if (size < 2) {
            System.out.println("Minimal harus ada 2 mahasiswa!");
            return;
        }

        System.out.println("Mahasiswa diproses:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa05 m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahProses++;
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampil2Depan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 antrian");
            return;
        }

        System.out.println("2 terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampilAkhir() {
        if (!isEmpty()) {
            System.out.println("Paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahProses() {
        return jumlahProses;
    }

    public int getSisaBelumProses() {
        return size;
    }
}