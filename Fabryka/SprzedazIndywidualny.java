class SprzedazIndywidualny extends Sprzedaz
{
  public PozycjaZamowienia utworzDokumentSprzedazy()
  {
    Pozycja1 pozycja1 = new Pozycja1();
    
    pozycja1.setNazwa("Ołówek");
    pozycja1.setLiczbaSztuk(1);
    pozycja1.setCenaSztuka(5); 

    return pozycja1;
  }
}