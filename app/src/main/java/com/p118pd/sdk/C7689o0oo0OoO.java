package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.C8953ooOOOoO0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0OoO  reason: case insensitive filesystem */
public class C7689o0oo0OoO<R> implements DecodeJob.OooO0O0<R>, C8953ooOOOoO0.OooO0o {
    public static final Handler OooO00o = new Handler(Looper.getMainLooper(), new OooO0O0());
    public static final OooO00o OooO0O0 = new OooO00o();
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Pools.OooO00o<C7689o0oo0OoO<?>> f20612OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataSource f20613OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecodeJob<R> f20614OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public GlideException f20615OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7644o0oOoOO f20616OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20617OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7690o0oo0Ooo f20618OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7694o0oo0o0O<?> f20619OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7700o0oo0oo0<?> f20620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ExecutorServiceC7746o0oooOO f20621OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O0O0o f20622OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC7812oO00o> f20623OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ExecutorServiceC7746o0oooOO f20624OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<AbstractC7812oO00o> f20625OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20626OooO0O0;
    public final ExecutorServiceC7746o0oooOO OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f20627OooO0OO;
    public final ExecutorServiceC7746o0oooOO OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f20628OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public volatile boolean OooO0oo;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oo0OoO$OooO00o */
    public static class OooO00o {
        public <R> C7694o0oo0o0O<R> OooO00o(AbstractC7700o0oo0oo0<R> o0oo0oo0, boolean z) {
            return new C7694o0oo0o0O<>(o0oo0oo0, z, true);
        }
    }

    /* renamed from: com.pd.sdk.o0oo0OoO$OooO0O0 */
    public static class OooO0O0 implements Handler.Callback {
        public boolean handleMessage(Message message) {
            C7689o0oo0OoO o0oo0ooo = (C7689o0oo0OoO) message.obj;
            int i = message.what;
            if (i == 1) {
                o0oo0ooo.OooO0Oo();
            } else if (i == 2) {
                o0oo0ooo.OooO0OO();
            } else if (i == 3) {
                o0oo0ooo.OooO0O0();
            } else {
                throw new IllegalStateException("Unrecognized message: " + message.what);
            }
            return true;
        }
    }

    public C7689o0oo0OoO(ExecutorServiceC7746o0oooOO o0ooooo, ExecutorServiceC7746o0oooOO o0ooooo2, ExecutorServiceC7746o0oooOO o0ooooo3, ExecutorServiceC7746o0oooOO o0ooooo4, AbstractC7690o0oo0Ooo o0oo0ooo, Pools.OooO00o<C7689o0oo0OoO<?>> oooO00o) {
        this(o0ooooo, o0ooooo2, o0ooooo3, o0ooooo4, o0oo0ooo, oooO00o, OooO0O0);
    }

    private void OooO0OO(AbstractC7812oO00o oo00o) {
        if (this.f20625OooO0O0 == null) {
            this.f20625OooO0O0 = new ArrayList(2);
        }
        if (!this.f20625OooO0O0.contains(oo00o)) {
            this.f20625OooO0O0.add(oo00o);
        }
    }

    @VisibleForTesting
    public C7689o0oo0OoO<R> OooO00o(AbstractC7644o0oOoOO o0ooooo, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f20616OooO00o = o0ooooo;
        this.f20626OooO0O0 = z;
        this.f20627OooO0OO = z2;
        this.f20628OooO0Oo = z3;
        this.OooO0o0 = z4;
        return this;
    }

    public void OooO0O0(DecodeJob<R> decodeJob) {
        ExecutorServiceC7746o0oooOO o0ooooo;
        this.f20614OooO00o = decodeJob;
        if (decodeJob.m14994OooO0OO()) {
            o0ooooo = this.f20621OooO00o;
        } else {
            o0ooooo = OooO00o();
        }
        o0ooooo.execute(decodeJob);
    }

