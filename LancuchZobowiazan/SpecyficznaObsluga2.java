class SpecyficznaObsluga2 extends AbstrakcyjnaObsluga
{
    public void Obsluz(int zobowiazanie)
    {
        if (zobowiazanie >= 10 && zobowiazanie < 20)
        {
            System.out.println(this.getClass().getName() 
              + " Obsłużono zobowiazanie " + zobowiazanie);
        }
        else if (nastepca != null)
        {
            nastepca.Obsluz(zobowiazanie);
        }
    }
}