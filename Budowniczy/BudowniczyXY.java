class BudowniczyXY extends Budowniczy
{
    private Produkt _produkt = new Produkt();

    public void ZlozCzescA()
    {
        _produkt.Uzupelnij("Czesc X");
    }

    public void ZlozCzescB()
    {
        _produkt.Uzupelnij("Czesc Y");
    }

    public Produkt ZwrocProdukt()
    {
        return _produkt;
    }
}