    public void OooO0Oo() {
        this.f20622OooO00o.m19529OooO00o();
        if (this.OooO0oo) {
            this.f20620OooO00o.recycle();
            OooO00o(false);
        } else if (this.f20623OooO00o.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else if (!this.OooO0o) {
            C7694o0oo0o0O<?> OooO00o2 = this.f20617OooO00o.OooO00o(this.f20620OooO00o, this.f20626OooO0O0);
            this.f20619OooO00o = OooO00o2;
            this.OooO0o = true;
            OooO00o2.m19335OooO00o();
            this.f20618OooO00o.OooO00o(this, this.f20616OooO00o, this.f20619OooO00o);
            int size = this.f20623OooO00o.size();
            for (int i = 0; i < size; i++) {
                AbstractC7812oO00o oo00o = this.f20623OooO00o.get(i);
                if (!OooO00o(oo00o)) {
                    this.f20619OooO00o.m19335OooO00o();
                    oo00o.OooO00o(this.f20619OooO00o, this.f20613OooO00o);
                }
            }
            this.f20619OooO00o.OooO0O0();
            OooO00o(false);
        } else {
            throw new IllegalStateException("Already have resource");
        }
    }

    @VisibleForTesting
    public C7689o0oo0OoO(ExecutorServiceC7746o0oooOO o0ooooo, ExecutorServiceC7746o0oooOO o0ooooo2, ExecutorServiceC7746o0oooOO o0ooooo3, ExecutorServiceC7746o0oooOO o0ooooo4, AbstractC7690o0oo0Ooo o0oo0ooo, Pools.OooO00o<C7689o0oo0OoO<?>> oooO00o, OooO00o oooO00o2) {
        this.f20623OooO00o = new ArrayList(2);
        this.f20622OooO00o = oO0O0O0o.OooO00o();
        this.f20621OooO00o = o0ooooo;
        this.f20624OooO0O0 = o0ooooo2;
        this.OooO0OO = o0ooooo3;
        this.OooO0Oo = o0ooooo4;
        this.f20618OooO00o = o0oo0ooo;
        this.f20612OooO00o = oooO00o;
        this.f20617OooO00o = oooO00o2;
    }

    public void OooO0OO() {
        this.f20622OooO00o.m19529OooO00o();
        if (this.OooO0oo) {
            OooO00o(false);
        } else if (this.f20623OooO00o.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (!this.OooO0oO) {
            this.OooO0oO = true;
            this.f20618OooO00o.OooO00o(this, this.f20616OooO00o, null);
            for (AbstractC7812oO00o oo00o : this.f20623OooO00o) {
                if (!OooO00o(oo00o)) {
                    oo00o.OooO00o(this.f20615OooO00o);
                }
            }
            OooO00o(false);
        } else {
            throw new IllegalStateException("Already failed once");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19330OooO00o(AbstractC7812oO00o oo00o) {
        oO0O0O00.OooO0O0();
        this.f20622OooO00o.m19529OooO00o();
        if (this.OooO0o) {
            oo00o.OooO00o(this.f20619OooO00o, this.f20613OooO00o);
        } else if (this.OooO0oO) {
            oo00o.OooO00o(this.f20615OooO00o);
        } else {
            this.f20623OooO00o.add(oo00o);
        }
    }

    public void OooO0O0(AbstractC7812oO00o oo00o) {
        oO0O0O00.OooO0O0();
        this.f20622OooO00o.m19529OooO00o();
        if (this.OooO0o || this.OooO0oO) {
            OooO0OO(oo00o);
            return;
        }
        this.f20623OooO00o.remove(oo00o);
        if (this.f20623OooO00o.isEmpty()) {
            m19329OooO00o();
        }
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o
    private ExecutorServiceC7746o0oooOO OooO00o() {
        if (this.f20627OooO0OO) {
            return this.OooO0OO;
        }
        return this.f20628OooO0Oo ? this.OooO0Oo : this.f20624OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19332OooO0O0() {
        return this.OooO0o0;
    }

    public void OooO0O0() {
        this.f20622OooO00o.m19529OooO00o();
        if (this.OooO0oo) {
            this.f20618OooO00o.OooO00o(this, this.f20616OooO00o);
            OooO00o(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    private boolean OooO00o(AbstractC7812oO00o oo00o) {
        List<AbstractC7812oO00o> list = this.f20625OooO0O0;
        return list != null && list.contains(oo00o);
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19329OooO00o() {
        if (!this.OooO0oO && !this.OooO0o && !this.OooO0oo) {
            this.OooO0oo = true;
            this.f20614OooO00o.OooO0O0();
            this.f20618OooO00o.OooO00o(this, this.f20616OooO00o);
        }
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19331OooO00o() {
        return this.OooO0oo;
    }

    private void OooO00o(boolean z) {
        oO0O0O00.OooO0O0();
        this.f20623OooO00o.clear();
        this.f20616OooO00o = null;
        this.f20619OooO00o = null;
        this.f20620OooO00o = null;
        List<AbstractC7812oO00o> list = this.f20625OooO0O0;
        if (list != null) {
            list.clear();
        }
        this.OooO0oO = false;
        this.OooO0oo = false;
        this.OooO0o = false;
        this.f20614OooO00o.OooO00o(z);
        this.f20614OooO00o = null;
        this.f20615OooO00o = null;
        this.f20613OooO00o = null;
        this.f20612OooO00o.release(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.o0oo0oo0<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.OooO0O0
    public void OooO00o(AbstractC7700o0oo0oo0<R> o0oo0oo0, DataSource dataSource) {
        this.f20620OooO00o = o0oo0oo0;
        this.f20613OooO00o = dataSource;
        OooO00o.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.OooO0O0
    public void OooO00o(GlideException glideException) {
        this.f20615OooO00o = glideException;
        OooO00o.obtainMessage(2, this).sendToTarget();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.OooO0O0
    public void OooO00o(DecodeJob<?> decodeJob) {
        OooO00o().execute(decodeJob);
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oO0O0O0o m19328OooO00o() {
        return this.f20622OooO00o;
    }
}
