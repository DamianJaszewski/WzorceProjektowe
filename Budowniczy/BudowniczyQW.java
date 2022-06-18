class BudowniczyQW extends Budowniczy
{
    private Produkt _produkt = new Produkt();

    public void ZlozCzescA()
    {
        _produkt.Uzupelnij("Czesc Q");
    }

    public void ZlozCzescB()
    {
        _produkt.Uzupelnij("Czesc W");
    }

    public Produkt ZwrocProdukt()
    {
        return _produkt;
    }
}