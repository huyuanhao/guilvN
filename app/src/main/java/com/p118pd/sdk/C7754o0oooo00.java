package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.pd.sdk.o0oooo00  reason: case insensitive filesystem */
public final class C7754o0oooo00 {
    @VisibleForTesting
    public static final Bitmap.Config OooO0O0 = Bitmap.Config.RGB_565;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bitmap.Config f20778OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f20779OooO0O0;
    public final int OooO0OO;

    /* renamed from: com.pd.sdk.o0oooo00$OooO00o */
    public static class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap.Config f20780OooO00o;
        public final int OooO0O0;
        public int OooO0OO;

        public OooO00o(int i) {
            this(i, i);
        }

        public OooO00o OooO00o(@Nullable Bitmap.Config config) {
            this.f20780OooO00o = config;
            return this;
        }

        public OooO00o(int i, int i2) {
            this.OooO0OO = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 > 0) {
                this.OooO00o = i;
                this.OooO0O0 = i2;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }

        public Bitmap.Config OooO00o() {
            return this.f20780OooO00o;
        }

        public OooO00o OooO00o(int i) {
            if (i > 0) {
                this.OooO0OO = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7754o0oooo00 m19401OooO00o() {
            return new C7754o0oooo00(this.OooO00o, this.OooO0O0, this.f20780OooO00o, this.OooO0OO);
        }
    }

    public C7754o0oooo00(int i, int i2, Bitmap.Config config, int i3) {
        this.f20778OooO00o = (Bitmap.Config) C7842oO0O0.OooO00o(config, "Config must not be null");
        this.OooO00o = i;
        this.f20779OooO0O0 = i2;
        this.OooO0OO = i3;
    }

    public int OooO00o() {
        return this.f20779OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO0OO;
    }

    public int OooO0OO() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7754o0oooo00)) {
            return false;
        }
        C7754o0oooo00 o0oooo00 = (C7754o0oooo00) obj;
        if (this.f20779OooO0O0 == o0oooo00.f20779OooO0O0 && this.OooO00o == o0oooo00.OooO00o && this.OooO0OO == o0oooo00.OooO0OO && this.f20778OooO00o == o0oooo00.f20778OooO00o) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.OooO00o * 31) + this.f20779OooO0O0) * 31) + this.f20778OooO00o.hashCode()) * 31) + this.OooO0OO;
    }

    public String toString() {
        return "PreFillSize{width=" + this.OooO00o + ", height=" + this.f20779OooO0O0 + ", config=" + this.f20778OooO00o + ", weight=" + this.OooO0OO + '}';
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap.Config m19400OooO00o() {
        return this.f20778OooO00o;
    }
}
