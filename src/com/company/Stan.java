package com.company;

abstract class Stan
{

    public abstract void Odpowiedz(Kontekst kontekst);
}

class Kontekst
{
    private Stan _stan;

    public Kontekst(Stan stan)
    {
        this._stan = stan;
    }

    public Stan getStan()
    {
        return _stan;
    }

    public void setStan(Stan stan)
    {
        this._stan = stan;
        System.out.println("Stan: " + _stan.getClass().getName().toString());
    }
    public void Zapytaj()
    {
        _stan.Odpowiedz(this);
    }
}

class SpecyficznyStanA extends Stan 
{
    @Override
    public void Odpowiedz(Kontekst kontekst) {

        kontekst.setStan(new SpecyficznyStanB());
    }
}

class SpecyficznyStanB extends Stan
{
    @Override
    public void Odpowiedz(Kontekst kontekst) {

        kontekst.setStan(new SpecyficznyStanA());
    }
}

class ProgramMainStan
{
    public static void main(String[] args)
    {
        Kontekst k = new Kontekst(new SpecyficznyStanB());

        k.Zapytaj();
        k.Zapytaj();
        k.Zapytaj();
        k.Zapytaj();
        k.Zapytaj();
    }
}