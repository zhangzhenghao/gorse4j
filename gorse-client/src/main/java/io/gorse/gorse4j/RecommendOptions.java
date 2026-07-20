package io.gorse.gorse4j;

import java.util.List;

public final class RecommendOptions {

    private final List<String> categories;
    private final String writeBackType;
    private final String writeBackDelay;
    private final int n;
    private final int offset;

    private RecommendOptions(Builder builder) {
        this.categories = List.copyOf(builder.categories);
        this.writeBackType = builder.writeBackType;
        this.writeBackDelay = builder.writeBackDelay;
        this.n = builder.n;
        this.offset = builder.offset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getWriteBackType() {
        return writeBackType;
    }

    public String getWriteBackDelay() {
        return writeBackDelay;
    }

    public int getN() {
        return n;
    }

    public int getOffset() {
        return offset;
    }

    public static final class Builder {

        private List<String> categories = List.of();
        private String writeBackType;
        private String writeBackDelay;
        private int n;
        private int offset;

        private Builder() {
        }

        public Builder categories(List<String> categories) {
            this.categories = categories == null ? List.of() : categories;
            return this;
        }

        public Builder writeBackType(String writeBackType) {
            this.writeBackType = writeBackType;
            return this;
        }

        public Builder writeBackDelay(String writeBackDelay) {
            this.writeBackDelay = writeBackDelay;
            return this;
        }

        public Builder n(int n) {
            this.n = n;
            return this;
        }

        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        public RecommendOptions build() {
            return new RecommendOptions(this);
        }
    }
}
