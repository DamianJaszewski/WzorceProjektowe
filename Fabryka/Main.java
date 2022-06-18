class Main {
  public static void main(String[] args) {
    Sprzedaz[] sprzedaz = new Sprzedaz[2];
    sprzedaz[0] = new SprzedazFirma();
    sprzedaz[1] = new SprzedazIndywidualny();

    for (Sprzedaz dokumenty : sprzedaz) {
      PozycjaZamowienia pozycja = dokumenty.utworzDokumentSprzedazy();
      System.out.println("Utworzone dokumenty: " 
        + dokumenty.getClass().getSimpleName() + " " 
        + pozycja.getNazwa() + ", liczba: " 
        + pozycja.getLiczbaSztuk() + ", cena: " 
        + pozycja.getCenaSztuka());   
    }
  }
}