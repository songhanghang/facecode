package pattern.build;

public abstract class Builder {
    private Product product = new Product();

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    public Product getProduct() {
        return product;
    }
}
