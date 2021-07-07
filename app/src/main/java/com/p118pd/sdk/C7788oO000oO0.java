package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

/* renamed from: com.pd.sdk.oO000oO0  reason: case insensitive filesystem */
public final class C7788oO000oO0 {
    public static volatile C7788oO000oO0 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final File f20840OooO00o = new File("/proc/self/fd");
    public static final int OooO0O0 = 128;
    public static final int OooO0OO = 50;
    public static final int OooO0Oo = 700;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile int f20841OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile boolean f20842OooO00o = true;

    public static C7788oO000oO0 OooO00o() {
        if (OooO00o == null) {
            synchronized (C7788oO000oO0.class) {
                if (OooO00o == null) {
                    OooO00o = new C7788oO000oO0();
                }
            }
        }
        return OooO00o;
    }

    @TargetApi(26)
    public boolean OooO00o(int i, int i2, BitmapFactory.Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m19446OooO00o();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private synchronized boolean m19446OooO00o() {
        boolean z = true;
        int i = this.f20841OooO00o + 1;
        this.f20841OooO00o = i;
        if (i >= 50) {
            this.f20841OooO00o = 0;
            int length = f20840OooO00o.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f20842OooO00o = z;
            if (!this.f20842OooO00o && Log.isLoggable(C7785oO000o00.f20827OooO00o, 5)) {
                String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + 700;
            }
        }
        return this.f20842OooO00o;
    }
}
