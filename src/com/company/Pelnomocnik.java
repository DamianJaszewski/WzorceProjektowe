package com.company;

abstract class Przedmiot
{
    public abstract void Zapytanie();
}

class KonkretnyPrzedmiot extends Przedmiot
{
    @Override
    public void Zapytanie() {
        System.out.println("Wywolanie KonkretnyPrzedmiot.Zapytanie()");
    }
}

public class Pelnomocnik extends Przedmiot 
{
    private KonkretnyPrzedmiot _konkretnyPrzedmiot;

    @Override
    public void Zapytanie() 
    {
        if(_konkretnyPrzedmiot == null){

            this._konkretnyPrzedmiot = new KonkretnyPrzedmiot();
            _konkretnyPrzedmiot.Zapytanie();
        }
    }
}

class ProgramMainPelnomocnik
{
    public static void main(String[] args)
    {
        Pelnomocnik pelnomocnik = new Pelnomocnik();
        pelnomocnik.Zapytanie();

    }
}
