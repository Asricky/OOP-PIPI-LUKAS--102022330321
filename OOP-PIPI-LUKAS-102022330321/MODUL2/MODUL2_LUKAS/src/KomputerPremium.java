class KomputerPremium extends Komputer {
  // To do: Buatlah 1 variable sesuai ketentuan
  protected boolean ruangPrivat;
  // To do: Buatlah constructor pada class KomputerPremium
  public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
      super(jumlahKomputer, namaWarnet, hargaPerJam);
      this.ruangPrivat = ruangPrivat;
  }
  
  // To do: Buatlah Method Informasi memakai Polymorphism Override
  @Override
  public void informasi() {
      super.informasi();
      System.out.println("Status          : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
      if (ruangPrivat) {
          System.out.println("\nFasilitas Ruang Premium:");
          System.out.println("- Ruangan DINGIN tetapi TIDAK KEJAM");
          System.out.println("- Sofa Gaming anjay mabar");
          System.out.println("- PC Gaming spek rata kanan!");
          System.out.println("- Koneksi wifi 1Gbps");
      } else {
        System.out.println("\nFasilitasilitas Ruang Standar:");
        System.out.println("- Ruangan PANAS kek Pasar Senen");
        System.out.println("- Sofa udah jebol");
        System.out.println("- PC Gaming warnet anak SD");
        System.out.println("- Koneksi wifi 1Kbps");
      }
  }
  
  // To do: Buatlah method Pesan sesuai dengan ketentuan
  public void pesan(int nomorKomputer) {
      System.out.println("\nMemesan komputer nomor   : " + nomorKomputer);
  }
  
  // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
  public void tambahLayanan(String makanan) {
      System.out.println("Menambah layanan makanan : " + makanan);
  }
  
  // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading
  public void tambahLayanan(String makanan, String minuman) {
      System.out.println("Menambah layanan makanan : " + makanan + " dan minuman: " + minuman);
  }
}