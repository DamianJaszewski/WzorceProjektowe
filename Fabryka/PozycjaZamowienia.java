abstract class PozycjaZamowienia
{
    public String Nazwa;
    public int LiczbaSztuk;
    public float CenaSztuka;

    public String getNazwa() { return this.Nazwa; }
    public void setNazwa(String nazwa) { this.Nazwa = nazwa; }

    public int getLiczbaSztuk() { return this.LiczbaSztuk; }
    public void setLiczbaSztuk(int liczbaSztuk) { 
      this.LiczbaSztuk = liczbaSztuk; 
    }

    public float getCenaSztuka() { return this.CenaSztuka; }
    public void setCenaSztuka(float cenaSztuka) { 
      this.CenaSztuka = cenaSztuka; 
    }
}