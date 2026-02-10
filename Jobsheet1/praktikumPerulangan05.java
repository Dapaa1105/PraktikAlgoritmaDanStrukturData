package Jobsheet1;
import java.util.Scanner;

public class praktikumPerulangan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
       

        System.out.print("Masukkan 2 digit terakhir NIM: ");
        n = sc.nextInt();

        if (n < 10) {
            n = n + 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
            } else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        sc.close();
    }
}
