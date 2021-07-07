package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.Li1II */
public abstract class Li1II extends AbstractC9646iI implements AbstractC5653LL1lI {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1liII f16549OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1iL11 f16550OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f16551OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f16552OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16553OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f16554OooO00o;
    public short[] OooO0O0;

    public Li1II() {
        this(new C6867lill1i());
    }

    public Li1II(II1liII r1) {
        this.f16549OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    public i1iiIl OooO00o() {
        return i1iiIl.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6830lILl1 m16280OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11iil m16281OooO00o() throws IOException {
        return this.f16549OooO00o.OooO00o(this.f16550OooO00o, L1LL1Ii.OooO0O0(this.OooO00o), L1LL1Ii.OooO0Oo(this.OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9429Il m16282OooO00o() throws IOException {
        if (this.f16552OooO00o == 0) {
            return new C5246IL11i();
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(int i) {
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(LI1lll r1) throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(i1iiIl i1iiil) throws IOException {
        if (!OooO0Oo().OooO0O0(i1iiil)) {
            throw new TlsFatalAlert(70);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(l1iL11 l1il11) {
        this.f16550OooO00o = l1il11;
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(Hashtable hashtable) throws IOException {
        if (hashtable != null) {
            OooO00o(hashtable, L1LL1Ii.OooO00o);
            OooO00o(hashtable, C5234IIllL.OooO00o);
            if (C5234IIllL.m15420OooO00o(this.OooO00o)) {
                this.OooO0O0 = C5234IIllL.m15422OooO00o(hashtable);
            } else {
                OooO00o(hashtable, C5234IIllL.OooO0O0);
            }
            OooO00o(hashtable, C6115iIiL.OooO0o0);
        }
    }

    public void OooO00o(Hashtable hashtable, Integer num) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, num);
        if (OooO00o2 != null && !OooO00o(num, OooO00o2)) {
            throw new TlsFatalAlert(47);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(Vector vector) throws IOException {
        if (vector != null) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(short s) {
        this.f16552OooO00o = s;
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(byte[] bArr) {
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16283OooO00o() {
        return false;
    }

    public boolean OooO00o(Integer num, byte[] bArr) throws IOException {
        int intValue = num.intValue();
        if (intValue == 10) {
            C5234IIllL.OooO00o(bArr);
            return true;
        } else if (intValue != 11) {
            return false;
        } else {
            C5234IIllL.m15423OooO00o(bArr);
            return true;
        }
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m16284OooO00o() {
        return new short[]{0};
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL
    public Hashtable OooO0O0() throws IOException {
        Hashtable hashtable = null;
        if (L1LL1Ii.OooO00o(this.f16550OooO00o.OooO00o())) {
            this.f16551OooO00o = L1LL1Ii.OooO0o0();
            hashtable = C6115iIiL.m17002OooO00o((Hashtable) null);
            L1LL1Ii.OooO00o(hashtable, this.f16551OooO00o);
        }
        if (!C5234IIllL.OooO00o(m16184OooO00o())) {
            return hashtable;
        }
        this.f16553OooO00o = new int[]{23, 24};
        this.f16554OooO00o = new short[]{0, 1, 2};
        Hashtable OooO00o2 = C6115iIiL.m17002OooO00o(hashtable);
        C5234IIllL.OooO00o(OooO00o2, this.f16553OooO00o);
        C5234IIllL.OooO00o(OooO00o2, this.f16554OooO00o);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Vector m16285OooO0O0() throws IOException {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5653LL1lI
    public i1iiIl OooO0OO() {
        return OooO00o();
    }

    public i1iiIl OooO0Oo() {
        return i1iiIl.OooO0O0;
    }
}
