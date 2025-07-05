public class Chocolate extends Product{
    double tezina;

    public Chocolate(String nazivProizvoda, double barKod, double osnovnaCena, double tezina) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.tezina = tezina;
    }
    @Override
    public String infString() {
        return super.infString() + "\n" +
                "Tezina cokolade: " + tezina;

    }

}
