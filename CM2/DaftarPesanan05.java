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
            System.out.println("Kode Pesanan: " + current.data.kodePesanan + ", Nama Pesanan: " + current.data.namaPesanan + ", Total Harga: " + current.data.harga);
            current = current.next;
        }
    }


}
