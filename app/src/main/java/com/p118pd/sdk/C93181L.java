package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.pkcs.PKCSException;
import org.bouncycastle.pkcs.PKCSIOException;

/* renamed from: com.pd.sdk.丨1丨L  reason: invalid class name and case insensitive filesystem */
public class C93181L {
    public C1696ll OooO00o;

    public C93181L(C1696ll llVar) {
        this.OooO00o = llVar;
    }

    public C93181L(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C1696ll OooO00o(byte[] bArr) throws IOException {
        try {
            return C1696ll.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new PKCSIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    public C6456l1ilL OooO00o() {
        C9713llii OooO00o2 = this.OooO00o.m17822OooO00o();
        if (OooO00o2 != null) {
            return OooO00o2.OooO00o().OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1696ll m21345OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21346OooO00o() {
        return this.OooO00o.m17822OooO00o() != null;
    }

    public boolean OooO00o(LILi lILi, char[] cArr) throws PKCSException {
        if (m21346OooO00o()) {
            C9713llii OooO00o2 = this.OooO00o.m17822OooO00o();
            try {
                return C9586iIILl.OooO0O0(new C9877lI1L(lILi.OooO00o(new C6456l1ilL(OooO00o2.OooO00o().OooO00o().OooO00o(), new C6263iiiL(OooO00o2.m21751OooO00o(), OooO00o2.m21750OooO00o().intValue())))).OooO00o(cArr, AbstractC6804llL1ii.OooO00o(this.OooO00o.OooO00o().m18069OooO0O0()).m17938OooO00o()).getEncoded(), this.OooO00o.m17822OooO00o().getEncoded());
            } catch (IOException e) {
                throw new PKCSException("unable to process AuthSafe: " + e.getMessage());
            }
        } else {
            throw new IllegalStateException("no MAC present on PFX");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21347OooO00o() throws IOException {
        return m21345OooO00o().getEncoded();
    }

    public byte[] OooO00o(String str) throws IOException {
        return m21345OooO00o().OooO00o(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6903lil[] m21348OooO00o() {
        I11li1 OooO00o2 = I11li1.OooO00o((Object) AbstractC6804llL1ii.OooO00o(this.OooO00o.OooO00o().m18069OooO0O0()).m17938OooO00o());
        C6903lil[] r1 = new C6903lil[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = C6903lil.OooO00o(OooO00o2.OooO00o(i));
        }
        return r1;
    }
}
