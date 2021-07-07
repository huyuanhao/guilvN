package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.pd.sdk.o0oooO  reason: case insensitive filesystem */
public final class C7741o0oooO {
    public static final String OooO00o = "MemorySizeCalculator";
    @VisibleForTesting
    public static final int OooO0Oo = 4;
    public static final int OooO0o0 = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f20747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20748OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    /* renamed from: com.pd.sdk.o0oooO$OooO0O0 */
    public static final class OooO0O0 implements OooO0OO {
        public final DisplayMetrics OooO00o;

        public OooO0O0(DisplayMetrics displayMetrics) {
            this.OooO00o = displayMetrics;
        }

        @Override // com.p118pd.sdk.C7741o0oooO.OooO0OO
        public int OooO00o() {
            return this.OooO00o.heightPixels;
        }

        @Override // com.p118pd.sdk.C7741o0oooO.OooO0OO
        public int OooO0O0() {
            return this.OooO00o.widthPixels;
        }
    }

    /* renamed from: com.pd.sdk.o0oooO$OooO0OO */
    public interface OooO0OO {
        int OooO00o();

        int OooO0O0();
    }

    public C7741o0oooO(OooO00o oooO00o) {
        int i;
        this.f20748OooO00o = oooO00o.f20751OooO00o;
        if (OooO00o(oooO00o.f20750OooO00o)) {
            i = oooO00o.f20749OooO00o / 2;
        } else {
            i = oooO00o.f20749OooO00o;
        }
        this.OooO0OO = i;
        int OooO00o2 = OooO00o(oooO00o.f20750OooO00o, oooO00o.f20754OooO0OO, oooO00o.f20755OooO0Oo);
        float OooO0O02 = (float) (oooO00o.f20752OooO00o.OooO0O0() * oooO00o.f20752OooO00o.OooO00o() * 4);
        int round = Math.round(oooO00o.f20753OooO0O0 * OooO0O02);
        int round2 = Math.round(OooO0O02 * oooO00o.OooO00o);
        int i2 = OooO00o2 - this.OooO0OO;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.OooO0O0 = round2;
            this.f20747OooO00o = round;
        } else {
            float f = (float) i2;
            float f2 = oooO00o.f20753OooO0O0;
            float f3 = oooO00o.OooO00o;
            float f4 = f / (f2 + f3);
            this.OooO0O0 = Math.round(f3 * f4);
            this.f20747OooO00o = Math.round(f4 * oooO00o.f20753OooO0O0);
        }
        if (Log.isLoggable(OooO00o, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(OooO00o(this.OooO0O0));
            sb.append(", pool size: ");
            sb.append(OooO00o(this.f20747OooO00o));
            sb.append(", byte array size: ");
            sb.append(OooO00o(this.OooO0OO));
            sb.append(", memory class limited? ");
            sb.append(i3 > OooO00o2);
            sb.append(", max size: ");
            sb.append(OooO00o(OooO00o2));
            sb.append(", memoryClass: ");
            sb.append(oooO00o.f20750OooO00o.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(OooO00o(oooO00o.f20750OooO00o));
            sb.toString();
        }
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    public int OooO0O0() {
        return this.f20747OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    /* renamed from: com.pd.sdk.o0oooO$OooO00o */
    public static final class OooO00o {
        @VisibleForTesting
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public static final int OooO0Oo = 4194304;
        public static final float OooO0o = 0.33f;
        public static final float OooO0o0 = 0.4f;
        public float OooO00o = 2.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f20749OooO00o = 4194304;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ActivityManager f20750OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Context f20751OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f20752OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public float f20753OooO0O0 = ((float) OooO0OO);

        /* renamed from: OooO0OO  reason: collision with other field name */
        public float f20754OooO0OO = 0.4f;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public float f20755OooO0Oo = 0.33f;

        public OooO00o(Context context) {
            this.f20751OooO00o = context;
            this.f20750OooO00o = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            this.f20752OooO00o = new OooO0O0(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C7741o0oooO.OooO00o(this.f20750OooO00o)) {
                this.f20753OooO0O0 = 0.0f;
            }
        }

        public OooO00o OooO00o(float f) {
            C7842oO0O0.OooO00o(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f20753OooO0O0 = f;
            return this;
        }

        public OooO00o OooO0O0(float f) {
            C7842oO0O0.OooO00o(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f20755OooO0Oo = f;
            return this;
        }

        public OooO00o OooO0OO(float f) {
            C7842oO0O0.OooO00o(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f20754OooO0OO = f;
            return this;
        }

        public OooO00o OooO0Oo(float f) {
            C7842oO0O0.OooO00o(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.OooO00o = f;
            return this;
        }

        public OooO00o OooO00o(int i) {
            this.f20749OooO00o = i;
            return this;
        }

        @VisibleForTesting
        public OooO00o OooO00o(ActivityManager activityManager) {
            this.f20750OooO00o = activityManager;
            return this;
        }

        @VisibleForTesting
        public OooO00o OooO00o(OooO0OO oooO0OO) {
            this.f20752OooO00o = oooO0OO;
            return this;
        }

        public C7741o0oooO OooO00o() {
            return new C7741o0oooO(this);
        }
    }

    public static int OooO00o(ActivityManager activityManager, float f, float f2) {
        boolean OooO00o2 = OooO00o(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (OooO00o2) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    private String OooO00o(int i) {
        return Formatter.formatFileSize(this.f20748OooO00o, (long) i);
    }

    @TargetApi(19)
    public static boolean OooO00o(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }
}
