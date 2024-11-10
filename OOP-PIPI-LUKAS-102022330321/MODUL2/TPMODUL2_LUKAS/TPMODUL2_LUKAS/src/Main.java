public class Main {
  public static void main(String[] args) {
      // Membuat objek kucing
      Kucing kucing = new Kucing("Cipi", 2, "Persia");
      System.out.println("Detail Hewan\n");
      System.out.println("Ini adalah " + kucing.nama + "!");
      kucing.suara();
      kucing.makan();
      kucing.makan("ikan");

      // Membuat objek burung
      Burung burung = new Burung("Martin", 1, "Hijau");
      System.out.println();
      System.out.println("Ini adalah " + burung.nama + "!");
      burung.suara();
      burung.makan();
      burung.makan("biji-bijian");
      System.out.println("");
      kucing.infoHewan();
      burung.infoHewan();
  }
}
