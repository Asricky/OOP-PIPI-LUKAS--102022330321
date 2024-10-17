import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemen = new ManajemenInventaris();
        Scanner input = new Scanner(System.in);
        int pilihan;

        // Todo : Create Loop list menu
        do {
            System.out.println("===== Menu Inventaris Makanan =====");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    manajemen.tambahMakananKering();
                    break;
                case 2:
                    manajemen.tambahMakananBasah();
                    break;
                case 3:
                    manajemen.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 4);
    }
}
