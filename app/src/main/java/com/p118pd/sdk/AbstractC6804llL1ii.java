package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.ll丨L1ii  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6804llL1ii extends AbstractC6122iIlLiL implements AbstractC6541lIlii {
    public byte[] OooO00o;

    public AbstractC6804llL1ii(byte[] bArr) {
        if (bArr != null) {
            this.OooO00o = bArr;
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    public static AbstractC6804llL1ii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof AbstractC6804llL1ii)) ? OooO00o((Object) OooO0o) : C5837L1l.OooO00o(I11li1.OooO00o((Object) OooO0o));
    }

    public static AbstractC6804llL1ii OooO00o(Object obj) {
        if (obj == null || (obj instanceof AbstractC6804llL1ii)) {
            return (AbstractC6804llL1ii) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        } else {
            if (obj instanceof AbstractC6854lLi1LL) {
                AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
                if (OooO0O0 instanceof AbstractC6804llL1ii) {
                    return (AbstractC6804llL1ii) OooO0O0;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() {
        return m17017OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6541lIlii m17936OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m17937OooO00o() {
        return new ByteArrayInputStream(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof AbstractC6804llL1ii)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((AbstractC6804llL1ii) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17938OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0Oo() {
        return new C6487lIIiIlL(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        return new C6487lIIiIlL(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(m17938OooO00o());
    }

    public String toString() {
        return "#" + Strings.OooO00o(C6472l1l1l.OooO0O0(this.OooO00o));
    }
}
