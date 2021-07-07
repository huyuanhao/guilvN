package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.丨liILI  reason: invalid class name and case insensitive filesystem */
public class C9703liILI implements AlgorithmParameterSpec {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f23326OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f23327OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AlgorithmParameterSpec f23328OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23329OooO00o;

    /* renamed from: com.pd.sdk.丨liILI$OooO0O0 */
    public static final class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f23330OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f23331OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AlgorithmParameterSpec f23332OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f23333OooO00o;

        public OooO0O0(String str, int i) {
            this(str, i, null);
        }

        public OooO0O0(String str, int i, byte[] bArr) {
            this.f23331OooO00o = str;
            this.OooO00o = i;
            this.f23330OooO00o = new C6456l1ilL(AbstractC5420Il1iIL.o00OoOOO, new C6456l1ilL(AbstractC5905LllI.OooO0OO));
            this.f23333OooO00o = bArr == null ? new byte[0] : C9586iIILl.m21630OooO00o(bArr);
        }

        public OooO0O0 OooO00o(C6456l1ilL r1) {
            this.f23330OooO00o = r1;
            return this;
        }

        public OooO0O0 OooO00o(AlgorithmParameterSpec algorithmParameterSpec) {
            this.f23332OooO00o = algorithmParameterSpec;
            return this;
        }

        public C9703liILI OooO00o() {
            return new C9703liILI(this.f23331OooO00o, this.OooO00o, this.f23332OooO00o, this.f23330OooO00o, this.f23333OooO00o);
        }
    }

    public C9703liILI(String str, int i, AlgorithmParameterSpec algorithmParameterSpec, C6456l1ilL r4, byte[] bArr) {
        this.f23327OooO00o = str;
        this.OooO00o = i;
        this.f23328OooO00o = algorithmParameterSpec;
        this.f23326OooO00o = r4;
        this.f23329OooO00o = bArr;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21735OooO00o() {
        return this.f23326OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21736OooO00o() {
        return this.f23327OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameterSpec m21737OooO00o() {
        return this.f23328OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21738OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23329OooO00o);
    }
}
