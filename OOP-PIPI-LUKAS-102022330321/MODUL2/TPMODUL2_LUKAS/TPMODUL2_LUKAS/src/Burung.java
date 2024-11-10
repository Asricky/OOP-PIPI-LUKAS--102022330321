public class Burung extends Hewan {
  private String warnaBulu;

  // Constructor
  public Burung(String nama, int umur, String warnaBulu) {
      super(nama, umur);
      this.warnaBulu = warnaBulu;
  }

  // Override method suara()
  @Override
  public void suara() {
      System.out.println(nama + " berkicau.");
  }

  // Override method infoHewan()
  @Override
  public void infoHewan() {
      super.infoHewan();
      System.out.println("Warna bulu: " + warnaBulu);
  }
}
