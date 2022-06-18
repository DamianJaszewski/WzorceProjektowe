class SprzedazFirma extends Sprzedaz
{
  public PozycjaZamowienia utworzDokumentSprzedazy()
  {
    Pozycja1 pozycja2 = new Pozycja1();
  
    pozycja2.setNazwa("Długopis");
    pozycja2.setLiczbaSztuk(2);
    pozycja2.setCenaSztuka(5); 

    return pozycja2;
  }
}