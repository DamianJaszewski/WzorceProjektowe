abstract class AbstrakcyjnaObsluga
{
    protected AbstrakcyjnaObsluga nastepca;

    public void UstawNastepce(AbstrakcyjnaObsluga nastepca)
    {
        this.nastepca = nastepca;
    }

    public abstract void Obsluz(int zobowiazanie);
}