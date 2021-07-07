package com.p118pd.sdk;

import com.drew.lang.annotations.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oO0Oo0o0 */
public class oO0Oo0o0<T> {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o<T> f20962OooO00o = new OooO00o<>();

    @Nullable
    public T OooO00o(byte[] bArr) {
        OooO00o<T> oooO00o = this.f20962OooO00o;
        T t = (T) oooO00o.OooO00o;
        for (byte b : bArr) {
            oooO00o = (OooO00o) oooO00o.f20963OooO00o.get(Byte.valueOf(b));
            if (oooO00o == null) {
                break;
            }
            if (oooO00o.OooO00o != null) {
                t = (T) oooO00o.OooO00o;
            }
        }
        return t;
    }

    /* renamed from: com.pd.sdk.oO0Oo0o0$OooO00o */
    public static class OooO00o<T> {
        public T OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<Byte, OooO00o<T>> f20963OooO00o = new HashMap();

        public void OooO00o(T t) {
            if (this.OooO00o == null) {
                this.OooO00o = t;
                return;
            }
            throw new RuntimeException("Value already set for this trie node");
        }
    }

    public void OooO00o(T t, byte[]... bArr) {
        OooO00o<T> oooO00o = this.f20962OooO00o;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b : bArr2) {
                OooO00o<T> oooO00o2 = (OooO00o) oooO00o.f20963OooO00o.get(Byte.valueOf(b));
                if (oooO00o2 == null) {
                    oooO00o2 = new OooO00o<>();
                    oooO00o.f20963OooO00o.put(Byte.valueOf(b), oooO00o2);
                }
                oooO00o = oooO00o2;
                i++;
            }
        }
        if (i != 0) {
            oooO00o.OooO00o((Object) t);
            this.OooO00o = Math.max(this.OooO00o, i);
            return;
        }
        throw new IllegalArgumentException("Parts must contain at least one byte.");
    }

    public void OooO00o(T t) {
        this.f20962OooO00o.OooO00o((Object) t);
    }

    public int OooO00o() {
        return this.OooO00o;
    }
}
