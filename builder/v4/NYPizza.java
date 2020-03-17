package builder.v4;

import java.util.Objects;

public class NYPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NYPizza build() {
            return new NYPizza(this);
        }
    }

    private NYPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
