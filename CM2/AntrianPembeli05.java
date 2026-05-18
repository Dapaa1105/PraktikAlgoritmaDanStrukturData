package CM2;

public class AntrianPembeli05 {
    NodePembeli05 head;
    NodePembeli05 tail;

    public AntrianPembeli05() {
        this.head = null;
        this.tail = null;
    }

    public void tambahAntrian(Pembeli05 pembeli) {
        NodePembeli05 newNode = new NodePembeli05(pembeli);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void tampilAntrian() {
        NodePembeli05 current = head;
        while (current != null) {
            System.out.println("No Antrean: " + current.data.noAntrean  );
            System.out.println("Nama: " + current.data.namaPembeli);
            System.out.println("No HP: " + current.data.noHp);
            current = current.next;
        }
        if (head == null) {
            System.out.println("Antrian kosong.");
        }
    }

    public Pembeli05 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return null;
        }
        System.out.println("Menghapus antrian dengan No Antrean: " + head.data.noAntrean);
        Pembeli05 deletedPembeli = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; 
        }
        return deletedPembeli;
    }
}
