package Pertemuan14;

public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bst = new BinaryTree05();

        bst.add(new Mahasiswa05("220101001", "Andi", "TI-1A", 3.95));
        bst.add(new Mahasiswa05("220101002", "Budi", "TI-1A", 3.20));
        bst.add(new Mahasiswa05("220101003", "Sinta", "TI-1B", 3.82));
        bst.add(new Mahasiswa05("220101004", "Rina", "TI-1B", 3.45));
        bst.add(new Mahasiswa05("220101005", "Dimas", "TI-1C", 2.75));
        bst.add(new Mahasiswa05("220101006", "Fajar", "TI-1C", 3.10));
        bst.add(new Mahasiswa05("220101007", "Nabila", "TI-1D", 3.76));
        bst.add(new Mahasiswa05("220101008", "Rizky", "TI-1D", 3.50));
        bst.add(new Mahasiswa05("220101009", "Aulia", "TI-1E", 3.88));
        bst.add(new Mahasiswa05("220101010", "Kevin", "TI-1E", 3.00));

        System.out.println("====================================================");
        System.out.println("DAFTAR SEMUA MAHASISWA DALAM TREE (INORDER BY IPK):");
        System.out.println("====================================================");
        bst.traverseInOrder(bst.root);
        System.out.println();

        System.out.println("====================================================");
        bst.cariBerdasarkanNama("Sinta");
        System.out.println("====================================================\n");

        System.out.println("====================================================");
        bst.cari3IPKTertinggi();
        System.out.println("====================================================\n");

        System.out.println("====================================================");
        bst.tampilkanMahasiswaPerKelas("TI-1A");
        System.out.println("====================================================");
    }
}