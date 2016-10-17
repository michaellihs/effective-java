package ch.lihsmi.effectivejava.chapter1.item2;

public class ProductWithManyConstructorParameters {

    private final String attribute1;

    private final String attribute2;

    private final String attribute3;

    public static ProductBuilder builder(String attribute1) {
        return new ProductBuilder(attribute1);
    }

    public static class ProductBuilder implements Builder<ProductWithManyConstructorParameters> {

        private final String attribute1;

        // assign default values to optional attributes
        private String attribute2 = null;

        private String attribute3 = null;

        // set reuquired attributes in constructor
        private ProductBuilder(String attribute1) {
            this.attribute1 = attribute1;
        }

        public ProductBuilder withAttribute2(String attribute2) {
            this.attribute2 = attribute2;
            return this;
        }

        public ProductBuilder withAttribute3(String attribute3) {
            this.attribute3 = attribute3;
            return this;
        }

        @Override
        public ProductWithManyConstructorParameters build() {
            return new ProductWithManyConstructorParameters(this);
        }

    }

    // make constructor private and use builder as parameter
    private ProductWithManyConstructorParameters(ProductBuilder builder) {
        // inner class enables access to private properties
        attribute1 = builder.attribute1;
        attribute2 = builder.attribute2;
        attribute3 = builder.attribute3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

}
