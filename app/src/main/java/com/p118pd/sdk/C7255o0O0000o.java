package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.C7505o0OoOoOO;
import com.p118pd.sdk.o0O0000O;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.pd.sdk.o0O0000o  reason: case insensitive filesystem */
public class C7255o0O0000o<T> {
    public static final Executor OooO0O0 = new OooO0O0();
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final o0O0000O<T> f19834OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final o0O00OOO f19835OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<T> f19836OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f19837OooO00o;
    @NonNull

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<T> f19838OooO0O0;

    /* renamed from: com.pd.sdk.o0O0000o$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ List f19839OooO00o;
        public final /* synthetic */ List OooO0O0;
        public final /* synthetic */ int o00oO0O;

        /* renamed from: com.pd.sdk.o0O0000o$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4957OooO00o extends C7505o0OoOoOO.OooO0O0 {
            public C4957OooO00o() {
            }

            @Override // com.p118pd.sdk.C7505o0OoOoOO.OooO0O0
            public int OooO00o() {
                return OooO00o.this.OooO0O0.size();
            }

            @Override // com.p118pd.sdk.C7505o0OoOoOO.OooO0O0
            public int OooO0O0() {
                return OooO00o.this.f19839OooO00o.size();
            }

            @Override // com.p118pd.sdk.C7505o0OoOoOO.OooO0O0, com.p118pd.sdk.C7505o0OoOoOO.OooO0O0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m18732OooO00o(int i, int i2) {
                Object obj = OooO00o.this.f19839OooO00o.get(i);
                Object obj2 = OooO00o.this.OooO0O0.get(i2);
                if (obj != null && obj2 != null) {
                    return C7255o0O0000o.this.f19834OooO00o.OooO00o().m19138OooO00o(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // com.p118pd.sdk.C7505o0OoOoOO.OooO0O0
            public boolean OooO0O0(int i, int i2) {
                Object obj = OooO00o.this.f19839OooO00o.get(i);
                Object obj2 = OooO00o.this.OooO0O0.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C7255o0O0000o.this.f19834OooO00o.OooO00o().OooO0O0(obj, obj2);
            }

            @Override // com.p118pd.sdk.C7505o0OoOoOO.OooO0O0, com.p118pd.sdk.C7505o0OoOoOO.OooO0O0
            @Nullable
            public Object OooO00o(int i, int i2) {
                Object obj = OooO00o.this.f19839OooO00o.get(i);
                Object obj2 = OooO00o.this.OooO0O0.get(i2);
                if (obj != null && obj2 != null) {
                    return C7255o0O0000o.this.f19834OooO00o.OooO00o().OooO00o(obj, obj2);
                }
                throw new AssertionError();
            }
        }

        /* renamed from: com.pd.sdk.o0O0000o$OooO00o$OooO0O0 */
        public class OooO0O0 implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7505o0OoOoOO.OooO0OO f19840OooO00o;

            public OooO0O0(C7505o0OoOoOO.OooO0OO oooO0OO) {
                this.f19840OooO00o = oooO0OO;
            }

            public void run() {
                OooO00o oooO00o = OooO00o.this;
                C7255o0O0000o o0o0000o = C7255o0O0000o.this;
                if (o0o0000o.OooO00o == oooO00o.o00oO0O) {
                    o0o0000o.OooO00o(oooO00o.OooO0O0, this.f19840OooO00o);
                }
            }
        }

        public OooO00o(List list, List list2, int i) {
            this.f19839OooO00o = list;
            this.OooO0O0 = list2;
            this.o00oO0O = i;
        }

        public void run() {
            C7255o0O0000o.this.f19837OooO00o.execute(new OooO0O0(C7505o0OoOoOO.OooO00o(new C4957OooO00o())));
        }
    }

    /* renamed from: com.pd.sdk.o0O0000o$OooO0O0 */
    public static class OooO0O0 implements Executor {
        public final Handler OooO00o = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.OooO00o.post(runnable);
        }
    }

    public C7255o0O0000o(@NonNull RecyclerView.AbstractC5065OooO0oO oooO0oO, @NonNull C7505o0OoOoOO.AbstractC7506OooO0Oo<T> oooO0Oo) {
        this(new o0O00000(oooO0oO), new o0O0000O.OooO00o(oooO0Oo).OooO00o());
    }

    @NonNull
    public List<T> OooO00o() {
        return this.f19838OooO0O0;
    }

    public void OooO00o(@Nullable List<T> list) {
        int i = this.OooO00o + 1;
        this.OooO00o = i;
        List<T> list2 = this.f19836OooO00o;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.f19836OooO00o = null;
                this.f19838OooO0O0 = Collections.emptyList();
                this.f19835OooO00o.OooO00o(0, size);
            } else if (list2 == null) {
                this.f19836OooO00o = list;
                this.f19838OooO0O0 = Collections.unmodifiableList(list);
                this.f19835OooO00o.OooO0OO(0, list.size());
            } else {
                this.f19834OooO00o.m18731OooO00o().execute(new OooO00o(list2, list, i));
            }
        }
    }

    public C7255o0O0000o(@NonNull o0O00OOO o0o00ooo, @NonNull o0O0000O<T> o0o0000o) {
        this.f19838OooO0O0 = Collections.emptyList();
        this.f19835OooO00o = o0o00ooo;
        this.f19834OooO00o = o0o0000o;
        if (o0o0000o.OooO0O0() != null) {
            this.f19837OooO00o = o0o0000o.OooO0O0();
        } else {
            this.f19837OooO00o = OooO0O0;
        }
    }

    public void OooO00o(@NonNull List<T> list, @NonNull C7505o0OoOoOO.OooO0OO oooO0OO) {
        this.f19836OooO00o = list;
        this.f19838OooO0O0 = Collections.unmodifiableList(list);
        oooO0OO.OooO00o(this.f19835OooO00o);
    }
}
