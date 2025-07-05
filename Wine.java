public class Wine extends Product {
    double zapreminaBoce;
    private static final double dodatniPorez = 10;

    public Wine(String nazivProizvoda, double barKod, double osnovnaCena, double zapreminaBoce) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;

    }
    @Override
    public double izracunajFinalnuCenu() {
        return super.izracunajFinalnuCenu() * dodatniPorez;
    }

    @Override
    public String infString() {
        return super.infString() + "\n" +
                "Zapremina boce vina: " + zapreminaBoce;
    }

}
