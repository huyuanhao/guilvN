package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooOOoOOo  reason: case insensitive filesystem */
public class C8981ooOOoOOo {
    public Bitmap OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f22242OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final GifDecoder f22243OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7622o0oOOoOO<Bitmap> f22244OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7655o0oOoo0O<Bitmap> f22245OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7658o0oOooOO f22246OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f22247OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f22248OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8982OooO0Oo f22249OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<OooO0O0> f22250OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22251OooO00o;
    public OooO00o OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22252OooO0O0;
    public OooO00o OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f22253OooO0OO;
    public boolean OooO0Oo;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.ooOOoOOo$OooO00o */
    public static class OooO00o extends AbstractC7831oO00oOOo<Bitmap> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f22254OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Handler f22255OooO00o;
        public final int o00oO0O;

        public OooO00o(Handler handler, int i, long j) {
            this.f22255OooO00o = handler;
            this.o00oO0O = i;
            this.OooO00o = j;
        }

        public Bitmap OooO00o() {
            return this.f22254OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo oo00oooo) {
            onResourceReady((Bitmap) obj, (AbstractC7837oO00ooOo<? super Bitmap>) oo00oooo);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable AbstractC7837oO00ooOo<? super Bitmap> oo00oooo) {
            this.f22254OooO00o = bitmap;
            this.f22255OooO00o.sendMessageAtTime(this.f22255OooO00o.obtainMessage(1, this), this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooOOoOOo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o();
    }

    /* renamed from: com.pd.sdk.ooOOoOOo$OooO0OO */
    public class OooO0OO implements Handler.Callback {
        public static final int OooO00o = 1;
        public static final int OooO0O0 = 2;

        public OooO0OO() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C8981ooOOoOOo.this.OooO00o((OooO00o) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C8981ooOOoOOo.this.f22246OooO00o.clear((OooO00o) message.obj);
                return false;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.ooOOoOOo$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC8982OooO0Oo {
        void OooO00o();
    }

    public C8981ooOOoOOo(ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, GifDecoder gifDecoder, int i, int i2, AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, Bitmap bitmap) {
        this(o0o0oo0o.m19238OooO00o(), ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(o0o0oo0o.m19234OooO00o()), gifDecoder, null, OooO00o(ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(o0o0oo0o.m19234OooO00o()), i, i2), o0oooo0o, bitmap);
    }

    private int OooO0oO() {
        return oO0O0O00.OooO00o(m20640OooO00o().getWidth(), m20640OooO00o().getHeight(), m20640OooO00o().getConfig());
    }

    public void OooO00o(AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, Bitmap bitmap) {
        this.f22245OooO00o = (AbstractC7655o0oOoo0O) C7842oO0O0.OooO00o(o0oooo0o);
        this.OooO00o = (Bitmap) C7842oO0O0.OooO00o(bitmap);
        this.f22244OooO00o = this.f22244OooO00o.apply(new C7824oO00o0oo().transform(o0oooo0o));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Bitmap m20644OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m20646OooO0OO() {
        return m20640OooO00o().getHeight();
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public int m20647OooO0Oo() {
        return this.f22243OooO00o.OooO0oo();
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public int m20648OooO0o() {
        return m20640OooO00o().getWidth();
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public int m20649OooO0o0() {
        return this.f22243OooO00o.OooO0Oo() + OooO0oO();
    }

    private void OooO0OO() {
        if (this.f22251OooO00o && !this.f22252OooO0O0) {
            if (this.f22253OooO0OO) {
                C7842oO0O0.OooO00o(this.OooO0OO == null, "Pending target must be null when starting from the first frame");
                this.f22243OooO00o.m14988OooO00o();
                this.f22253OooO0OO = false;
            }
            OooO00o oooO00o = this.OooO0OO;
            if (oooO00o != null) {
                this.OooO0OO = null;
                OooO00o(oooO00o);
                return;
            }
            this.f22252OooO0O0 = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f22243OooO00o.OooO00o());
            this.f22243OooO00o.m14989OooO0O0();
            this.OooO0O0 = new OooO00o(this.f22242OooO00o, this.f22243OooO00o.OooO0OO(), uptimeMillis);
            this.f22244OooO00o.apply(C7824oO00o0oo.signatureOf(OooO00o())).load((Object) this.f22243OooO00o).into(this.OooO0O0);
        }
    }

    private void OooO0Oo() {
        Bitmap bitmap = this.OooO00o;
        if (bitmap != null) {
            this.f22247OooO00o.OooO00o(bitmap);
            this.OooO00o = null;
        }
    }

    private void OooO0o() {
        this.f22251OooO00o = false;
    }

    private void OooO0o0() {
        if (!this.f22251OooO00o) {
            this.f22251OooO00o = true;
            this.OooO0Oo = false;
            OooO0OO();
        }
    }

    public void OooO0O0(OooO0O0 oooO0O0) {
        this.f22250OooO00o.remove(oooO0O0);
        if (this.f22250OooO00o.isEmpty()) {
            OooO0o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7655o0oOoo0O<Bitmap> m20641OooO00o() {
        return this.f22245OooO00o;
    }

    public C8981ooOOoOOo(AbstractC7711o0ooO0OO o0ooo0oo, C7658o0oOooOO o0oooooo, GifDecoder gifDecoder, Handler handler, C7622o0oOOoOO<Bitmap> o0oooooo2, AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, Bitmap bitmap) {
        this.f22250OooO00o = new ArrayList();
        this.f22246OooO00o = o0oooooo;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new OooO0OO()) : handler;
        this.f22247OooO00o = o0ooo0oo;
        this.f22242OooO00o = handler;
        this.f22244OooO00o = o0oooooo2;
        this.f22243OooO00o = gifDecoder;
        OooO00o(o0oooo0o, bitmap);
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        if (this.OooO0Oo) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f22250OooO00o.contains(oooO0O0)) {
            boolean isEmpty = this.f22250OooO00o.isEmpty();
            this.f22250OooO00o.add(oooO0O0);
            if (isEmpty) {
                OooO0o0();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    public int OooO0O0() {
        return this.f22243OooO00o.OooO0o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20645OooO0O0() {
        C7842oO0O0.OooO00o(!this.f22251OooO00o, "Can't restart a running animation");
        this.f22253OooO0OO = true;
        OooO00o oooO00o = this.OooO0OO;
        if (oooO00o != null) {
            this.f22246OooO00o.clear(oooO00o);
            this.OooO0OO = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20639OooO00o() {
        OooO00o oooO00o = this.f22248OooO00o;
        if (oooO00o != null) {
            return oooO00o.o00oO0O;
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteBuffer m20642OooO00o() {
        return this.f22243OooO00o.m14987OooO00o().asReadOnlyBuffer();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20643OooO00o() {
        this.f22250OooO00o.clear();
        OooO0Oo();
        OooO0o();
        OooO00o oooO00o = this.f22248OooO00o;
        if (oooO00o != null) {
            this.f22246OooO00o.clear(oooO00o);
            this.f22248OooO00o = null;
        }
        OooO00o oooO00o2 = this.OooO0O0;
        if (oooO00o2 != null) {
            this.f22246OooO00o.clear(oooO00o2);
            this.OooO0O0 = null;
        }
        OooO00o oooO00o3 = this.OooO0OO;
        if (oooO00o3 != null) {
            this.f22246OooO00o.clear(oooO00o3);
            this.OooO0OO = null;
        }
        this.f22243OooO00o.clear();
        this.OooO0Oo = true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m20640OooO00o() {
        OooO00o oooO00o = this.f22248OooO00o;
        return oooO00o != null ? oooO00o.OooO00o() : this.OooO00o;
    }

    @VisibleForTesting
    public void OooO00o(@Nullable AbstractC8982OooO0Oo oooO0Oo) {
        this.f22249OooO00o = oooO0Oo;
    }

    @VisibleForTesting
    public void OooO00o(OooO00o oooO00o) {
        AbstractC8982OooO0Oo oooO0Oo = this.f22249OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO00o();
        }
        this.f22252OooO0O0 = false;
        if (this.OooO0Oo) {
            this.f22242OooO00o.obtainMessage(2, oooO00o).sendToTarget();
        } else if (!this.f22251OooO00o) {
            this.OooO0OO = oooO00o;
        } else {
            if (oooO00o.OooO00o() != null) {
                OooO0Oo();
                OooO00o oooO00o2 = this.f22248OooO00o;
                this.f22248OooO00o = oooO00o;
                for (int size = this.f22250OooO00o.size() - 1; size >= 0; size--) {
                    this.f22250OooO00o.get(size).OooO00o();
                }
                if (oooO00o2 != null) {
                    this.f22242OooO00o.obtainMessage(2, oooO00o2).sendToTarget();
                }
            }
            OooO0OO();
        }
    }

    public static C7622o0oOOoOO<Bitmap> OooO00o(C7658o0oOooOO o0oooooo, int i, int i2) {
        return o0oooooo.asBitmap().apply(C7824oO00o0oo.diskCacheStrategyOf(AbstractC7684o0oo0OOo.OooO0O0).useAnimationPool(true).skipMemoryCache(true).override(i, i2));
    }

    public static AbstractC7644o0oOoOO OooO00o() {
        return new C7885oO0Oo00O(Double.valueOf(Math.random()));
    }
}
