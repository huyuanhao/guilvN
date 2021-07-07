package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.views.text.FontMetricsUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.o0ooOO0O  reason: case insensitive filesystem */
public class C7720o0ooOO0O implements AbstractC7711o0ooO0OO {
    public static final Bitmap.Config OooO00o = Bitmap.Config.ARGB_8888;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20692OooO00o = "LruBitmapPool";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20693OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20694OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20695OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7721o0ooOO0o f20696OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<Bitmap.Config> f20697OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f20698OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f20699OooO0OO;
    public int OooO0Oo;

    /* renamed from: com.pd.sdk.o0ooOO0O$OooO00o */
    public interface OooO00o {
        void OooO00o(Bitmap bitmap);

        void OooO0O0(Bitmap bitmap);
    }

    /* renamed from: com.pd.sdk.o0ooOO0O$OooO0O0 */
    public static final class OooO0O0 implements OooO00o {
        @Override // com.p118pd.sdk.C7720o0ooOO0O.OooO00o
        public void OooO00o(Bitmap bitmap) {
        }

        @Override // com.p118pd.sdk.C7720o0ooOO0O.OooO00o
        public void OooO0O0(Bitmap bitmap) {
        }
    }

    /* renamed from: com.pd.sdk.o0ooOO0O$OooO0OO */
    public static class OooO0OO implements OooO00o {
        public final Set<Bitmap> OooO00o = Collections.synchronizedSet(new HashSet());

