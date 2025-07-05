public class Product {
    String nazivProizvoda;
    double barKod;
    double osnovnaCena;

    private static final double porez = 20;

    public Product() {

    }

    public Product(String nazivProizvoda, double barKod, double osnovnaCena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;
    }

    public double izracunajFinalnuCenu() {
        return osnovnaCena + (osnovnaCena * porez) / 100;
    }

    public String infString() {
        return "Naziv : " + nazivProizvoda + "\n" +
                "Bar kod : " + barKod + "\n" +
                "Cena : " + osnovnaCena + "\n" +
                "Finalna cena : " + this.izracunajFinalnuCenu();
    }

}
