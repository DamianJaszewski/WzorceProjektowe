package com.company;

abstract class Strategia
{
    public abstract void RozwiazProblem();
}

class SpecyficznaStrategiaA extends Strategia
{
    @Override
    public void RozwiazProblem()
    {
        System.out.println("Wywolano SpecyficznaStrategiaA.RozwiazProblem()");
    }
}

class SpecyficznaStrategiaB extends Strategia
{
    @Override
    public void RozwiazProblem()
    {
        System.out.println("Wywolano SpecyficznaStrategiaB.RozwiazProblem()");
    }
}

class KontekstStrategia
{
    private Strategia strategia;

    public KontekstStrategia(Strategia strategia)
    {
        this.strategia = strategia;
    }
    public void ZwrocProblem()
    {
        strategia.RozwiazProblem();
    }
}

class ProgramMainStrategia 
{
    public static void main(String[] args) 
    {
        KontekstStrategia kontekst;

        kontekst = new KontekstStrategia(new SpecyficznaStrategiaA());
        kontekst.ZwrocProblem();

        kontekst = new KontekstStrategia(new SpecyficznaStrategiaB());
        kontekst.ZwrocProblem();

    }
}
