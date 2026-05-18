package CM2;

public class DaftarPesanan05 {
    NodePesanan05 head;
    NodePesanan05 tail;

    public DaftarPesanan05() {
        this.head = null;
        this.tail = null;
    }

    public void tambahPesanan(Pesanan05 pesanan) {
        NodePesanan05 newNode = new NodePesanan05(pesanan);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void tampilPesanan() {
        NodePesanan05 current = head;
        while (current != null) {
            System.out.println("Kode Pesanan: " + current.data.kodePesanan);
            System.out.println("Nama Pesanan: " + current.data.namaPesanan);
            System.out.println("Harga: " + current.data.harga);
            current = current.next;
        }
    }

    public void sortPesanan() {
        if (head == null) {
            System.out.println("Daftar pesanan kosong, tidak ada yang perlu diurutkan.");
            return;
        }
        NodePesanan05 current = head;
        while (current != null) {
            NodePesanan05 minNode = current;
            NodePesanan05 nextNode = current.next;
            while (nextNode != null) {
                if (nextNode.data.namaPesanan.compareTo(minNode.data.namaPesanan) < 0) {
                    minNode = nextNode;
                }
                nextNode = nextNode.next;
            }
            if (minNode != current) {
                Pesanan05 temp = current.data;
                current.data = minNode.data;
                minNode.data = temp;
            }
            current = current.next;
        }
    }


}
