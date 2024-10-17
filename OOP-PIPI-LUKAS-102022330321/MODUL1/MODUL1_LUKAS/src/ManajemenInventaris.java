// Todo: Import Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan Kering: ");
        String nama = input.next();
        System.out.print("Masukkan Jumlah Makanan Kering: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga Makanan Kering: ");
        double harga = input.nextDouble();
        System.out.print("Masukkan Brand Makanan Kering: ");
        String brand = input.next();

        // Todo : Create a new object for MakananKering   
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);

        // Todo : Create Print Notification "Makanan kering berhasil ditambahkan"
        System.out.println("===================================");
        System.out.println("Makanan Kering berhasil ditambahkan!");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan Nama Makanan Basah: ");
        String nama = input.next();
        System.out.print("Masukkan Jumlah Makanan Basah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga Makanan Basah: ");
        double harga = input.nextDouble();
        System.out.print("Masukkan Bahan Makanan Basah: ");
        String bahan = input.next();

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);

        // Todo : Create Print Notification "Makanan Basah berhasil ditambahkan"
        System.out.println("===================================");
        System.out.println("Makanan Basah berhasil ditambahkan!");
    }

    public void tampilkanSemuaMakanan() {
        // Jika kedua daftar kosong
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini.");
        } else {
            // Todo : Create print notification for Makanan Kering
            System.out.println("=== Daftar Makanan Kering ===");
            for (MakananKering mk : daftarMakananKering) {
                mk.showData();
            }

            // Todo : Create print notification for Makanan Basah
            System.out.println("=== Daftar Makanan Basah ===");
            for (MakananBasah mb : daftarMakananBasah) {
                mb.showData();
            }
        }
    }
}
