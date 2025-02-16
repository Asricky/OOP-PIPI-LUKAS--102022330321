public class Main {
  public static void main(String[] args) {
      // To do: Buatlah sebuah Objek baru dari class Komputer
      Komputer komputer = new Komputer(20, "Warnet Gaming Anjay Mabar", 5000.0f);
      // To do: Panggillah Method Informasi dari class Komputer
      komputer.informasi();
      System.out.println();

      // To do: Buatlah sebuah Objek baru dari class KomputerVIP
      KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming Anjay Mabar", 7000.0f, true);

      // To do: Panggillah Method Informasi dari class KomputerVIP
      komputerVIP.informasi();

      // To do: Panggillah Method Login
      komputerVIP.login("Udin VIP Sigma");

      // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
      komputerVIP.bermain(2);
      komputerVIP.bermain(2, 3);

      System.out.println();

      // To do: Buatlah sebuah Objek baru dari class KomputerPremium
      KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming Anjay Mabar", 10000.0f, true);

      // To do: Panggillah Method Informasi dari class KomputerPremium
      komputerPremium.informasi();

      // To do: Panggillah Method Pesan
      komputerPremium.pesan(5);

      // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
      komputerPremium.tambahLayanan("Nasi Goreng Amfibi (Ayam + Seafood)");
      komputerPremium.tambahLayanan("Nasi Goreng Amfibi (Ayam + Seafood)", "Es Krim hangat");
  }
}
