package com.company;

class ElementDocelowy
{
    public void MetodaA(){
        System.out.println("Wywo³ano ElementDocelowy MetodaA()");
    }
}

class Adaptowany
{
    public void MetodaAdaptowanego()
    {
        System.out.println("Wywolano MetodaAdaptowanego()");
    }
}
class Adapter extends ElementDocelowy
{
    private Adaptowany _adaptowany = new Adaptowany();

    @Override
    public void MetodaA() 
    {
        _adaptowany.MetodaAdaptowanego();
    }
}

class ProgramMainAdapter
{
    public static void main(String[] args) 
    {
        ElementDocelowy elementDocelowy = new Adapter();
        elementDocelowy.MetodaA();
    }	
}