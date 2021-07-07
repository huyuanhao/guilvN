package com.facebook.imagepipeline.memory;

public class BitmapCounterConfig {
    public static final int DEFAULT_MAX_BITMAP_COUNT = 384;
    public int mMaxBitmapCount = 384;

    public static class Builder {
        public int mMaxBitmapCount;

        public BitmapCounterConfig build() {
            return new BitmapCounterConfig(this);
        }

        public int getMaxBitmapCount() {
            return this.mMaxBitmapCount;
        }

        public Builder setMaxBitmapCount(int i) {
            this.mMaxBitmapCount = i;
            return this;
        }

        public Builder() {
            this.mMaxBitmapCount = 384;
        }
    }

    public BitmapCounterConfig(Builder builder) {
        this.mMaxBitmapCount = builder.getMaxBitmapCount();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getMaxBitmapCount() {
        return this.mMaxBitmapCount;
    }

    public void setMaxBitmapCount(int i) {
        this.mMaxBitmapCount = i;
    }
}
