package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* renamed from: com.pd.sdk.oO00000  reason: case insensitive filesystem */
public class C7769oO00000<A, B> {
    public static final int OooO00o = 250;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O00oO<OooO0O0<A>, B> f20797OooO00o;

    /* renamed from: com.pd.sdk.oO00000$OooO00o */
    public class OooO00o extends oO0O00oO<OooO0O0<A>, B> {
        public OooO00o(long j) {
            super(j);
        }

        @Override // com.p118pd.sdk.oO0O00oO, com.p118pd.sdk.oO0O00oO
        public /* bridge */ /* synthetic */ void OooO00o(@NonNull Object obj, @Nullable Object obj2) {
            OooO00o((OooO0O0) ((OooO0O0) obj), obj2);
        }

        public void OooO00o(@NonNull OooO0O0<A> oooO0O0, @Nullable B b) {
            oooO0O0.OooO00o();
        }
    }

    public C7769oO00000() {
        this(250);
    }

    @Nullable
    public B OooO00o(A a, int i, int i2) {
        OooO0O0<A> OooO00o2 = OooO0O0.OooO00o((Object) a, i, i2);
        B OooO00o3 = this.f20797OooO00o.m19519OooO00o(OooO00o2);
        OooO00o2.OooO00o();
        return OooO00o3;
    }

    public C7769oO00000(long j) {
        this.f20797OooO00o = new OooO00o(j);
    }

    public void OooO00o(A a, int i, int i2, B b) {
        this.f20797OooO00o.OooO00o(OooO0O0.OooO00o((Object) a, i, i2), b);
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO00000$OooO0O0 */
    public static final class OooO0O0<A> {
        public static final Queue<OooO0O0<?>> OooO00o = oO0O0O00.m19524OooO00o(0);

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f20798OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public A f20799OooO00o;
        public int OooO0O0;

        public static <A> OooO0O0<A> OooO00o(A a, int i, int i2) {
            OooO0O0<A> oooO0O0;
            synchronized (OooO00o) {
                oooO0O0 = (OooO0O0<A>) OooO00o.poll();
            }
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0<>();
            }
            oooO0O0.m19418OooO00o((Object) a, i, i2);
            return oooO0O0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.OooO0O0 == oooO0O0.OooO0O0 && this.f20798OooO00o == oooO0O0.f20798OooO00o && this.f20799OooO00o.equals(oooO0O0.f20799OooO00o)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f20798OooO00o * 31) + this.OooO0O0) * 31) + this.f20799OooO00o.hashCode();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m19418OooO00o(A a, int i, int i2) {
            this.f20799OooO00o = a;
            this.OooO0O0 = i;
            this.f20798OooO00o = i2;
        }

        public void OooO00o() {
            synchronized (OooO00o) {
                OooO00o.offer(this);
            }
        }
    }

    public void OooO00o() {
        this.f20797OooO00o.m19520OooO00o();
    }
}
