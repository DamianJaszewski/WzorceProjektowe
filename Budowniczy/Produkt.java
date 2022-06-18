import java.util.ArrayList;
import java.util.List;

class Produkt
{
    private List<String> _czesci = new ArrayList<String>();

    public void Uzupelnij(String czesc)
    {
        _czesci.add(czesc);
    }

    public void Pokaz()
    {
        System.out.println("\nCzesci produktu -------");
        for (String czesc : _czesci) {
            System.out.println(czesc);
        }
    }
}