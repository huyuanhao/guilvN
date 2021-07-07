package com.bumptech.glide.load.resource.bitmap;

import com.p118pd.sdk.C7647o0oOoOOo;

public abstract class DownsampleStrategy {
    public static final DownsampleStrategy OooO00o = new C5100OooO0o0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7647o0oOoOOo<DownsampleStrategy> f14839OooO00o;
    public static final DownsampleStrategy OooO0O0 = new C5099OooO0Oo();
    public static final DownsampleStrategy OooO0OO = new OooO00o();
    public static final DownsampleStrategy OooO0Oo = new OooO0O0();
    public static final DownsampleStrategy OooO0o = new OooO0o();
    public static final DownsampleStrategy OooO0o0 = new OooO0OO();
    public static final DownsampleStrategy OooO0oO;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$OooO0Oo  reason: case insensitive filesystem */
    public static class C5099OooO0Oo extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m15001OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    public static class OooO0o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m15002OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$OooO0o0  reason: case insensitive filesystem */
    public static class C5100OooO0o0 extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m15003OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    static {
        DownsampleStrategy downsampleStrategy = OooO0O0;
        OooO0oO = downsampleStrategy;
        f14839OooO00o = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", downsampleStrategy);
    }

    public abstract float OooO00o(int i, int i2, int i3, int i4);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract SampleSizeRounding m14997OooO00o(int i, int i2, int i3, int i4);

    public static class OooO00o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m14998OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    public static class OooO0O0 extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m14999OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    public static class OooO0OO extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float OooO00o(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.OooO00o.OooO00o(i, i2, i3, i4));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SampleSizeRounding m15000OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }
}
