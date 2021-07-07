package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.p118pd.sdk.C8953ooOOOoO0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.pd.sdk.o0oooOO0  reason: case insensitive filesystem */
public class C7747o0oooOO0 {
    public final Pools.OooO00o<OooO0O0> OooO00o = C8953ooOOOoO0.OooO0O0(10, new OooO00o());

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O00oO<AbstractC7644o0oOoOO, String> f20759OooO00o = new oO0O00oO<>(1000);

    /* renamed from: com.pd.sdk.o0oooOO0$OooO00o */
    public class OooO00o implements C8953ooOOOoO0.AbstractC8954OooO0Oo<OooO0O0> {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
        public OooO0O0 OooO00o() {
            try {
                return new OooO0O0(MessageDigest.getInstance(LL1i.OooO0Oo));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0oooOO0$OooO0O0 */
    public static final class OooO0O0 implements C8953ooOOOoO0.OooO0o {
        public final oO0O0O0o OooO00o = oO0O0O0o.OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final MessageDigest f20760OooO00o;

        public OooO0O0(MessageDigest messageDigest) {
            this.f20760OooO00o = messageDigest;
        }

        @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o
        @NonNull
        public oO0O0O0o OooO00o() {
            return this.OooO00o;
        }
    }

    private String OooO0O0(AbstractC7644o0oOoOO o0ooooo) {
        OooO0O0 oooO0O0 = (OooO0O0) C7842oO0O0.OooO00o(this.OooO00o.acquire());
        try {
            o0ooooo.OooO00o(oooO0O0.f20760OooO00o);
            return oO0O0O00.OooO00o(oooO0O0.f20760OooO00o.digest());
        } finally {
            this.OooO00o.release(oooO0O0);
        }
    }

    public String OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        String OooO00o2;
        synchronized (this.f20759OooO00o) {
            OooO00o2 = this.f20759OooO00o.m19519OooO00o(o0ooooo);
        }
        if (OooO00o2 == null) {
            OooO00o2 = OooO0O0(o0ooooo);
        }
        synchronized (this.f20759OooO00o) {
            this.f20759OooO00o.OooO00o(o0ooooo, OooO00o2);
        }
        return OooO00o2;
    }
}
