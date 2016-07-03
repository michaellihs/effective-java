package ch.lihsmi.effectivejava.chapter1.item2;

public class Product {

    private final String attribute1;

    private final String attribute2;

    private final String attribute3;

    public static class Builder {

        private final String attribute1;

        private String attribute2 = null;

        private String attribute3 = null;

        public Builder(String attribute1) {
            this.attribute1 = attribute1;
        }

        public Builder withAttribute2(String attribute2) {
            this.attribute2 = attribute2;
            return this;
        }

        public Builder withAttribute3(String attribute3) {
            this.attribute3 = attribute3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    private Product(Builder builder) {
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
