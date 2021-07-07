package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;

/* renamed from: com.pd.sdk.丨iI丨iI1  reason: invalid class name and case insensitive filesystem */
public class C9599iIiI1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6380iLi f23163OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f23164OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23165OooO00o;
    public int OooO0O0;

    /* renamed from: com.pd.sdk.丨iI丨iI1$OooO00o */
    public static class OooO00o implements AbstractC5517ILI {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final li1l11I1 f23166OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f23167OooO00o;
        public final int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final byte[] f23168OooO0O0;

        public OooO00o(li1l11I1 li1l11i1, int i, byte[] bArr, byte[] bArr2, int i2) {
            this.f23166OooO00o = li1l11i1;
            this.OooO00o = i;
            this.f23167OooO00o = bArr;
            this.f23168OooO0O0 = bArr2;
            this.OooO0O0 = i2;
        }

        @Override // com.p118pd.sdk.AbstractC5517ILI
        public AbstractC6863liiI OooO00o(AbstractC5552Iil r9) {
            return new C6312ilL(this.f23166OooO00o, this.OooO00o, this.OooO0O0, r9, this.f23168OooO0O0, this.f23167OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨iI1$OooO0O0 */
    public static class OooO0O0 implements AbstractC5517ILI {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6769llL1L f23169OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f23170OooO00o;
        public final byte[] OooO0O0;

        public OooO0O0(AbstractC6769llL1L lll1l, byte[] bArr, byte[] bArr2, int i) {
            this.f23169OooO00o = lll1l;
            this.f23170OooO00o = bArr;
            this.OooO0O0 = bArr2;
            this.OooO00o = i;
        }

        @Override // com.p118pd.sdk.AbstractC5517ILI
        public AbstractC6863liiI OooO00o(AbstractC5552Iil r8) {
            return new C6314ilLILI(this.f23169OooO00o, this.OooO00o, r8, this.OooO0O0, this.f23170OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨iI1$OooO0OO */
    public static class OooO0OO implements AbstractC5517ILI {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6436l11LI f23171OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f23172OooO00o;
        public final byte[] OooO0O0;

        public OooO0OO(AbstractC6436l11LI r1, byte[] bArr, byte[] bArr2, int i) {
            this.f23171OooO00o = r1;
            this.f23172OooO00o = bArr;
            this.OooO0O0 = bArr2;
            this.OooO00o = i;
        }

        @Override // com.p118pd.sdk.AbstractC5517ILI
        public AbstractC6863liiI OooO00o(AbstractC5552Iil r8) {
            return new C6596lLiLi(this.f23171OooO00o, this.OooO00o, r8, this.OooO0O0, this.f23172OooO00o);
        }
    }

    public C9599iIiI1() {
        this(IIllii.OooO00o(), false);
    }

    public C9599iIiI1(AbstractC6380iLi r2) {
        this.OooO00o = 256;
        this.OooO0O0 = 256;
        this.f23164OooO00o = null;
        this.f23163OooO00o = r2;
    }

    public C9599iIiI1(SecureRandom secureRandom, boolean z) {
        this.OooO00o = 256;
        this.OooO0O0 = 256;
        this.f23164OooO00o = secureRandom;
        this.f23163OooO00o = new lLILil(secureRandom, z);
    }

    public C9599iIiI1 OooO00o(int i) {
        this.OooO0O0 = i;
        return this;
    }

    public C9599iIiI1 OooO00o(byte[] bArr) {
        this.f23165OooO00o = bArr;
        return this;
    }

    public SP800SecureRandom OooO00o(AbstractC6436l11LI r7, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.f23164OooO00o, this.f23163OooO00o.OooO00o(this.OooO0O0), new OooO0OO(r7, bArr, this.f23165OooO00o, this.OooO00o), z);
    }

    public SP800SecureRandom OooO00o(li1l11I1 li1l11i1, int i, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.f23164OooO00o, this.f23163OooO00o.OooO00o(this.OooO0O0), new OooO00o(li1l11i1, i, bArr, this.f23165OooO00o, this.OooO00o), z);
    }

    public SP800SecureRandom OooO00o(AbstractC6769llL1L lll1l, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.f23164OooO00o, this.f23163OooO00o.OooO00o(this.OooO0O0), new OooO0O0(lll1l, bArr, this.f23165OooO00o, this.OooO00o), z);
    }

    public C9599iIiI1 OooO0O0(int i) {
        this.OooO00o = i;
        return this;
    }
}
