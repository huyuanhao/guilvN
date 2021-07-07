package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.p118pd.sdk.AbstractC7644o0oOoOO;
import com.p118pd.sdk.AbstractC7653o0oOoo0;
import com.p118pd.sdk.AbstractC7655o0oOoo0O;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7682o0oo0OO0;
import com.p118pd.sdk.AbstractC7684o0oo0OOo;
import com.p118pd.sdk.AbstractC7695o0oo0o0o;
import com.p118pd.sdk.AbstractC7700o0oo0oo0;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import com.p118pd.sdk.C7607o0o0OoOO;
import com.p118pd.sdk.C7648o0oOoOo;
import com.p118pd.sdk.C7676o0oo0O;
import com.p118pd.sdk.C7680o0oo0O0o;
import com.p118pd.sdk.C7681o0oo0OO;
import com.p118pd.sdk.C7683o0oo0OOO;
import com.p118pd.sdk.C7691o0oo0o;
import com.p118pd.sdk.C7693o0oo0o00;
import com.p118pd.sdk.C7696o0oo0oO;
import com.p118pd.sdk.C7698o0oo0oOo;
import com.p118pd.sdk.C7699o0oo0oo;
import com.p118pd.sdk.C7701o0oo0ooO;
import com.p118pd.sdk.C7706o0ooO000;
import com.p118pd.sdk.C7785oO000o00;
import com.p118pd.sdk.C7843oO0O00o;
import com.p118pd.sdk.C8953ooOOOoO0;
import com.p118pd.sdk.C8960ooOOOoo0;
import com.p118pd.sdk.oO0O0O0o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecodeJob<R> implements AbstractC7682o0oo0OO0.OooO00o, Runnable, Comparable<DecodeJob<?>>, C8953ooOOOoO0.OooO0o {
    public static final String o0ooOOo = "DecodeJob";
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Pools.OooO00o<DecodeJob<?>> f14811OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Priority f14812OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataSource f14813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0<R> f14814OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5097OooO0Oo<?> f14815OooO00o = new C5097OooO0Oo<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5098OooO0o0 f14816OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0o f14817OooO00o = new OooO0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RunReason f14818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Stage f14819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7607o0o0OoOO f14820OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7644o0oOoOO f14821OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7648o0oOoOo f14822OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7662o0oOooo0<?> f14823OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractC7682o0oo0OO0 f14824OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7681o0oo0OO<R> f14825OooO00o = new C7681o0oo0OO<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7684o0oo0OOo f14826OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7693o0oo0o00 f14827OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O0O0o f14828OooO00o = oO0O0O0o.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f14829OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Thread f14830OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<Throwable> f14831OooO00o = new ArrayList();
    public AbstractC7644o0oOoOO OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Object f14832OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14833OooO0O0;
    public AbstractC7644o0oOoOO OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public volatile boolean f14834OooO0OO;
    public volatile boolean OooO0Oo;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f14835o0ooOOo;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;
        public static final /* synthetic */ int[] OooO0OO;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.OooO00o.<clinit>():void");
        }
    }

    public interface OooO0O0<R> {
        void OooO00o(DecodeJob<?> decodeJob);

        void OooO00o(GlideException glideException);

        void OooO00o(AbstractC7700o0oo0oo0<R> o0oo0oo0, DataSource dataSource);
    }

    public final class OooO0OO<Z> implements C7683o0oo0OOO.OooO00o<Z> {
        public final DataSource OooO00o;

        public OooO0OO(DataSource dataSource) {
            this.OooO00o = dataSource;
        }

        @Override // com.p118pd.sdk.C7683o0oo0OOO.OooO00o
        @NonNull
        public AbstractC7700o0oo0oo0<Z> OooO00o(@NonNull AbstractC7700o0oo0oo0<Z> o0oo0oo0) {
            return DecodeJob.this.OooO00o(this.OooO00o, o0oo0oo0);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5098OooO0o0 {
        AbstractC7734o0ooo00O OooO00o();
    }

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public DecodeJob(AbstractC5098OooO0o0 oooO0o0, Pools.OooO00o<DecodeJob<?>> oooO00o) {
        this.f14816OooO00o = oooO0o0;
        this.f14811OooO00o = oooO00o;
    }

    private void OooO() {
        int i = OooO00o.OooO00o[this.f14818OooO00o.ordinal()];
        if (i == 1) {
            this.f14819OooO00o = OooO00o(Stage.INITIALIZE);
            this.f14824OooO00o = m14991OooO00o();
            OooO0oo();
        } else if (i == 2) {
            OooO0oo();
        } else if (i == 3) {
            OooO0OO();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f14818OooO00o);
        }
    }

    private void OooO0Oo() {
        OooOO0();
        this.f14814OooO00o.OooO00o(new GlideException("Failed to load resource", new ArrayList(this.f14831OooO00o)));
        OooO0o();
    }

    private void OooO0o() {
        if (this.f14817OooO00o.OooO0O0()) {
            OooO0oO();
        }
    }

    private void OooO0o0() {
        if (this.f14817OooO00o.m14996OooO00o()) {
            OooO0oO();
        }
    }

    private void OooO0oO() {
        this.f14817OooO00o.OooO00o();
        this.f14815OooO00o.OooO00o();
        this.f14825OooO00o.m19321OooO00o();
        this.f14834OooO0OO = false;
        this.f14820OooO00o = null;
        this.f14821OooO00o = null;
        this.f14822OooO00o = null;
        this.f14812OooO00o = null;
        this.f14827OooO00o = null;
        this.f14814OooO00o = null;
        this.f14819OooO00o = null;
        this.f14824OooO00o = null;
        this.f14830OooO00o = null;
        this.OooO0O0 = null;
        this.f14832OooO0O0 = null;
        this.f14813OooO00o = null;
        this.f14823OooO00o = null;
        this.OooO00o = 0;
        this.OooO0Oo = false;
        this.f14829OooO00o = null;
        this.f14831OooO00o.clear();
        this.f14811OooO00o.release(this);
    }

    private void OooO0oo() {
        this.f14830OooO00o = Thread.currentThread();
        this.OooO00o = C7843oO0O00o.OooO00o();
        boolean z = false;
        while (!this.OooO0Oo && this.f14824OooO00o != null && !(z = this.f14824OooO00o.OooO00o())) {
            this.f14819OooO00o = OooO00o(this.f14819OooO00o);
            this.f14824OooO00o = m14991OooO00o();
            if (this.f14819OooO00o == Stage.SOURCE) {
                m14993OooO00o();
                return;
            }
        }
        if ((this.f14819OooO00o == Stage.FINISHED || this.OooO0Oo) && !z) {
            OooO0Oo();
        }
    }

    private void OooOO0() {
        this.f14828OooO00o.m19529OooO00o();
        if (!this.f14834OooO0OO) {
            this.f14834OooO0OO = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    public DecodeJob<R> OooO00o(C7607o0o0OoOO o0o0oooo, Object obj, C7693o0oo0o00 o0oo0o00, AbstractC7644o0oOoOO o0ooooo, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC7684o0oo0OOo o0oo0ooo, Map<Class<?>, AbstractC7655o0oOoo0O<?>> map, boolean z, boolean z2, boolean z3, C7648o0oOoOo o0ooooo2, OooO0O0<R> oooO0O0, int i3) {
        this.f14825OooO00o.OooO00o(o0o0oooo, obj, o0ooooo, i, i2, o0oo0ooo, cls, cls2, priority, o0ooooo2, map, z, z2, this.f14816OooO00o);
        this.f14820OooO00o = o0o0oooo;
        this.f14821OooO00o = o0ooooo;
        this.f14812OooO00o = priority;
        this.f14827OooO00o = o0oo0o00;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.f14826OooO00o = o0oo0ooo;
        this.f14833OooO0O0 = z3;
        this.f14822OooO00o = o0ooooo2;
        this.f14814OooO00o = oooO0O0;
        this.f14835o0ooOOo = i3;
        this.f14818OooO00o = RunReason.INITIALIZE;
        this.f14829OooO00o = obj;
        return this;
    }

    public void OooO0O0() {
        this.OooO0Oo = true;
        AbstractC7682o0oo0OO0 o0oo0oo0 = this.f14824OooO00o;
        if (o0oo0oo0 != null) {
            o0oo0oo0.cancel();
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14994OooO0OO() {
        Stage OooO00o2 = OooO00o(Stage.INITIALIZE);
        return OooO00o2 == Stage.RESOURCE_CACHE || OooO00o2 == Stage.DATA_CACHE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.run():void");
    }

    public static class OooO0o {
        public boolean OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public synchronized boolean OooO00o(boolean z) {
            this.OooO00o = true;
            return OooO0O0(z);
        }

        public synchronized boolean OooO0O0() {
            this.OooO0OO = true;
            return OooO0O0(false);
        }

        private boolean OooO0O0(boolean z) {
            return (this.OooO0OO || z || this.OooO0O0) && this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public synchronized boolean m14996OooO00o() {
            this.OooO0O0 = true;
            return OooO0O0(false);
        }

        public synchronized void OooO00o() {
            this.OooO0O0 = false;
            this.OooO00o = false;
            this.OooO0OO = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$OooO0Oo  reason: case insensitive filesystem */
    public static class C5097OooO0Oo<Z> {
        public AbstractC7644o0oOoOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7653o0oOoo0<Z> f14837OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7698o0oo0oOo<Z> f14838OooO00o;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o0oOoo0<X> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.o0oo0oOo<X> */
        /* JADX WARN: Multi-variable type inference failed */
        public <X> void OooO00o(AbstractC7644o0oOoOO o0ooooo, AbstractC7653o0oOoo0<X> o0oooo0, C7698o0oo0oOo<X> o0oo0ooo) {
            this.OooO00o = o0ooooo;
            this.f14837OooO00o = o0oooo0;
            this.f14838OooO00o = o0oo0ooo;
        }

        public void OooO00o(AbstractC5098OooO0o0 oooO0o0, C7648o0oOoOo o0ooooo) {
            C8960ooOOOoo0.m20625OooO00o("DecodeJob.encode");
            try {
                oooO0o0.OooO00o().OooO00o(this.OooO00o, new C7676o0oo0O(this.f14837OooO00o, this.f14838OooO00o, o0ooooo));
            } finally {
                this.f14838OooO00o.m19340OooO00o();
                C8960ooOOOoo0.OooO00o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14995OooO00o() {
            return this.f14838OooO00o != null;
        }

        public void OooO00o() {
            this.OooO00o = null;
            this.f14837OooO00o = null;
            this.f14838OooO00o = null;
        }
    }

    private void OooO0OO() {
        if (Log.isLoggable(o0ooOOo, 2)) {
            long j = this.OooO00o;
            OooO00o("Retrieved data", j, "data: " + this.f14832OooO0O0 + ", cache key: " + this.OooO0O0 + ", fetcher: " + this.f14823OooO00o);
        }
        AbstractC7700o0oo0oo0<R> o0oo0oo0 = null;
        try {
            o0oo0oo0 = OooO00o(this.f14823OooO00o, this.f14832OooO0O0, this.f14813OooO00o);
        } catch (GlideException e) {
            e.setLoggingDetails(this.OooO0OO, this.f14813OooO00o);
            this.f14831OooO00o.add(e);
        }
        if (o0oo0oo0 != null) {
            OooO0O0(o0oo0oo0, this.f14813OooO00o);
        } else {
            OooO0oo();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.pd.sdk.o0oo0oOo */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.pd.sdk.o0oo0oOo */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.pd.sdk.o0oo0oOo */
    /* JADX WARN: Multi-variable type inference failed */
    private void OooO0O0(AbstractC7700o0oo0oo0<R> o0oo0oo0, DataSource dataSource) {
        if (o0oo0oo0 instanceof AbstractC7695o0oo0o0o) {
            ((AbstractC7695o0oo0o0o) o0oo0oo0).initialize();
        }
        C7698o0oo0oOo o0oo0ooo = 0;
        if (this.f14815OooO00o.m14995OooO00o()) {
            o0oo0oo0 = C7698o0oo0oOo.OooO00o((AbstractC7700o0oo0oo0) o0oo0oo0);
            o0oo0ooo = o0oo0oo0;
        }
        OooO00o((AbstractC7700o0oo0oo0) o0oo0oo0, dataSource);
        this.f14819OooO00o = Stage.ENCODE;
        try {
            if (this.f14815OooO00o.m14995OooO00o()) {
                this.f14815OooO00o.OooO00o(this.f14816OooO00o, this.f14822OooO00o);
            }
            OooO0o0();
        } finally {
            if (o0oo0ooo != 0) {
                o0oo0ooo.m19340OooO00o();
            }
        }
    }

    public void OooO00o(boolean z) {
        if (this.f14817OooO00o.OooO00o(z)) {
            OooO0oO();
        }
    }

    /* renamed from: OooO00o */
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        int OooO00o2 = OooO00o() - decodeJob.OooO00o();
        return OooO00o2 == 0 ? this.f14835o0ooOOo - decodeJob.f14835o0ooOOo : OooO00o2;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    private int OooO00o() {
        return this.f14812OooO00o.ordinal();
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    private AbstractC7682o0oo0OO0 m14991OooO00o() {
        int i = OooO00o.OooO0O0[this.f14819OooO00o.ordinal()];
        if (i == 1) {
            return new C7699o0oo0oo(this.f14825OooO00o, this);
        }
        if (i == 2) {
            return new C7680o0oo0O0o(this.f14825OooO00o, this);
        }
        if (i == 3) {
            return new C7706o0ooO000(this.f14825OooO00o, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f14819OooO00o);
    }

    private void OooO00o(AbstractC7700o0oo0oo0<R> o0oo0oo0, DataSource dataSource) {
        OooOO0();
        this.f14814OooO00o.OooO00o(o0oo0oo0, dataSource);
    }

    private Stage OooO00o(Stage stage) {
        int i = OooO00o.OooO0O0[stage.ordinal()];
        if (i == 1) {
            return this.f14826OooO00o.OooO00o() ? Stage.DATA_CACHE : OooO00o(Stage.DATA_CACHE);
        }
        if (i == 2) {
            return this.f14833OooO0O0 ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return Stage.FINISHED;
        }
        if (i == 5) {
            return this.f14826OooO00o.OooO0O0() ? Stage.RESOURCE_CACHE : OooO00o(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14993OooO00o() {
        this.f14818OooO00o = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f14814OooO00o.OooO00o((DecodeJob<?>) this);
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, Object obj, AbstractC7662o0oOooo0<?> o0ooooo0, DataSource dataSource, AbstractC7644o0oOoOO o0ooooo2) {
        this.OooO0O0 = o0ooooo;
        this.f14832OooO0O0 = obj;
        this.f14823OooO00o = o0ooooo0;
        this.f14813OooO00o = dataSource;
        this.OooO0OO = o0ooooo2;
        if (Thread.currentThread() != this.f14830OooO00o) {
            this.f14818OooO00o = RunReason.DECODE_DATA;
            this.f14814OooO00o.OooO00o((DecodeJob<?>) this);
            return;
        }
        C8960ooOOOoo0.m20625OooO00o("DecodeJob.decodeFromRetrievedData");
        try {
            OooO0OO();
        } finally {
            C8960ooOOOoo0.OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, Exception exc, AbstractC7662o0oOooo0<?> o0ooooo0, DataSource dataSource) {
        o0ooooo0.m19298OooO00o();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(o0ooooo, dataSource, o0ooooo0.m19297OooO00o());
        this.f14831OooO00o.add(glideException);
        if (Thread.currentThread() != this.f14830OooO00o) {
            this.f14818OooO00o = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f14814OooO00o.OooO00o((DecodeJob<?>) this);
            return;
        }
        OooO0oo();
    }

    private <Data> AbstractC7700o0oo0oo0<R> OooO00o(AbstractC7662o0oOooo0<?> o0ooooo0, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            o0ooooo0.m19298OooO00o();
            return null;
        }
        try {
            long OooO00o2 = C7843oO0O00o.OooO00o();
            AbstractC7700o0oo0oo0<R> OooO00o3 = OooO00o((Object) data, dataSource);
            if (Log.isLoggable(o0ooOOo, 2)) {
                OooO00o("Decoded result " + OooO00o3, OooO00o2);
            }
            return OooO00o3;
        } finally {
            o0ooooo0.m19298OooO00o();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.o0oo0oO<Data, ?, R>, com.pd.sdk.o0oo0oO<Data, ResourceType, R> */
    private <Data> AbstractC7700o0oo0oo0<R> OooO00o(Data data, DataSource dataSource) throws GlideException {
        return OooO00o(data, dataSource, (C7696o0oo0oO<Data, ?, R>) this.f14825OooO00o.m19316OooO00o((Class) data.getClass()));
    }

    @NonNull
    private C7648o0oOoOo OooO00o(DataSource dataSource) {
        C7648o0oOoOo o0ooooo = this.f14822OooO00o;
        if (Build.VERSION.SDK_INT < 26) {
            return o0ooooo;
        }
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f14825OooO00o.m19322OooO00o();
        Boolean bool = (Boolean) o0ooooo.OooO00o(C7785oO000o00.OooO0Oo);
        if (bool != null && (!bool.booleanValue() || z)) {
            return o0ooooo;
        }
        C7648o0oOoOo o0ooooo2 = new C7648o0oOoOo();
        o0ooooo2.OooO00o(this.f14822OooO00o);
        o0ooooo2.OooO00o(C7785oO000o00.OooO0Oo, Boolean.valueOf(z));
        return o0ooooo2;
    }

    private <Data, ResourceType> AbstractC7700o0oo0oo0<R> OooO00o(Data data, DataSource dataSource, C7696o0oo0oO<Data, ResourceType, R> o0oo0oo) throws GlideException {
        C7648o0oOoOo OooO00o2 = OooO00o(dataSource);
        AbstractC7661o0oOooo<Data> OooO00o3 = this.f14820OooO00o.m19243OooO00o().m14982OooO00o((Object) data);
        try {
            return o0oo0oo.OooO00o(OooO00o3, OooO00o2, this.o00oO0O, this.o0ooOO0, new OooO0OO(dataSource));
        } finally {
            OooO00o3.m19296OooO00o();
        }
    }

    private void OooO00o(String str, long j) {
        OooO00o(str, j, (String) null);
    }

    private void OooO00o(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C7843oO0O00o.OooO00o(j));
        sb.append(", load key: ");
        sb.append(this.f14827OooO00o);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.toString();
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oO0O0O0o m14992OooO00o() {
        return this.f14828OooO00o;
    }

    @NonNull
    public <Z> AbstractC7700o0oo0oo0<Z> OooO00o(DataSource dataSource, @NonNull AbstractC7700o0oo0oo0<Z> o0oo0oo0) {
        AbstractC7655o0oOoo0O<Z> o0oooo0o;
        AbstractC7700o0oo0oo0<Z> o0oo0oo02;
        EncodeStrategy encodeStrategy;
        AbstractC7644o0oOoOO o0ooooo;
        Class<?> cls = o0oo0oo0.get().getClass();
        AbstractC7653o0oOoo0 o0oooo0 = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            AbstractC7655o0oOoo0O<Z> OooO00o2 = this.f14825OooO00o.OooO00o((Class) cls);
            o0oooo0o = OooO00o2;
            o0oo0oo02 = OooO00o2.OooO00o(this.f14820OooO00o, o0oo0oo0, this.o00oO0O, this.o0ooOO0);
        } else {
            o0oo0oo02 = o0oo0oo0;
            o0oooo0o = null;
        }
        if (!o0oo0oo0.equals(o0oo0oo02)) {
            o0oo0oo0.recycle();
        }
        if (this.f14825OooO00o.m19323OooO00o((AbstractC7700o0oo0oo0<?>) o0oo0oo02)) {
            o0oooo0 = this.f14825OooO00o.OooO00o((AbstractC7700o0oo0oo0) o0oo0oo02);
            encodeStrategy = o0oooo0.OooO00o(this.f14822OooO00o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        if (!this.f14826OooO00o.OooO00o(!this.f14825OooO00o.OooO00o(this.OooO0O0), dataSource, encodeStrategy)) {
            return o0oo0oo02;
        }
        if (o0oooo0 != null) {
            int i = OooO00o.OooO0OO[encodeStrategy.ordinal()];
            if (i == 1) {
                o0ooooo = new C7691o0oo0o(this.OooO0O0, this.f14821OooO00o);
            } else if (i == 2) {
                o0ooooo = new C7701o0oo0ooO(this.f14825OooO00o.m19317OooO00o(), this.OooO0O0, this.f14821OooO00o, this.o00oO0O, this.o0ooOO0, o0oooo0o, cls, this.f14822OooO00o);
            } else {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            C7698o0oo0oOo OooO00o3 = C7698o0oo0oOo.OooO00o((AbstractC7700o0oo0oo0) o0oo0oo02);
            this.f14815OooO00o.OooO00o(o0ooooo, o0oooo0, OooO00o3);
            return OooO00o3;
        }
        throw new Registry.NoResultEncoderAvailableException(o0oo0oo02.get().getClass());
    }
}
