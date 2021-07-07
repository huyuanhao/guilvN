package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.react.views.text.FontMetricsUtil;
import com.p118pd.sdk.AbstractC7700o0oo0oo0;
import com.p118pd.sdk.AbstractC7812oO00o;
import com.p118pd.sdk.AbstractC7821oO00o0o;
import com.p118pd.sdk.AbstractC7833oO00oOo0;
import com.p118pd.sdk.AbstractC7868oO0OOOo0;
import com.p118pd.sdk.AbstractC8274oOo0000O;
import com.p118pd.sdk.AbstractC8301oOo00oO0;
import com.p118pd.sdk.C7607o0o0OoOO;
import com.p118pd.sdk.C7687o0oo0Oo;
import com.p118pd.sdk.C7824oO00o0oo;
import com.p118pd.sdk.C7843oO0O00o;
import com.p118pd.sdk.C8953ooOOOoO0;
import com.p118pd.sdk.oO00O0o0;
import com.p118pd.sdk.oO0O0O00;
import com.p118pd.sdk.oO0O0O0o;
import com.p118pd.sdk.oO0OOO0O;
import java.util.List;

public final class SingleRequest<R> implements AbstractC7821oO00o0o, AbstractC8301oOo00oO0, AbstractC7812oO00o, C8953ooOOOoO0.OooO0o {
    public static final Pools.OooO00o<SingleRequest<?>> OooO00o = C8953ooOOOoO0.OooO00o(150, new OooO00o());
    public static final boolean OooO0OO = Log.isLoggable(o0ooOoO, 2);
    public static final String o0OOO0o = "Glide";
    public static final String o0ooOoO = "Request";

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f14846OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f14847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f14848OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Priority f14849OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Status f14850OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7607o0o0OoOO f14851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7687o0oo0Oo.C7688OooO0Oo f14852OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7687o0oo0Oo f14853OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7700o0oo0oo0<R> f14854OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7824oO00o0oo f14855OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7833oO00oOo0<R> f14856OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O0O0o f14857OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public oO0OOO0O<R> f14858OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7868oO0OOOo0 f14859OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8274oOo0000O<? super R> f14860OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class<R> f14861OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f14862OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<oO0OOO0O<R>> f14863OooO00o;
    public Drawable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14864OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Drawable f14865OooO0OO;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    @Nullable

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f14866o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f14867o0ooOoO;

    public class OooO00o implements C8953ooOOOoO0.AbstractC8954OooO0Oo<SingleRequest<?>> {
        @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
        public SingleRequest<?> OooO00o() {
            return new SingleRequest<>();
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest() {
        this.f14866o0ooOOo = OooO0OO ? String.valueOf(super.hashCode()) : null;
        this.f14857OooO00o = oO0O0O0o.OooO00o();
    }

    public static <R> SingleRequest<R> OooO00o(Context context, C7607o0o0OoOO o0o0oooo, Object obj, Class<R> cls, C7824oO00o0oo oo00o0oo, int i, int i2, Priority priority, AbstractC7833oO00oOo0<R> oo00ooo0, oO0OOO0O<R> oo0ooo0o, @Nullable List<oO0OOO0O<R>> list, AbstractC7868oO0OOOo0 oo0oooo0, C7687o0oo0Oo o0oo0oo, AbstractC8274oOo0000O<? super R> ooo0000o) {
        SingleRequest<R> singleRequest = (SingleRequest<R>) OooO00o.acquire();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        singleRequest.m15012OooO00o(context, o0o0oooo, obj, (Class) cls, oo00o0oo, i, i2, priority, (AbstractC7833oO00oOo0) oo00ooo0, (oO0OOO0O) oo0ooo0o, (List) list, oo0oooo0, o0oo0oo, (AbstractC8274oOo0000O) ooo0000o);
        return singleRequest;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m15013OooO0O0() {
        m15011OooO00o();
        this.f14857OooO00o.m19529OooO00o();
        this.f14856OooO00o.removeCallback(this);
        C7687o0oo0Oo.C7688OooO0Oo oooO0Oo = this.f14852OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO00o();
            this.f14852OooO00o = null;
        }
    }

    private boolean OooO0o() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        return oo0oooo0 == null || oo0oooo0.OooO0OO(this);
    }

    private void OooO0o0() {
        if (OooO0o()) {
            Drawable drawable = null;
            if (this.f14862OooO00o == null) {
                drawable = OooO0O0();
            }
            if (drawable == null) {
                drawable = OooO00o();
            }
            if (drawable == null) {
                drawable = OooO0OO();
            }
            this.f14856OooO00o.onLoadFailed(drawable);
        }
    }

    private boolean OooO0oO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19563OooO0O0(this);
    }

