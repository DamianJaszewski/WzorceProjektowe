package com.company;

class PodSystemPierwszy
{
    public void MetodaPierwsza()
    {
        System.out.println("PodSystem Pierwszy Metoda");
    }
}

class PodSystemDrugi
{
    public void MetodaDruga()
    {
        System.out.println("PodSystem Drugi Metoda");
    }
}

class PodSystemTrzeci
{
    public void MetodaTrzecia()
    {
        System.out.println("PodSystem Trzeci Metoda");
    }
}

class PodSystemCzwarty
{
    public void MetodaCzwarta()
    {
        System.out.println("PodSystem Czwarty Metoda");
    }
}

class Fasada
{
    String _pierwszy;
    String _drugi;
    String _trzeci;
    String _czwarty;

    public Fasada(String pierwszy, String drugi, String trzeci, String czwarty)
    {
        this._pierwszy = pierwszy;
        this._drugi = drugi;
        this._trzeci= trzeci;
        this._czwarty = czwarty;
    }

    PodSystemPierwszy podSystemPierwszy = new PodSystemPierwszy();
    PodSystemDrugi podSystemDrugi = new PodSystemDrugi();
    PodSystemTrzeci podSystemTrzeci = new PodSystemTrzeci();
    PodSystemCzwarty podSystemCzwarty = new PodSystemCzwarty();


    public void MetodaA()
    {

        System.out.println("Metoda A() -------");

        podSystemPierwszy.MetodaPierwsza();

        podSystemDrugi.MetodaDruga();

        podSystemCzwarty.MetodaCzwarta();



    }
    public void MetodaB()
    {
        System.out.println("Metoda B() -------");

        podSystemDrugi.MetodaDruga();

        podSystemTrzeci.MetodaTrzecia();

    }
}

class ProgramMainFasada 
{
    public static void main(String[] args) 
    {
        Fasada fasada = new Fasada("pierwszy", "drugi", "trzeci", "czwarty");

        fasada.MetodaA();

        fasada.MetodaB();
    }
}
