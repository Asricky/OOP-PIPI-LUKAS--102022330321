import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
        ArrayList<Penumpang> penumpangList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Penumpang penumpang = null;

        penerbanganList.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        penerbanganList.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        int pilihan;
        do {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < penerbanganList.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        penerbanganList.get(i).tampilDaftarPenerbangan();
                    }
                    break;

                case 2:
                    if (penumpang == null) {
                        System.out.println("Silahkan isi data diri terlebih dahulu!");
                        System.out.println("-----------------------------------------");
                        System.out.print("Masukan NIK: ");
                        String NIK = input.next();
                        System.out.print("Masukan Nama Depan: ");
                        String namaDepan = input.next();
                        System.out.print("Masukan Nama Belakang: ");
                        String namaBelakang = input.next();

                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                        penumpangList.add(penumpang);

                        System.out.println("\nTerima kasih telah mengisi data pelanggan.");
                        System.out.println("Silakan pilih tiket penerbangan yang tersedia.");
                    }

                    for (int i = 0; i < penerbanganList.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        penerbanganList.get(i).tampilDaftarPenerbangan();
                    }

                    System.out.print("Pilih nomor penerbangan (ex: 1): ");
                    int pilihPenerbangan = input.nextInt();

                    if (pilihPenerbangan >= 1 && pilihPenerbangan <= penerbanganList.size()) {
                        System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)\n");
                    } else {
                        System.out.println("Pembelian Tiket Tidak Ada\n");
                    }
                    break;

                case 3:
                    if (penumpang != null) {
                        System.out.println("====== Detail Tiket Penerbangan ======");
                        penumpang.tampilDaftarPenumpang();
                        Penerbangan penerbangan = penerbanganList.get(0); 
                        penerbangan.tampilDaftarPenerbangan();
                    } else {
                        System.out.println("Pembelian Tiket Tidak Ada\n");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
