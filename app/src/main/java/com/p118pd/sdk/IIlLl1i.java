package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.I丨IlLl1i  reason: invalid class name */
public abstract class IIlLl1i extends AbstractC9646iI implements LIiillil {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1liII f15990OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1iiIl f15991OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ilLII1L f15992OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f15993OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f15994OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f15995OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15996OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f15997OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f15998OooO00o;
    public i1iiIl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Hashtable f15999OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short f16000OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16001OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f16002OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short[] f16003OooO0O0;
    public boolean OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public short[] f16004OooO0OO;

    public IIlLl1i() {
        this(new C6867lill1i());
    }

    public IIlLl1i(II1liII r1) {
        this.f15990OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    public int OooO00o() throws IOException {
        Vector OooO00o2 = L1LL1Ii.OooO00o(this.f15994OooO00o);
        boolean OooO00o3 = OooO00o(this.f16002OooO0O0, this.f16003OooO0O0);
        int[] OooO00o4 = m15783OooO00o();
        for (int i : OooO00o4) {
            if (C9586iIILl.m21628OooO00o(this.f15997OooO00o, i) && ((OooO00o3 || !C5234IIllL.m15420OooO00o(i)) && L1LL1Ii.OooO00o(i, this.OooO0O0) && L1LL1Ii.OooO00o(i, OooO00o2))) {
                this.OooO00o = i;
                return i;
            }
        }
        throw new TlsFatalAlert(40);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LI1lll m15775OooO00o() throws IOException {
        return new LI1lll(0, L1LL1Ii.f16174OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public lilLii1 m15776OooO00o() throws IOException {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11iil m15777OooO00o() throws IOException {
        return this.f15990OooO00o.OooO00o(this.f15992OooO00o, L1LL1Ii.OooO0O0(this.OooO00o), L1LL1Ii.OooO0Oo(this.OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9429Il m15778OooO00o() throws IOException {
        if (this.f16000OooO0O0 == 0) {
            return new C5246IL11i();
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9824LiI m15779OooO00o() throws IOException {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m15780OooO00o() throws IOException {
        if (this.f15996OooO00o && m15785OooO0OO() && L1LL1Ii.m15940OooO0O0(this.OooO00o)) {
            C6115iIiL.m17005OooO00o(OooO0OO());
        }
        short s = this.f15995OooO00o;
        if (s >= 0 && ii1l1L.OooO00o(s)) {
            C6115iIiL.OooO00o(OooO0OO(), this.f15995OooO00o);
        }
        if (this.f16001OooO0O0 && m15786OooO0Oo()) {
            C6115iIiL.OooO0OO(OooO0OO());
        }
        if (this.f16003OooO0O0 != null && C5234IIllL.m15420OooO00o(this.OooO00o)) {
            this.f16004OooO0OO = new short[]{0, 1, 2};
            C5234IIllL.OooO00o(OooO0OO(), this.f16004OooO0OO);
        }
        return this.f15999OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Vector m15781OooO00o() throws IOException {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m15782OooO00o() throws IOException {
        short[] OooO00o2 = m15784OooO00o();
        for (int i = 0; i < OooO00o2.length; i++) {
            if (C9586iIILl.m21629OooO00o(this.f15998OooO00o, OooO00o2[i])) {
                short s = OooO00o2[i];
                this.f16000OooO0O0 = s;
                return s;
            }
        }
        throw new TlsFatalAlert(40);
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO00o(ilLII1L illii1l) {
        this.f15992OooO00o = illii1l;
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO00o(C6827lIIi1I1 r2) throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO00o(boolean z) throws IOException {
        if (z && OooO0Oo().OooO0OO(this.f15991OooO00o)) {
            throw new TlsFatalAlert(86);
        }
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO00o(int[] iArr) throws IOException {
        this.f15997OooO00o = iArr;
        this.OooO0OO = C5234IIllL.OooO00o(iArr);
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO00o(short[] sArr) throws IOException {
        this.f15998OooO00o = sArr;
    }

    public boolean OooO00o(int[] iArr, short[] sArr) {
        if (iArr == null) {
            return C5234IIllL.OooO00o();
        }
        for (int i : iArr) {
            if (C6038i1ii1il.OooO00o(i) && (!C6038i1ii1il.OooO0O0(i) || C5234IIllL.OooO0O0(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int[] m15783OooO00o();

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m15784OooO00o() {
        return new short[]{0};
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL
    public i1iiIl OooO0O0() throws IOException {
        if (OooO0o0().OooO0O0(this.f15991OooO00o)) {
            i1iiIl OooO0Oo = OooO0Oo();
            if (this.f15991OooO00o.OooO0O0(OooO0Oo)) {
                i1iiIl i1iiil = this.f15991OooO00o;
                this.OooO0O0 = i1iiil;
                return i1iiil;
            } else if (this.f15991OooO00o.OooO0OO(OooO0Oo)) {
                this.OooO0O0 = OooO0Oo;
                return OooO0Oo;
            }
        }
        throw new TlsFatalAlert(70);
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO0O0(i1iiIl i1iiil) throws IOException {
        this.f15991OooO00o = i1iiil;
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO0O0(Hashtable hashtable) throws IOException {
        this.f15993OooO00o = hashtable;
        if (hashtable != null) {
            this.f15996OooO00o = C6115iIiL.m17006OooO00o(hashtable);
            short OooO00o2 = C6115iIiL.m17003OooO00o(hashtable);
            this.f15995OooO00o = OooO00o2;
            if (OooO00o2 < 0 || ii1l1L.OooO00o(OooO00o2)) {
                this.f16001OooO0O0 = C6115iIiL.m17009OooO0OO(hashtable);
                Vector OooO00o3 = L1LL1Ii.OooO00o(hashtable);
                this.f15994OooO00o = OooO00o3;
                if (OooO00o3 == null || L1LL1Ii.OooO00o(this.f15991OooO00o)) {
                    this.f16002OooO0O0 = C5234IIllL.OooO00o(hashtable);
                    this.f16003OooO0O0 = C5234IIllL.m15422OooO00o(hashtable);
                    return;
                }
                throw new TlsFatalAlert(47);
            }
            throw new TlsFatalAlert(47);
        }
    }

    @Override // com.p118pd.sdk.LIiillil
    public void OooO0O0(Vector vector) throws IOException {
        if (vector != null) {
            throw new TlsFatalAlert(10);
        }
    }

    public Hashtable OooO0OO() {
        Hashtable OooO00o2 = C6115iIiL.m17002OooO00o(this.f15999OooO0O0);
        this.f15999OooO0O0 = OooO00o2;
        return OooO00o2;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15785OooO0OO() {
        return true;
    }

    public i1iiIl OooO0Oo() {
        return i1iiIl.OooO0OO;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m15786OooO0Oo() {
        return false;
    }

    public i1iiIl OooO0o0() {
        return i1iiIl.OooO0O0;
    }
}
