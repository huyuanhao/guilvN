package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6892l1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iL1I  reason: case insensitive filesystem */
public class C6150iL1I extends AbstractC6892l1 {
    public C5394IiL1l OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIiillil f17656OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lilLii1 f17657OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ll1iiLI f17658OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9439IL f17659OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97431Llli f17660OooO00o = null;
    public short OooOo0O = -1;

    public C6150iL1I(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        super(inputStream, outputStream, secureRandom);
    }

    public C6150iL1I(SecureRandom secureRandom) {
        super(secureRandom);
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    public iL1liI OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6333illiL m17053OooO00o() {
        return this.f17656OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9462L1Lii m17054OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(LI1lll r3) throws IOException {
        if (r3 != null) {
            AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 4);
            r3.OooO00o(oooO00o);
            oooO00o.OooO00o();
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public void OooO00o(LIiillil lIiillil) throws IOException {
        if (lIiillil == null) {
            throw new IllegalArgumentException("'tlsServer' cannot be null");
        } else if (this.f17656OooO00o == null) {
            this.f17656OooO00o = lIiillil;
            C6107iIiL iiil = new C6107iIiL();
            ((AbstractC6892l1) this).f18995OooO00o = iiil;
            iiil.OooO00o = 0;
            this.OooO00o = new C5394IiL1l(((AbstractC6892l1) this).f19000OooO00o, ((AbstractC6892l1) this).f18995OooO00o);
            ((AbstractC6892l1) this).f18995OooO00o.f17566OooO0OO = AbstractC6892l1.OooO00o(lIiillil.OooO0O0(), this.OooO00o.m21514OooO00o());
            this.f17656OooO00o.OooO00o(this.OooO00o);
            ((AbstractC6892l1) this).f18992OooO00o.OooO00o(this.OooO00o);
            ((AbstractC6892l1) this).f18992OooO00o.OooO00o(false);
            m18057OooO0O0();
        } else {
            throw new IllegalStateException("'accept' can only be called once");
        }
    }

    public void OooO00o(lilLii1 r3) throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 13);
        r3.OooO00o(oooO00o);
        oooO00o.OooO00o();
    }

    public void OooO00o(C9824LiI r3) throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 22);
        r3.OooO00o(oooO00o);
        oooO00o.OooO00o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r3 == 9) goto L_0x0029;
     */
    @Override // com.p118pd.sdk.AbstractC6892l1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(short r3) throws java.io.IOException {
        /*
            r2 = this;
            super.OooO00o(r3)
            r0 = 41
            if (r3 == r0) goto L_0x0008
            return
        L_0x0008:
            com.pd.sdk.iL1liI r3 = r2.OooO00o()
            boolean r3 = com.p118pd.sdk.L1LL1Ii.OooO00o(r3)
            r0 = 10
            if (r3 == 0) goto L_0x0031
            com.pd.sdk.lilLi丨i1 r3 = r2.f17657OooO00o
            if (r3 == 0) goto L_0x0031
            short r3 = r2.f19002OooO00o
            r1 = 8
            if (r3 == r1) goto L_0x0023
            r1 = 9
            if (r3 != r1) goto L_0x0031
            goto L_0x0029
        L_0x0023:
            com.pd.sdk.LIiillil r3 = r2.f17656OooO00o
            r1 = 0
            r3.OooO0O0(r1)
        L_0x0029:
            com.pd.sdk.l丨IIi1I1 r3 = com.p118pd.sdk.C6827lIIi1I1.OooO00o
            r2.OooO0O0(r3)
            r2.f19002OooO00o = r0
            return
        L_0x0031:
            org.bouncycastle.crypto.tls.TlsFatalAlert r3 = new org.bouncycastle.crypto.tls.TlsFatalAlert
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6150iL1I.OooO00o(short):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.p118pd.sdk.AbstractC6892l1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(short r10, java.io.ByteArrayInputStream r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6150iL1I.OooO00o(short, java.io.ByteArrayInputStream):void");
    }

    public void OooO0O0(C6827lIIi1I1 r2) throws IOException {
        if (this.f17657OooO00o == null) {
            throw new IllegalStateException();
        } else if (((AbstractC6892l1) this).f18998OooO00o == null) {
            ((AbstractC6892l1) this).f18998OooO00o = r2;
            if (r2.m17955OooO00o()) {
                this.f17660OooO00o.OooO0O0();
            } else {
                this.OooOo0O = L1LL1Ii.OooO00o(r2, this.f17658OooO00o.OooO00o());
                this.f17660OooO00o.OooO0O0(r2);
            }
            this.f17656OooO00o.OooO00o(r2);
        } else {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    public boolean OooO0O0() {
        short s = this.OooOo0O;
        return s >= 0 && L1LL1Ii.m15930OooO00o(s);
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    public void OooO0OO() {
        super.m18059OooO0OO();
        this.f17660OooO00o = null;
        this.f17658OooO00o = null;
        this.f17657OooO00o = null;
        this.f17659OooO00o = null;
    }

    public void OooO0OO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        C6827lIIi1I1 OooO00o2 = C6827lIIi1I1.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        OooO0O0(OooO00o2);
    }

    public void OooO0OO(byte[] bArr) throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(12, bArr.length);
        oooO00o.write(bArr);
        oooO00o.OooO00o();
    }

    public void OooO0Oo(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bArr;
        if (this.f17657OooO00o != null) {
            iLlLiLll OooO00o2 = iLlLiLll.OooO00o(OooO00o(), byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            try {
                II1LLIl OooO00o3 = OooO00o2.OooO00o();
                if (L1LL1Ii.OooO0OO(OooO00o())) {
                    L1LL1Ii.OooO00o(this.f17657OooO00o.OooO0O0(), OooO00o3);
                    bArr = this.f17659OooO00o.m21479OooO00o(OooO00o3.OooO00o());
                } else {
                    bArr = ((AbstractC6892l1) this).f18995OooO00o.OooO0oO();
                }
                C6213iL11I OooO00o4 = IILLl.OooO00o(((AbstractC6892l1) this).f18998OooO00o.OooO00o(0).m16321OooO00o());
                L1Illl1i OooO00o5 = L1LL1Ii.OooO00o(this.OooOo0O);
                OooO00o5.OooO00o(OooO00o());
                if (!OooO00o5.OooO00o(OooO00o3, OooO00o2.m17161OooO00o(), OooO00o4, bArr)) {
                    throw new TlsFatalAlert(51);
                }
            } catch (TlsFatalAlert e) {
                throw e;
            } catch (Exception e2) {
                throw new TlsFatalAlert(51, e2);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void OooO0o(ByteArrayInputStream byteArrayInputStream) throws IOException {
        this.f17660OooO00o.OooO0O0(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        if (L1LL1Ii.OooO00o(OooO00o())) {
            AbstractC6892l1.OooO00o(OooO00o(), this.f17660OooO00o);
        }
        this.f17659OooO00o = ((AbstractC6892l1) this).f18992OooO00o.OooO0O0();
        ((AbstractC6892l1) this).f18995OooO00o.f17567OooO0Oo = AbstractC6892l1.OooO00o(OooO00o(), this.f17659OooO00o, (byte[]) null);
        if (!L1LL1Ii.OooO00o(OooO00o())) {
            AbstractC6892l1.OooO00o(OooO00o(), this.f17660OooO00o);
        }
        ((AbstractC6892l1) this).f18992OooO00o.OooO00o(m17053OooO00o().m17395OooO00o(), m17053OooO00o().OooO00o());
    }

    public void OooO0o0(ByteArrayInputStream byteArrayInputStream) throws IOException {
        i1iiIl OooO00o2 = L1LL1Ii.m15917OooO00o((InputStream) byteArrayInputStream);
        ((AbstractC6892l1) this).f18992OooO00o.OooO0O0(OooO00o2);
        if (!OooO00o2.m16892OooO00o()) {
            byte[] OooO0O0 = L1LL1Ii.OooO0O0(32, byteArrayInputStream);
            if (L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream).length <= 32) {
                int OooO00o3 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
                if (OooO00o3 < 2 || (OooO00o3 & 1) != 0) {
                    throw new TlsFatalAlert(50);
                }
                ((AbstractC6892l1) this).f19005OooO00o = L1LL1Ii.m15934OooO00o(OooO00o3 / 2, (InputStream) byteArrayInputStream);
                short OooO00o4 = L1LL1Ii.m15923OooO00o((InputStream) byteArrayInputStream);
                if (OooO00o4 >= 1) {
                    ((AbstractC6892l1) this).f19006OooO00o = L1LL1Ii.m15935OooO00o((int) OooO00o4, (InputStream) byteArrayInputStream);
                    Hashtable OooO00o5 = AbstractC6892l1.OooO00o(byteArrayInputStream);
                    ((AbstractC6892l1) this).f19001OooO00o = OooO00o5;
                    ((AbstractC6892l1) this).f18995OooO00o.f17565OooO0OO = C6115iIiL.m17008OooO0O0(OooO00o5);
                    m17054OooO00o().OooO00o(OooO00o2);
                    this.f17656OooO00o.OooO0O0(OooO00o2);
                    this.f17656OooO00o.OooO00o(C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, (int) Lillilli.o00Oo0O0));
                    ((AbstractC6892l1) this).f18995OooO00o.f17564OooO0O0 = OooO0O0;
                    this.f17656OooO00o.OooO00o(((AbstractC6892l1) this).f19005OooO00o);
                    this.f17656OooO00o.OooO00o(((AbstractC6892l1) this).f19006OooO00o);
                    if (C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, 255)) {
                        this.f19015OooO0oO = true;
                    }
                    byte[] OooO00o6 = L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19001OooO00o, AbstractC6892l1.OooO00o);
                    if (OooO00o6 != null) {
                        this.f19015OooO0oO = true;
                        if (!C9586iIILl.OooO0O0(OooO00o6, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o))) {
                            throw new TlsFatalAlert(40);
                        }
                    }
                    this.f17656OooO00o.OooO0O0(this.f19015OooO0oO);
                    Hashtable hashtable = ((AbstractC6892l1) this).f19001OooO00o;
                    if (hashtable != null) {
                        C6115iIiL.OooO00o(hashtable);
                        this.f17656OooO00o.OooO0O0(((AbstractC6892l1) this).f19001OooO00o);
                        return;
                    }
                    return;
                }
                throw new TlsFatalAlert(47);
            }
            throw new TlsFatalAlert(47);
        }
        throw new TlsFatalAlert(47);
    }

    public void OooOOo() throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 2);
        i1iiIl OooO0O0 = this.f17656OooO00o.OooO0O0();
        if (OooO0O0.OooO0O0(OooO00o().OooO00o())) {
            ((AbstractC6892l1) this).f18992OooO00o.OooO00o(OooO0O0);
            ((AbstractC6892l1) this).f18992OooO00o.OooO0O0(OooO0O0);
            boolean z = true;
            ((AbstractC6892l1) this).f18992OooO00o.OooO00o(true);
            m17054OooO00o().OooO0O0(OooO0O0);
            L1LL1Ii.OooO00o(OooO0O0, oooO00o);
            oooO00o.write(((AbstractC6892l1) this).f18995OooO00o.f17566OooO0OO);
            L1LL1Ii.OooO0OO(L1LL1Ii.f16174OooO00o, oooO00o);
            int OooO00o2 = this.f17656OooO00o.OooO00o();
            if (!C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, OooO00o2) || OooO00o2 == 0 || Lillilli.OooO00o(OooO00o2) || !L1LL1Ii.OooO00o(OooO00o2, OooO00o().OooO0O0())) {
                throw new TlsFatalAlert(80);
            }
            ((AbstractC6892l1) this).f18995OooO00o.OooO0O0 = OooO00o2;
            short OooO00o3 = this.f17656OooO00o.m16098OooO00o();
            if (C9586iIILl.m21629OooO00o(((AbstractC6892l1) this).f19006OooO00o, OooO00o3)) {
                ((AbstractC6892l1) this).f18995OooO00o.f17559OooO00o = OooO00o3;
                L1LL1Ii.OooO00o(OooO00o2, (OutputStream) oooO00o);
                L1LL1Ii.OooO00o(OooO00o3, (OutputStream) oooO00o);
                Hashtable OooO00o4 = this.f17656OooO00o.m16096OooO00o();
                ((AbstractC6892l1) this).f19008OooO0O0 = OooO00o4;
                if (this.f19015OooO0oO) {
                    if (L1LL1Ii.OooO00o(OooO00o4, AbstractC6892l1.OooO00o) == null) {
                        Hashtable OooO00o5 = C6115iIiL.m17002OooO00o(((AbstractC6892l1) this).f19008OooO0O0);
                        ((AbstractC6892l1) this).f19008OooO0O0 = OooO00o5;
                        OooO00o5.put(AbstractC6892l1.OooO00o, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o));
                    }
                }
                if (((AbstractC6892l1) this).f18995OooO00o.f17565OooO0OO) {
                    Hashtable OooO00o6 = C6115iIiL.m17002OooO00o(((AbstractC6892l1) this).f19008OooO0O0);
                    ((AbstractC6892l1) this).f19008OooO0O0 = OooO00o6;
                    C6115iIiL.OooO0O0(OooO00o6);
                }
                Hashtable hashtable = ((AbstractC6892l1) this).f19008OooO0O0;
                if (hashtable != null) {
                    ((AbstractC6892l1) this).f18995OooO00o.f17563OooO0O0 = C6115iIiL.m17006OooO00o(hashtable);
                    ((AbstractC6892l1) this).f18995OooO00o.f17562OooO0O0 = OooO00o(((AbstractC6892l1) this).f19001OooO00o, ((AbstractC6892l1) this).f19008OooO0O0, (short) 80);
                    ((AbstractC6892l1) this).f18995OooO00o.f17560OooO00o = C6115iIiL.m17009OooO0OO(((AbstractC6892l1) this).f19008OooO0O0);
                    this.f19016OooO0oo = !this.f19014OooO0o0 && L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19008OooO0O0, C6115iIiL.OooO0oO, 80);
                    if (this.f19014OooO0o0 || !L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19008OooO0O0, AbstractC6892l1.OooO0O0, (short) 80)) {
                        z = false;
                    }
                    this.f18988OooO = z;
                    AbstractC6892l1.OooO00o(oooO00o, ((AbstractC6892l1) this).f19008OooO0O0);
                }
                ((AbstractC6892l1) this).f18995OooO00o.OooO0OO = AbstractC6892l1.OooO00o(OooO00o(), ((AbstractC6892l1) this).f18995OooO00o.OooO00o());
                ((AbstractC6892l1) this).f18995OooO00o.OooO0Oo = 12;
                m18051OooO00o();
                oooO00o.OooO00o();
                return;
            }
            throw new TlsFatalAlert(80);
        }
        throw new TlsFatalAlert(80);
    }

    public void OooOOo0() throws IOException {
        byte[] bArr = new byte[4];
        L1LL1Ii.OooO00o((short) 14, bArr, 0);
        L1LL1Ii.OooO0O0(0, bArr, 1);
        m18060OooO0OO(bArr, 0, 4);
    }
}
