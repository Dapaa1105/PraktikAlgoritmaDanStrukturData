package Pertemuan14;

public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bst = new BinaryTree05();
        
        bst.addRekursif(new Mahasiswa05("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa05("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa05("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa05("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa05("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa05("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa05("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== HASIL TUGAS PRAKTIKUM ===");
        bst.cariMinIPK();
        bst.cariMaxIPK();
        
        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}