        @Override // com.p118pd.sdk.C7720o0ooOO0O.OooO00o
        public void OooO00o(Bitmap bitmap) {
            if (this.OooO00o.contains(bitmap)) {
                this.OooO00o.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        @Override // com.p118pd.sdk.C7720o0ooOO0O.OooO00o
        public void OooO0O0(Bitmap bitmap) {
            if (!this.OooO00o.contains(bitmap)) {
                this.OooO00o.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + bitmap.getHeight() + "]");
        }
    }

    public C7720o0ooOO0O(long j, AbstractC7721o0ooOO0o o0oooo0o, Set<Bitmap.Config> set) {
        this.f20694OooO00o = j;
        this.f20698OooO0O0 = j;
        this.f20696OooO00o = o0oooo0o;
        this.f20697OooO00o = set;
        this.f20695OooO00o = new OooO0O0();
    }

    @NonNull
    public static Bitmap OooO0OO(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = OooO00o;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void OooO0Oo() {
        OooO00o(this.f20698OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO, com.p118pd.sdk.AbstractC7711o0ooO0OO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m19366OooO00o() {
        return this.f20698OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    @NonNull
    public Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        Bitmap OooO0Oo2 = OooO0Oo(i, i2, config);
        return OooO0Oo2 == null ? OooO0OO(i, i2, config) : OooO0Oo2;
    }

    public static void OooO0OO(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        OooO0O0(bitmap);
    }

    @Nullable
    private synchronized Bitmap OooO0Oo(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap OooO00o2;
        OooO00o(config);
        OooO00o2 = this.f20696OooO00o.OooO00o(i, i2, config != null ? config : OooO00o);
        if (OooO00o2 == null) {
            if (Log.isLoggable(f20692OooO00o, 3)) {
                String str = "Missing bitmap=" + this.f20696OooO00o.m19368OooO00o(i, i2, config);
            }
            this.OooO0O0++;
        } else {
            this.f20693OooO00o++;
            this.f20699OooO0OO -= (long) this.f20696OooO00o.OooO00o(OooO00o2);
            this.f20695OooO00o.OooO00o(OooO00o2);
            OooO0OO(OooO00o2);
        }
        if (Log.isLoggable(f20692OooO00o, 2)) {
            String str2 = "Get bitmap=" + this.f20696OooO00o.m19368OooO00o(i, i2, config);
        }
        OooO0O0();
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    public synchronized void OooO00o(float f) {
        this.f20698OooO0O0 = (long) Math.round(((float) this.f20694OooO00o) * f);
        OooO0Oo();
    }

    @TargetApi(19)
    public static void OooO0O0(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private void OooO0OO() {
        String str = "Hits=" + this.f20693OooO00o + ", misses=" + this.OooO0O0 + ", puts=" + this.OooO0OO + ", evictions=" + this.OooO0Oo + ", currentSize=" + this.f20699OooO0OO + ", maxSize=" + this.f20698OooO0O0 + "\nStrategy=" + this.f20696OooO00o;
    }

    private void OooO0O0() {
        if (Log.isLoggable(f20692OooO00o, 2)) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    public synchronized void OooO00o(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && ((long) this.f20696OooO00o.OooO00o(bitmap)) <= this.f20698OooO0O0) {
                if (this.f20697OooO00o.contains(bitmap.getConfig())) {
                    int OooO00o2 = this.f20696OooO00o.OooO00o(bitmap);
                    this.f20696OooO00o.m19370OooO00o(bitmap);
                    this.f20695OooO00o.OooO0O0(bitmap);
                    this.OooO0OO++;
                    this.f20699OooO0OO += (long) OooO00o2;
                    if (Log.isLoggable(f20692OooO00o, 2)) {
                        String str = "Put bitmap in pool=" + this.f20696OooO00o.m19369OooO00o(bitmap);
                    }
                    OooO0O0();
                    OooO0Oo();
                    return;
                }
            }
            if (Log.isLoggable(f20692OooO00o, 2)) {
                String str2 = "Reject bitmap from pool, bitmap: " + this.f20696OooO00o.m19369OooO00o(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f20697OooO00o.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    public C7720o0ooOO0O(long j) {
        this(j, OooO00o(), m19365OooO00o());
    }

    public C7720o0ooOO0O(long j, Set<Bitmap.Config> set) {
        this(j, OooO00o(), set);
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    @NonNull
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        Bitmap OooO0Oo2 = OooO0Oo(i, i2, config);
        if (OooO0Oo2 == null) {
            return OooO0OO(i, i2, config);
        }
        OooO0Oo2.eraseColor(0);
        return OooO0Oo2;
    }

    @TargetApi(26)
    public static void OooO00o(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO, com.p118pd.sdk.AbstractC7711o0ooO0OO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19367OooO00o() {
        Log.isLoggable(f20692OooO00o, 3);
        OooO00o(0L);
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    @SuppressLint({"InlinedApi"})
    public void OooO00o(int i) {
        if (Log.isLoggable(f20692OooO00o, 3)) {
            String str = "trimMemory, level=" + i;
        }
        if (i >= 40) {
            m19367OooO00o();
        } else if (i >= 20 || i == 15) {
            OooO00o(m19366OooO00o() / 2);
        }
    }

    private synchronized void OooO00o(long j) {
        while (this.f20699OooO0OO > j) {
            Bitmap OooO00o2 = this.f20696OooO00o.OooO00o();
            if (OooO00o2 == null) {
                if (Log.isLoggable(f20692OooO00o, 5)) {
                    OooO0OO();
                }
                this.f20699OooO0OO = 0;
                return;
            }
            this.f20695OooO00o.OooO00o(OooO00o2);
            this.f20699OooO0OO -= (long) this.f20696OooO00o.OooO00o(OooO00o2);
            this.OooO0Oo++;
            if (Log.isLoggable(f20692OooO00o, 3)) {
                String str = "Evicting bitmap=" + this.f20696OooO00o.m19369OooO00o(OooO00o2);
            }
            OooO0O0();
            OooO00o2.recycle();
        }
    }

    public static AbstractC7721o0ooOO0o OooO00o() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C7730o0ooOooo();
        }
        return new C7708o0ooO00o();
    }

    @TargetApi(26)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set<Bitmap.Config> m19365OooO00o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
