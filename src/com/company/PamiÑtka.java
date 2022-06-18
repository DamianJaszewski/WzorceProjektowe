package com.company;

public class Pami�tka 
{
    public String setStan(String stan) 
    {
        System.out.println(("Stan = " + stan));
        this.stan = stan;
        return stan;
    }
    
    public String getStan() 
    {
        return stan;
    }

    private String stan;

    public Pami�tka(String stan)
    {
        this.stan = stan;
    }
}

class Zarzadzajacy
{
    public Pami�tka pamiatka;

    public Pami�tka getPamiatka()
    {
        return pamiatka;
    }

    public void setPamiatka(Pami�tka value)
    {
        this.pamiatka = value;
    }
}

class Inicjator
{
    public String stan;

    public String getStan()
    {
        System.out.println("Stan = " + stan);
        return stan;
    }

    public void setStan(String _stan) {
        _stan = stan;
    }

    public Pami�tka UtworzPamiatke()
    {
        return (new Pami�tka(stan));
    }
    public void UstawPamiatke(Pami�tka pamiatka)
    {
        System.out.println("Przywracanie stanu...");
        this.stan = pamiatka.setStan(pamiatka.getStan());
    }
}

class ProgramMainPami�tka 
{
    public static void main(String[] args) 
    {
        Inicjator i = new Inicjator();
        i.stan = "Wlacz";
        i.getStan();

        Zarzadzajacy z = new Zarzadzajacy();
        z.pamiatka = i.UtworzPamiatke();

        i.stan = "Wylacz";
        i.getStan();

        i.UstawPamiatke(z.pamiatka);
    }
}