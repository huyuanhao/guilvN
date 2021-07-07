package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import javax.annotation.concurrent.Immutable;

@Immutable
public class PoolConfig {
    public final PoolParams mBitmapPoolParams;
    public final PoolStatsTracker mBitmapPoolStatsTracker;
    public final PoolParams mFlexByteArrayPoolParams;
    public final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    public final PoolParams mNativeMemoryChunkPoolParams;
    public final PoolStatsTracker mNativeMemoryChunkPoolStatsTracker;
    public final PoolParams mSmallByteArrayPoolParams;
    public final PoolStatsTracker mSmallByteArrayPoolStatsTracker;

    public static class Builder {
        public PoolParams mBitmapPoolParams;
        public PoolStatsTracker mBitmapPoolStatsTracker;
        public PoolParams mFlexByteArrayPoolParams;
        public MemoryTrimmableRegistry mMemoryTrimmableRegistry;
        public PoolParams mNativeMemoryChunkPoolParams;
        public PoolStatsTracker mNativeMemoryChunkPoolStatsTracker;
        public PoolParams mSmallByteArrayPoolParams;
        public PoolStatsTracker mSmallByteArrayPoolStatsTracker;

        public PoolConfig build() {
            return new PoolConfig(this);
        }

        public Builder setBitmapPoolParams(PoolParams poolParams) {
            this.mBitmapPoolParams = (PoolParams) Preconditions.checkNotNull(poolParams);
            return this;
        }

        public Builder setBitmapPoolStatsTracker(PoolStatsTracker poolStatsTracker) {
            this.mBitmapPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
            return this;
        }

        public Builder setFlexByteArrayPoolParams(PoolParams poolParams) {
            this.mFlexByteArrayPoolParams = poolParams;
            return this;
        }

        public Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry memoryTrimmableRegistry) {
            this.mMemoryTrimmableRegistry = memoryTrimmableRegistry;
            return this;
        }

        public Builder setNativeMemoryChunkPoolParams(PoolParams poolParams) {
            this.mNativeMemoryChunkPoolParams = (PoolParams) Preconditions.checkNotNull(poolParams);
            return this;
        }

        public Builder setNativeMemoryChunkPoolStatsTracker(PoolStatsTracker poolStatsTracker) {
            this.mNativeMemoryChunkPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
            return this;
        }

        public Builder setSmallByteArrayPoolParams(PoolParams poolParams) {
            this.mSmallByteArrayPoolParams = (PoolParams) Preconditions.checkNotNull(poolParams);
            return this;
        }

        public Builder setSmallByteArrayPoolStatsTracker(PoolStatsTracker poolStatsTracker) {
            this.mSmallByteArrayPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
            return this;
        }

        public Builder() {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public PoolParams getBitmapPoolParams() {
        return this.mBitmapPoolParams;
    }

    public PoolStatsTracker getBitmapPoolStatsTracker() {
        return this.mBitmapPoolStatsTracker;
    }

    public PoolParams getFlexByteArrayPoolParams() {
        return this.mFlexByteArrayPoolParams;
    }

    public MemoryTrimmableRegistry getMemoryTrimmableRegistry() {
        return this.mMemoryTrimmableRegistry;
    }

    public PoolParams getNativeMemoryChunkPoolParams() {
        return this.mNativeMemoryChunkPoolParams;
    }

    public PoolStatsTracker getNativeMemoryChunkPoolStatsTracker() {
        return this.mNativeMemoryChunkPoolStatsTracker;
    }

    public PoolParams getSmallByteArrayPoolParams() {
        return this.mSmallByteArrayPoolParams;
    }

    public PoolStatsTracker getSmallByteArrayPoolStatsTracker() {
        return this.mSmallByteArrayPoolStatsTracker;
    }

    public PoolConfig(Builder builder) {
        PoolParams poolParams;
        PoolStatsTracker poolStatsTracker;
        PoolParams poolParams2;
        MemoryTrimmableRegistry memoryTrimmableRegistry;
        PoolParams poolParams3;
        PoolStatsTracker poolStatsTracker2;
        PoolParams poolParams4;
        PoolStatsTracker poolStatsTracker3;
        if (builder.mBitmapPoolParams == null) {
            poolParams = DefaultBitmapPoolParams.get();
        } else {
            poolParams = builder.mBitmapPoolParams;
        }
        this.mBitmapPoolParams = poolParams;
        if (builder.mBitmapPoolStatsTracker == null) {
            poolStatsTracker = NoOpPoolStatsTracker.getInstance();
        } else {
            poolStatsTracker = builder.mBitmapPoolStatsTracker;
        }
        this.mBitmapPoolStatsTracker = poolStatsTracker;
        if (builder.mFlexByteArrayPoolParams == null) {
            poolParams2 = DefaultFlexByteArrayPoolParams.get();
        } else {
            poolParams2 = builder.mFlexByteArrayPoolParams;
        }
        this.mFlexByteArrayPoolParams = poolParams2;
        if (builder.mMemoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = NoOpMemoryTrimmableRegistry.getInstance();
        } else {
            memoryTrimmableRegistry = builder.mMemoryTrimmableRegistry;
        }
        this.mMemoryTrimmableRegistry = memoryTrimmableRegistry;
        if (builder.mNativeMemoryChunkPoolParams == null) {
            poolParams3 = DefaultNativeMemoryChunkPoolParams.get();
        } else {
            poolParams3 = builder.mNativeMemoryChunkPoolParams;
        }
        this.mNativeMemoryChunkPoolParams = poolParams3;
        if (builder.mNativeMemoryChunkPoolStatsTracker == null) {
            poolStatsTracker2 = NoOpPoolStatsTracker.getInstance();
        } else {
            poolStatsTracker2 = builder.mNativeMemoryChunkPoolStatsTracker;
        }
        this.mNativeMemoryChunkPoolStatsTracker = poolStatsTracker2;
        if (builder.mSmallByteArrayPoolParams == null) {
            poolParams4 = DefaultByteArrayPoolParams.get();
        } else {
            poolParams4 = builder.mSmallByteArrayPoolParams;
        }
        this.mSmallByteArrayPoolParams = poolParams4;
        if (builder.mSmallByteArrayPoolStatsTracker == null) {
            poolStatsTracker3 = NoOpPoolStatsTracker.getInstance();
        } else {
            poolStatsTracker3 = builder.mSmallByteArrayPoolStatsTracker;
        }
        this.mSmallByteArrayPoolStatsTracker = poolStatsTracker3;
    }
}
