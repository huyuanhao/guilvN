package com.p118pd.sdk;

import android.os.StatFs;
import com.p118pd.sdk.C9349III;
import com.rxhui.rxcache.CacheTarget;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.pd.sdk.ooOo0oOO  reason: case insensitive filesystem */
public final class C9021ooOo0oOO {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9020ooOo0oO f22326OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9029ooOoO00 f22327OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f22328OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Integer f22329OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Long f22330OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f22331OooO00o;

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO00o */
    public class OooO00o implements C9349III.OooO0OO<T, C9031ooOoO00O<T>> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Type f22332OooO00o;
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str, Type type) {
            this.o0ooOOo = str;
            this.f22332OooO00o = type;
        }

        /* renamed from: OooO00o */
        public C9349III<C9031ooOoO00O<T>> call(C9349III<T> r5) {
            String str = this.o0ooOOo;
            if (C9044ooOoOO0O.OooO0O0(C9021ooOo0oOO.this.f22331OooO00o)) {
                for (String str2 : C9021ooOo0oOO.this.f22331OooO00o) {
                    str = str.concat(str2);
                }
            }
            return C9032ooOoO0O.OooO00o().OooO00o(C9021ooOo0oOO.this, C9045ooOoOO0o.OooO0O0(str), r5, this.f22332OooO00o).OooO0OO(C6261iii1I1.OooO0OO()).m21402OooO00o(C6342il11.OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO0O0 */
    public class OooO0O0 extends OooO0o<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Type f22333OooO00o;
        public final /* synthetic */ String o0ooOOo;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Type type) {
            super(null);
            this.o0ooOOo = str;
            this.f22333OooO00o = type;
        }

        @Override // com.p118pd.sdk.C9021ooOo0oOO.OooO0o
        public T OooO00o() {
            return (T) C9021ooOo0oOO.this.f22326OooO00o.OooO00o(this.o0ooOOo, this.f22333OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO0OO */
    public class OooO0OO extends OooO0o<Boolean> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CacheTarget f22334OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f22335OooO00o;
        public final /* synthetic */ String o0ooOOo;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Object obj, CacheTarget cacheTarget) {
            super(null);
            this.o0ooOOo = str;
            this.f22335OooO00o = obj;
            this.f22334OooO00o = cacheTarget;
        }

        @Override // com.p118pd.sdk.C9021ooOo0oOO.OooO0o
        public Boolean OooO00o() {
            return Boolean.valueOf(C9021ooOo0oOO.this.f22326OooO00o.OooO00o(this.o0ooOOo, this.f22335OooO00o, this.f22334OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO0Oo  reason: case insensitive filesystem */
    public class C9022OooO0Oo extends OooO0o<Boolean> {
        public C9022OooO0Oo() {
            super(null);
        }

        @Override // com.p118pd.sdk.C9021ooOo0oOO.OooO0o
        public Boolean OooO00o() {
            C9021ooOo0oOO.this.f22326OooO00o.OooO00o();
            return true;
        }
    }

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO0o */
    public static abstract class OooO0o<T> implements C9349III.OooO00o<T> {
        public OooO0o() {
        }

        public abstract T OooO00o() throws Throwable;

        /* renamed from: OooO00o */
        public final void call(AbstractC9508LiLi<? super T> r3) {
            try {
                T OooO00o = OooO00o();
                if (!r3.isUnsubscribed()) {
                    r3.onNext(OooO00o);
                }
                if (!r3.isUnsubscribed()) {
                    r3.onCompleted();
                }
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                if (!r3.isUnsubscribed()) {
                    r3.onError(th);
                }
            }
        }

        public /* synthetic */ OooO0o(OooO00o oooO00o) {
            this();
        }
    }

    public C9021ooOo0oOO(C9023OooO0o0 oooO0o0) {
        this.f22327OooO00o = oooO0o0.f22336OooO00o;
        this.f22328OooO00o = oooO0o0.f22337OooO00o;
        this.OooO00o = oooO0o0.OooO00o;
        this.f22329OooO00o = oooO0o0.f22338OooO00o;
        this.f22330OooO00o = oooO0o0.f22339OooO00o;
        this.f22331OooO00o = oooO0o0.f22340OooO00o;
        this.f22326OooO00o = new C9020ooOo0oO(oooO0o0.f22338OooO00o.intValue() > 0 ? new C9024ooOo0oo(oooO0o0.f22338OooO00o.intValue()) : null, oooO0o0.f22339OooO00o.longValue() > 0 ? new C9025ooOo0oo0(oooO0o0.f22336OooO00o, oooO0o0.f22337OooO00o, oooO0o0.OooO00o, oooO0o0.f22339OooO00o.longValue()) : null);
    }

    public boolean OooO0O0(String str) {
        return this.f22326OooO00o.OooO0O0(C9045ooOoOO0o.OooO0O0(str));
    }

    /* renamed from: com.pd.sdk.ooOo0oOO$OooO0o0  reason: case insensitive filesystem */
    public static final class C9023OooO0o0 {
        public static final int OooO0O0 = 5242880;
        public static final int OooO0OO = 52428800;
        public static final int OooO0Oo = (((int) Runtime.getRuntime().maxMemory()) / 8);
        public int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC9029ooOoO00 f22336OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public File f22337OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Integer f22338OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Long f22339OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<String> f22340OooO00o;

        public C9023OooO0o0() {
        }

        public C9023OooO0o0 OooO0O0(int i) {
            this.f22338OooO00o = Integer.valueOf(i);
            return this;
        }

        public C9023OooO0o0(C9021ooOo0oOO oooo0ooo) {
            this.f22338OooO00o = oooo0ooo.f22329OooO00o;
            this.f22339OooO00o = oooo0ooo.f22330OooO00o;
            this.f22337OooO00o = oooo0ooo.f22328OooO00o;
            this.OooO00o = oooo0ooo.OooO00o;
            this.f22336OooO00o = oooo0ooo.f22327OooO00o;
            this.f22340OooO00o = oooo0ooo.f22331OooO00o;
        }

        public C9023OooO0o0 OooO00o(long j) {
            this.f22339OooO00o = Long.valueOf(j);
            return this;
        }

        public C9023OooO0o0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C9023OooO0o0 m20686OooO00o(File file) {
            this.f22337OooO00o = file;
            return this;
        }

        public C9023OooO0o0 OooO00o(AbstractC9029ooOoO00 ooooo00) {
            this.f22336OooO00o = ooooo00;
            return this;
        }

        public C9023OooO0o0 OooO00o(List<String> list) {
            this.f22340OooO00o = list;
            return this;
        }

        public C9021ooOo0oOO OooO00o() {
            File file = this.f22337OooO00o;
            if (file != null) {
                if (!file.exists()) {
                    this.f22337OooO00o.mkdirs();
                }
                if (this.f22336OooO00o == null) {
                    this.f22336OooO00o = new C9030ooOoO000();
                }
                if (this.f22338OooO00o == null) {
                    this.f22338OooO00o = Integer.valueOf(OooO0Oo);
                }
                if (this.f22339OooO00o == null) {
                    this.f22339OooO00o = OooO00o(this.f22337OooO00o);
                }
                this.OooO00o = Math.max(1, this.OooO00o);
                return new C9021ooOo0oOO(this);
            }
            throw new NullPointerException("CacheDir can not be null");
        }

        private Long OooO00o(File file) {
            long j;
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
            } catch (Exception unused) {
                j = 0;
            }
            return Long.valueOf(Math.max(Math.min(j, 52428800L), 5242880L));
        }
    }

    public <T> C9349III.OooO0OO<T, C9031ooOoO00O<T>> OooO00o(String str, Type type) {
        return new OooO00o(str, type);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> C9349III<T> m20685OooO00o(String str, Type type) {
        return C9349III.OooO0O0((C9349III.OooO00o) new OooO0O0(str, type)).OooO0o((C9349III) C9349III.OooOoo0());
    }

    public <T> C9349III<Boolean> OooO00o(String str, T t, CacheTarget cacheTarget) {
        return C9349III.OooO00o((C9349III.OooO00o) new OooO0OO(str, t, cacheTarget));
    }

    public boolean OooO00o(String str) {
        return this.f22326OooO00o.OooO00o(C9045ooOoOO0o.OooO0O0(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9349III<Boolean> m20684OooO00o() {
        return C9349III.OooO00o((C9349III.OooO00o) new C9022OooO0Oo());
    }

    public C9023OooO0o0 OooO00o() {
        return new C9023OooO0o0(this);
    }
}
