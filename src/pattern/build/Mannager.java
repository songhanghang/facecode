package pattern.build;

public class Mannager {
    private final Builder builder;

    public Mannager(Builder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }

}
