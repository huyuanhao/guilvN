package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.iLiliI丨  reason: invalid class name and case insensitive filesystem */
public class C6183iLiliI {
    public Ii11i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17757OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f17758OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9685lL f17759OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17760OooO00o;

    public C6183iLiliI(AbstractC9685lL r2) throws IOException {
        this.f17759OooO00o = r2;
        C6513lIiI OooO00o2 = C6513lIiI.OooO00o(r2.OooO00o());
        this.f17757OooO00o = OooO00o2;
        if (OooO00o2.m17647OooO0O0().intValue() != 0) {
            throw new ASN1ParsingException("AuthEnvelopedData version number must be 0");
        }
    }

    public Ii11i OooO00o() throws IOException {
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17758OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f17758OooO00o = null;
        Ii11i ii11i = new Ii11i((AbstractC9685lL) r0);
        this.OooO00o = ii11i;
        return ii11i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17141OooO00o() {
        return this.f17757OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6796llliI m17142OooO00o() throws IOException {
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17758OooO00o;
        if (r0 instanceof AbstractC6532lIII) {
            this.f17758OooO00o = null;
            return (AbstractC6796llliI) ((AbstractC6532lIII) r0).OooO00o(17, false);
        } else if (this.OooO00o.OooO00o().equals(AbstractC6252iiLl.OooO00o)) {
            return null;
        } else {
            throw new ASN1ParsingException("authAttrs must be present with non-data content");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17143OooO00o() throws IOException {
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17758OooO00o;
        this.f17758OooO00o = null;
        return AbstractC6804llL1ii.OooO00o((Object) r0.OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m17144OooO00o() throws IOException {
        this.f17760OooO00o = true;
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17758OooO00o;
        if (!(r0 instanceof AbstractC6532lIII) || ((AbstractC6532lIII) r0).OooO00o() != 0) {
            return null;
        }
        this.f17758OooO00o = null;
        return C1ILLL1.OooO00o(((AbstractC9685lL) ((AbstractC6532lIII) this.f17758OooO00o).OooO00o(16, false)).OooO0O0());
    }

    public AbstractC6796llliI OooO0O0() throws IOException {
        if (!this.f17760OooO00o) {
            m17144OooO00o();
        }
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6796llliI lllii = (AbstractC6796llliI) this.f17758OooO00o;
        this.f17758OooO00o = null;
        return lllii;
    }

    public AbstractC6796llliI OooO0OO() throws IOException {
        if (this.f17758OooO00o == null) {
            this.f17758OooO00o = this.f17759OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17758OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f17758OooO00o = null;
        return (AbstractC6796llliI) ((AbstractC6532lIII) r0).OooO00o(17, false);
    }
}
