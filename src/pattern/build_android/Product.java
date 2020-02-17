package pattern.build_android;

public class Product {
    int a;
    int b;
    int c;

    private Product(Build build) {
        this.a = build.a;
        this.b = build.b;
        this.c = build.c;
    }

    public static class Build {
        private int a;
        private int b;
        private int c;

        public Build() {

        }

        public Build(Product product) {
            this.a = product.a;
            this.b = product.b;
            this.c = product.c;
        }

        public Build setA(int a) {
            this.a = a;
            return this;
        }

        public Build setB(int b) {
            this.b = b;
            return this;
        }

        public Build setC(int c) {
            this.c = c;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public static void main(String[] args) {
        // 直接创建
        Product base = new Product.Build().setA(2).setB(3).setC(5).build();
        // 基于base创建
        Product formBase = new Product.Build(base).setA(6).build();
    }
}
