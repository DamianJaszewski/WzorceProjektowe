package com.company;

abstract class AbstrakcyjnaObsluga
{
    protected AbstrakcyjnaObsluga nastepca;

    public void UstawNastepce(AbstrakcyjnaObsluga nastepca)
    {
        this.nastepca = nastepca;
    }

    public abstract void Obsluz(int zobowiazanie);
}

class SpecyficznaOblsuga1 extends AbstrakcyjnaObsluga
{
    @Override
    public void Obsluz(int zobowiazanie)
    {
        if (zobowiazanie >= 0 && zobowiazanie < 15)
        {
            System.out.println(this.getClass().getName() + " Obsluzono zobowiazanie " + zobowiazanie);
        } else if (nastepca != null) {
            nastepca.Obsluz(zobowiazanie);
        }
    }
}

class SpecyficznaObsluga2 extends AbstrakcyjnaObsluga
{
    @Override
    public void Obsluz(int zobowiazanie) {
        if (zobowiazanie >= 10 && zobowiazanie < 25) {
            System.out.println(this.getClass().getName() + " Obsluzono zobowiazanie " +
                    zobowiazanie);
        } else if (nastepca != null) {
            nastepca.Obsluz(zobowiazanie);
        }
    }
}

class ProgramMainAbstrakcyjnaObsluga
{
	public static void main(String[] args) 
	{
        AbstrakcyjnaObsluga Abo1 = new SpecyficznaOblsuga1();
        AbstrakcyjnaObsluga Abo2 = new SpecyficznaObsluga2();

        Abo1.UstawNastepce(Abo2);

        int[] zobowiazania = {1, 4, 17, 26, 18, 5, 28, 22};

        for (int zobowiazanie : zobowiazania) 
        {
            Abo1.Obsluz(zobowiazanie);
        }
    }
}