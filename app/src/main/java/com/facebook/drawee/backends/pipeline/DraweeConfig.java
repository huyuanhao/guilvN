package com.facebook.drawee.backends.pipeline;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class DraweeConfig {
    @Nullable
    public final ImmutableList<DrawableFactory> mCustomDrawableFactories;
    public final Supplier<Boolean> mDebugOverlayEnabledSupplier;
    @Nullable
    public final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

    public static class Builder {
        public List<DrawableFactory> mCustomDrawableFactories;
        public Supplier<Boolean> mDebugOverlayEnabledSupplier;
        public PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

        public Builder addCustomDrawableFactory(DrawableFactory drawableFactory) {
            if (this.mCustomDrawableFactories == null) {
                this.mCustomDrawableFactories = new ArrayList();
            }
            this.mCustomDrawableFactories.add(drawableFactory);
            return this;
        }

        public DraweeConfig build() {
            return new DraweeConfig(this);
        }

        public Builder setDebugOverlayEnabledSupplier(Supplier<Boolean> supplier) {
            Preconditions.checkNotNull(supplier);
            this.mDebugOverlayEnabledSupplier = supplier;
            return this;
        }

        public Builder setDrawDebugOverlay(boolean z) {
            return setDebugOverlayEnabledSupplier(Suppliers.m852of(Boolean.valueOf(z)));
        }

        public Builder setPipelineDraweeControllerFactory(PipelineDraweeControllerFactory pipelineDraweeControllerFactory) {
            this.mPipelineDraweeControllerFactory = pipelineDraweeControllerFactory;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Nullable
    public ImmutableList<DrawableFactory> getCustomDrawableFactories() {
        return this.mCustomDrawableFactories;
    }

    public Supplier<Boolean> getDebugOverlayEnabledSupplier() {
        return this.mDebugOverlayEnabledSupplier;
    }

    @Nullable
    public PipelineDraweeControllerFactory getPipelineDraweeControllerFactory() {
        return this.mPipelineDraweeControllerFactory;
    }

    public DraweeConfig(Builder builder) {
        Supplier<Boolean> supplier;
        this.mCustomDrawableFactories = builder.mCustomDrawableFactories != null ? ImmutableList.copyOf(builder.mCustomDrawableFactories) : null;
        if (builder.mDebugOverlayEnabledSupplier != null) {
            supplier = builder.mDebugOverlayEnabledSupplier;
        } else {
            supplier = Suppliers.m852of(false);
        }
        this.mDebugOverlayEnabledSupplier = supplier;
        this.mPipelineDraweeControllerFactory = builder.mPipelineDraweeControllerFactory;
    }
}
