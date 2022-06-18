class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    AbstrakcyjnaObsluga h1 = new SpecyficznaObsluga1();
    AbstrakcyjnaObsluga h2 = new SpecyficznaObsluga2();

    h1.UstawNastepce(h2);

    int[] zobowiazania = { 1, 4, 17, 26, 18, 5, 28, 22 };

    for (int zobowiazanie : zobowiazania) {
          h1.Obsluz(zobowiazanie);
    }
  }
}