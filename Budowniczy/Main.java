class Main {
  public static void main(String[] args) {

    Kierownik kierownik = new Kierownik();

    Budowniczy budowniczy1 = new BudowniczyQW();
    Budowniczy budowniczy2 = new BudowniczyXY();

    kierownik.Skladaj(budowniczy1);

    budowniczy1.ZwrocProdukt().Pokaz();

    kierownik.Skladaj(budowniczy2);
    budowniczy2.ZwrocProdukt().Pokaz();
  }
}