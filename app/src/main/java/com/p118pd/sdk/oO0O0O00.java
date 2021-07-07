package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.views.text.FontMetricsUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.pd.sdk.oO0O0O00 */
public final class oO0O0O00 {
    public static final int OooO00o = 31;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final char[] f20895OooO00o = "0123456789abcdef".toCharArray();
    public static final int OooO0O0 = 17;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final char[] f20896OooO0O0 = new char[64];

    /* renamed from: com.pd.sdk.oO0O0O00$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.oO0O0O00.OooO00o.OooO00o = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.oO0O0O00.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.oO0O0O00.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.oO0O0O00.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.p118pd.sdk.oO0O0O00.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.oO0O0O00.OooO00o.<clinit>():void");
        }
    }

    public static int OooO00o(int i, int i2) {
        return (i2 * 31) + i;
    }

    @NonNull
    public static String OooO00o(@NonNull byte[] bArr) {
        String OooO00o2;
        synchronized (f20896OooO0O0) {
            OooO00o2 = OooO00o(bArr, f20896OooO0O0);
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19526OooO00o(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    @Deprecated
    public static int OooO0O0(@NonNull Bitmap bitmap) {
        return OooO00o(bitmap);
    }

    public static void OooO0O0() {
        if (!m19528OooO0O0()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    @NonNull
    public static String OooO00o(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f20895OooO00o;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m19528OooO0O0() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean OooO0O0(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    public static int OooO00o(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int OooO00o(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * OooO00o(config);
    }

    public static int OooO00o(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = OooO00o.OooO00o[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19527OooO00o(int i, int i2) {
        return m19526OooO00o(i) && m19526OooO00o(i2);
    }

    public static void OooO00o() {
        if (!m19525OooO00o()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19525OooO00o() {
        return !m19528OooO0O0();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T> Queue<T> m19524OooO00o(int i) {
        return new ArrayDeque(i);
    }

    @NonNull
    public static <T> List<T> OooO00o(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean OooO00o(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof AbstractC1698o) {
            return ((AbstractC1698o) obj).OooO00o(obj2);
        }
        return obj.equals(obj2);
    }

    public static int OooO00o(int i) {
        return OooO00o(i, 17);
    }

    public static int OooO00o(float f) {
        return OooO00o(f, 17);
    }

    public static int OooO00o(float f, int i) {
        return OooO00o(Float.floatToIntBits(f), i);
    }

    public static int OooO00o(@Nullable Object obj, int i) {
        return OooO00o(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int OooO00o(boolean z, int i) {
        return OooO00o(z ? 1 : 0, i);
    }

    public static int OooO00o(boolean z) {
        return OooO00o(z, 17);
    }
}