    private boolean OooO0oo() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        return oo0oooo0 == null || !oo0oooo0.OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15019OooO0OO() {
        return this.f14850OooO00o == Status.CLEARED;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m15020OooO0Oo() {
        return m15017OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void begin() {
        m15011OooO00o();
        this.f14857OooO00o.m19529OooO00o();
        this.f14846OooO00o = C7843oO0O00o.OooO00o();
        if (this.f14862OooO00o == null) {
            if (oO0O0O00.m19527OooO00o(this.o00oO0O, this.o0ooOO0)) {
                this.o0ooOOo = this.o00oO0O;
                this.f14867o0ooOoO = this.o0ooOO0;
            }
            OooO00o(new GlideException("Received null model"), OooO0O0() == null ? 5 : 3);
            return;
        }
        Status status = this.f14850OooO00o;
        if (status == Status.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (status == Status.COMPLETE) {
            OooO00o((AbstractC7700o0oo0oo0<?>) this.f14854OooO00o, DataSource.MEMORY_CACHE);
        } else {
            this.f14850OooO00o = Status.WAITING_FOR_SIZE;
            if (oO0O0O00.m19527OooO00o(this.o00oO0O, this.o0ooOO0)) {
                OooO00o(this.o00oO0O, this.o0ooOO0);
            } else {
                this.f14856OooO00o.getSize(this);
            }
            Status status2 = this.f14850OooO00o;
            if ((status2 == Status.RUNNING || status2 == Status.WAITING_FOR_SIZE) && OooO0o()) {
                this.f14856OooO00o.onLoadStarted(OooO0OO());
            }
            if (OooO0OO) {
                OooO00o("finished run method in " + C7843oO0O00o.OooO00o(this.f14846OooO00o));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void clear() {
        oO0O0O00.OooO0O0();
        m15011OooO00o();
        this.f14857OooO00o.m19529OooO00o();
        if (this.f14850OooO00o != Status.CLEARED) {
            m15013OooO0O0();
            AbstractC7700o0oo0oo0<R> o0oo0oo0 = this.f14854OooO00o;
            if (o0oo0oo0 != null) {
                OooO00o((AbstractC7700o0oo0oo0<?>) o0oo0oo0);
            }
            if (m15015OooO0o0()) {
                this.f14856OooO00o.onLoadCleared(OooO0OO());
            }
            this.f14850OooO00o = Status.CLEARED;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean isRunning() {
        Status status = this.f14850OooO00o;
        return status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void recycle() {
        m15011OooO00o();
        this.f14847OooO00o = null;
        this.f14851OooO00o = null;
        this.f14862OooO00o = null;
        this.f14861OooO00o = null;
        this.f14855OooO00o = null;
        this.o00oO0O = -1;
        this.o0ooOO0 = -1;
        this.f14856OooO00o = null;
        this.f14863OooO00o = null;
        this.f14858OooO00o = null;
        this.f14859OooO00o = null;
        this.f14860OooO00o = null;
        this.f14852OooO00o = null;
        this.f14848OooO00o = null;
        this.OooO0O0 = null;
        this.f14865OooO0OO = null;
        this.o0ooOOo = -1;
        this.f14867o0ooOoO = -1;
        OooO00o.release(this);
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    private Drawable OooO0OO() {
        if (this.OooO0O0 == null) {
            Drawable placeholderDrawable = this.f14855OooO00o.getPlaceholderDrawable();
            this.OooO0O0 = placeholderDrawable;
            if (placeholderDrawable == null && this.f14855OooO00o.getPlaceholderId() > 0) {
                this.OooO0O0 = OooO00o(this.f14855OooO00o.getPlaceholderId());
            }
        }
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    private void OooO0Oo() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0O0((AbstractC7821oO00o0o) this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0Oo(AbstractC7821oO00o0o oo00o0o) {
        if (!(oo00o0o instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) oo00o0o;
        if (this.o00oO0O != singleRequest.o00oO0O || this.o0ooOO0 != singleRequest.o0ooOO0 || !oO0O0O00.OooO00o(this.f14862OooO00o, singleRequest.f14862OooO00o) || !this.f14861OooO00o.equals(singleRequest.f14861OooO00o) || !this.f14855OooO00o.equals(singleRequest.f14855OooO00o) || this.f14849OooO00o != singleRequest.f14849OooO00o || !OooO00o((SingleRequest<?>) this, (SingleRequest<?>) singleRequest)) {
            return false;
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15012OooO00o(Context context, C7607o0o0OoOO o0o0oooo, Object obj, Class<R> cls, C7824oO00o0oo oo00o0oo, int i, int i2, Priority priority, AbstractC7833oO00oOo0<R> oo00ooo0, oO0OOO0O<R> oo0ooo0o, @Nullable List<oO0OOO0O<R>> list, AbstractC7868oO0OOOo0 oo0oooo0, C7687o0oo0Oo o0oo0oo, AbstractC8274oOo0000O<? super R> ooo0000o) {
        this.f14847OooO00o = context;
        this.f14851OooO00o = o0o0oooo;
        this.f14862OooO00o = obj;
        this.f14861OooO00o = cls;
        this.f14855OooO00o = oo00o0oo;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.f14849OooO00o = priority;
        this.f14856OooO00o = oo00ooo0;
        this.f14858OooO00o = oo0ooo0o;
        this.f14863OooO00o = list;
        this.f14859OooO00o = oo0oooo0;
        this.f14853OooO00o = o0oo0oo;
        this.f14860OooO00o = ooo0000o;
        this.f14850OooO00o = Status.PENDING;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    private void m15014OooO0OO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO00o((AbstractC7821oO00o0o) this);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    private boolean m15015OooO0o0() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f14859OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19562OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15018OooO0O0() {
        return this.f14850OooO00o == Status.FAILED;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    private Drawable OooO0O0() {
        if (this.f14865OooO0OO == null) {
            Drawable fallbackDrawable = this.f14855OooO00o.getFallbackDrawable();
            this.f14865OooO0OO = fallbackDrawable;
            if (fallbackDrawable == null && this.f14855OooO00o.getFallbackId() > 0) {
                this.f14865OooO0OO = OooO00o(this.f14855OooO00o.getFallbackId());
            }
        }
        return this.f14865OooO0OO;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7821oO00o0o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oO0O0O0o m15016OooO00o() {
        return this.f14857OooO00o;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15011OooO00o() {
        if (this.f14864OooO0O0) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private void OooO00o(AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        this.f14853OooO00o.OooO0O0(o0oo0oo0);
        this.f14854OooO00o = null;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7821oO00o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15017OooO00o() {
        return this.f14850OooO00o == Status.COMPLETE;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7821oO00o0o
    private Drawable OooO00o() {
        if (this.f14848OooO00o == null) {
            Drawable errorPlaceholder = this.f14855OooO00o.getErrorPlaceholder();
            this.f14848OooO00o = errorPlaceholder;
            if (errorPlaceholder == null && this.f14855OooO00o.getErrorId() > 0) {
                this.f14848OooO00o = OooO00o(this.f14855OooO00o.getErrorId());
            }
        }
        return this.f14848OooO00o;
    }

    private Drawable OooO00o(@DrawableRes int i) {
        return oO00O0o0.OooO00o(this.f14851OooO00o, i, this.f14855OooO00o.getTheme() != null ? this.f14855OooO00o.getTheme() : this.f14847OooO00o.getTheme());
    }

    @Override // com.p118pd.sdk.AbstractC8301oOo00oO0
    public void OooO00o(int i, int i2) {
        this.f14857OooO00o.m19529OooO00o();
        if (OooO0OO) {
            OooO00o("Got onSizeReady in " + C7843oO0O00o.OooO00o(this.f14846OooO00o));
        }
        if (this.f14850OooO00o == Status.WAITING_FOR_SIZE) {
            this.f14850OooO00o = Status.RUNNING;
            float sizeMultiplier = this.f14855OooO00o.getSizeMultiplier();
            this.o0ooOOo = OooO00o(i, sizeMultiplier);
            this.f14867o0ooOoO = OooO00o(i2, sizeMultiplier);
            if (OooO0OO) {
                OooO00o("finished setup for calling load in " + C7843oO0O00o.OooO00o(this.f14846OooO00o));
            }
            this.f14852OooO00o = this.f14853OooO00o.OooO00o(this.f14851OooO00o, this.f14862OooO00o, this.f14855OooO00o.getSignature(), this.o0ooOOo, this.f14867o0ooOoO, this.f14855OooO00o.getResourceClass(), this.f14861OooO00o, this.f14849OooO00o, this.f14855OooO00o.getDiskCacheStrategy(), this.f14855OooO00o.getTransformations(), this.f14855OooO00o.isTransformationRequired(), this.f14855OooO00o.isScaleOnlyOrNoTransform(), this.f14855OooO00o.getOptions(), this.f14855OooO00o.isMemoryCacheable(), this.f14855OooO00o.getUseUnlimitedSourceGeneratorsPool(), this.f14855OooO00o.getUseAnimationPool(), this.f14855OooO00o.getOnlyRetrieveFromCache(), this);
            if (this.f14850OooO00o != Status.RUNNING) {
                this.f14852OooO00o = null;
            }
            if (OooO0OO) {
                OooO00o("finished onSizeReady in " + C7843oO0O00o.OooO00o(this.f14846OooO00o));
            }
        }
    }

    public static int OooO00o(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bumptech.glide.request.SingleRequest<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.AbstractC7812oO00o
    public void OooO00o(AbstractC7700o0oo0oo0<?> o0oo0oo0, DataSource dataSource) {
        this.f14857OooO00o.m19529OooO00o();
        this.f14852OooO00o = null;
        if (o0oo0oo0 == null) {
            OooO00o(new GlideException("Expected to receive a Resource<R> with an object of " + this.f14861OooO00o + " inside, but instead got null."));
            return;
        }
        Object obj = o0oo0oo0.get();
        if (obj == null || !this.f14861OooO00o.isAssignableFrom(obj.getClass())) {
            OooO00o(o0oo0oo0);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to receive an object of ");
            sb.append(this.f14861OooO00o);
            sb.append(" but instead got ");
            String str = "";
            sb.append(obj != null ? obj.getClass() : str);
            sb.append("{");
            sb.append(obj);
            sb.append("} inside Resource{");
            sb.append(o0oo0oo0);
            sb.append("}.");
            String str2 = str;
            if (obj == null) {
                str2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            sb.append(str2);
            OooO00o(new GlideException(sb.toString()));
        } else if (!OooO0oO()) {
            OooO00o(o0oo0oo0);
            this.f14850OooO00o = Status.COMPLETE;
        } else {
            OooO00o(o0oo0oo0, obj, dataSource);
        }
    }

    /* JADX INFO: finally extract failed */
    private void OooO00o(AbstractC7700o0oo0oo0<R> o0oo0oo0, R r, DataSource dataSource) {
        boolean z;
        boolean OooO0oo = OooO0oo();
        this.f14850OooO00o = Status.COMPLETE;
        this.f14854OooO00o = o0oo0oo0;
        if (this.f14851OooO00o.OooO00o() <= 3) {
            String str = "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.f14862OooO00o + " with size [" + this.o0ooOOo + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + this.f14867o0ooOoO + "] in " + C7843oO0O00o.OooO00o(this.f14846OooO00o) + " ms";
        }
        boolean z2 = true;
        this.f14864OooO0O0 = true;
        try {
            if (this.f14863OooO00o != null) {
                z = false;
                for (oO0OOO0O<R> oo0ooo0o : this.f14863OooO00o) {
                    z |= oo0ooo0o.onResourceReady(r, this.f14862OooO00o, this.f14856OooO00o, dataSource, OooO0oo);
                }
            } else {
                z = false;
            }
            if (this.f14858OooO00o == null || !this.f14858OooO00o.onResourceReady(r, this.f14862OooO00o, this.f14856OooO00o, dataSource, OooO0oo)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.f14856OooO00o.onResourceReady(r, this.f14860OooO00o.OooO00o(dataSource, OooO0oo));
            }
            this.f14864OooO0O0 = false;
            OooO0Oo();
        } catch (Throwable th) {
            this.f14864OooO0O0 = false;
            throw th;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7812oO00o
    public void OooO00o(GlideException glideException) {
        OooO00o(glideException, 5);
    }

    /* JADX INFO: finally extract failed */
    private void OooO00o(GlideException glideException, int i) {
        boolean z;
        this.f14857OooO00o.m19529OooO00o();
        int OooO00o2 = this.f14851OooO00o.OooO00o();
        if (OooO00o2 <= i) {
            String str = "Load failed for " + this.f14862OooO00o + " with size [" + this.o0ooOOo + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + this.f14867o0ooOoO + "]";
            if (OooO00o2 <= 4) {
                glideException.logRootCauses("Glide");
            }
        }
        this.f14852OooO00o = null;
        this.f14850OooO00o = Status.FAILED;
        boolean z2 = true;
        this.f14864OooO0O0 = true;
        try {
            if (this.f14863OooO00o != null) {
                z = false;
                for (oO0OOO0O<R> oo0ooo0o : this.f14863OooO00o) {
                    z |= oo0ooo0o.onLoadFailed(glideException, this.f14862OooO00o, this.f14856OooO00o, OooO0oo());
                }
            } else {
                z = false;
            }
            if (this.f14858OooO00o == null || !this.f14858OooO00o.onLoadFailed(glideException, this.f14862OooO00o, this.f14856OooO00o, OooO0oo())) {
                z2 = false;
            }
            if (!z && !z2) {
                OooO0o0();
            }
            this.f14864OooO0O0 = false;
            m15014OooO0OO();
        } catch (Throwable th) {
            this.f14864OooO0O0 = false;
            throw th;
        }
    }

    public static boolean OooO00o(SingleRequest<?> singleRequest, SingleRequest<?> singleRequest2) {
        List<oO0OOO0O<R>> list = singleRequest.f14863OooO00o;
        int size = list == null ? 0 : list.size();
        List<oO0OOO0O<R>> list2 = singleRequest2.f14863OooO00o;
        if (size == (list2 == null ? 0 : list2.size())) {
            return true;
        }
        return false;
    }

    private void OooO00o(String str) {
        String str2 = str + " this: " + this.f14866o0ooOOo;
    }
}
