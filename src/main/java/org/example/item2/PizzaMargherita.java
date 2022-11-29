package org.example.item2;

import java.util.Objects;

public class PizzaMargherita extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    private PizzaMargherita(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "PizzaMargherita{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        PizzaMargherita build() {
            return new PizzaMargherita(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
