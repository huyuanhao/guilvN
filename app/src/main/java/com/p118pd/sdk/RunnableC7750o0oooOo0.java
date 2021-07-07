package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.views.text.FontMetricsUtil;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0oooOo0  reason: case insensitive filesystem */
public final class RunnableC7750o0oooOo0 implements Runnable {
    public static final long OooO0O0 = 32;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final OooO00o f20765OooO0O0 = new OooO00o();
    public static final long OooO0OO = 40;
    public static final long OooO0Oo = TimeUnit.SECONDS.toMillis(1);
    public static final int o00oO0O = 4;
    @VisibleForTesting
    public static final String o0ooOOo = "PreFillRunner";
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f20766OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7745o0oooO0o f20768OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20769OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7751o0oooOoO f20770OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<C7754o0oooo00> f20771OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20772OooO0O0;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oooOo0$OooO00o */
    public static class OooO00o {
        public long OooO00o() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: com.pd.sdk.o0oooOo0$OooO0O0 */
    public static final class OooO0O0 implements AbstractC7644o0oOoOO {
        @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
        public void OooO00o(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public RunnableC7750o0oooOo0(AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7745o0oooO0o o0oooo0o, C7751o0oooOoO o0oooooo) {
        this(o0ooo0oo, o0oooo0o, o0oooooo, f20765OooO0O0, new Handler(Looper.getMainLooper()));
    }

    private long OooO0O0() {
        long j = this.OooO00o;
        this.OooO00o = Math.min(4 * j, OooO0Oo);
        return j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19394OooO00o() {
        this.f20772OooO0O0 = true;
    }

    public void run() {
        if (m19395OooO00o()) {
            this.f20766OooO00o.postDelayed(this, OooO0O0());
        }
    }

    @VisibleForTesting
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19395OooO00o() {
        Bitmap bitmap;
        long OooO00o2 = this.f20769OooO00o.OooO00o();
        while (!this.f20770OooO00o.m19397OooO00o() && !OooO00o(OooO00o2)) {
            C7754o0oooo00 OooO00o3 = this.f20770OooO00o.m19396OooO00o();
            if (!this.f20771OooO00o.contains(OooO00o3)) {
                this.f20771OooO00o.add(OooO00o3);
                bitmap = this.f20767OooO00o.OooO0O0(OooO00o3.OooO0OO(), OooO00o3.OooO00o(), OooO00o3.m19400OooO00o());
            } else {
                bitmap = Bitmap.createBitmap(OooO00o3.OooO0OO(), OooO00o3.OooO00o(), OooO00o3.m19400OooO00o());
            }
            int OooO00o4 = oO0O0O00.OooO00o(bitmap);
            if (OooO00o() >= ((long) OooO00o4)) {
                this.f20768OooO00o.OooO00o(new OooO0O0(), C7875oO0OOo0o.OooO00o(bitmap, this.f20767OooO00o));
            } else {
                this.f20767OooO00o.OooO00o(bitmap);
            }
            if (Log.isLoggable(o0ooOOo, 3)) {
                String str = "allocated [" + OooO00o3.OooO0OO() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + OooO00o3.OooO00o() + "] " + OooO00o3.m19400OooO00o() + " size: " + OooO00o4;
            }
        }
        return !this.f20772OooO0O0 && !this.f20770OooO00o.m19397OooO00o();
    }

    @VisibleForTesting
    public RunnableC7750o0oooOo0(AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7745o0oooO0o o0oooo0o, C7751o0oooOoO o0oooooo, OooO00o oooO00o, Handler handler) {
        this.f20771OooO00o = new HashSet();
        this.OooO00o = 40;
        this.f20767OooO00o = o0ooo0oo;
        this.f20768OooO00o = o0oooo0o;
        this.f20770OooO00o = o0oooooo;
        this.f20769OooO00o = oooO00o;
        this.f20766OooO00o = handler;
    }

    private boolean OooO00o(long j) {
        return this.f20769OooO00o.OooO00o() - j >= 32;
    }

    private long OooO00o() {
        return this.f20768OooO00o.OooO00o() - this.f20768OooO00o.OooO0O0();
    }
}
