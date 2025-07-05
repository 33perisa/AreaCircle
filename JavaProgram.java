public class JavaProgram {
    public static void main(String[] args) {
        Product product = new Product("Mincom", 040503, 100);
        System.out.println(product.infString());

        Chocolate chocolate = new Chocolate("Lion", 060703, 5000, 50);
        System.out.println(chocolate.infString());

        Wine wine = new Wine("Gilbi", 404040, 70, 3);
        System.out.println(wine.infString());

    }
}
