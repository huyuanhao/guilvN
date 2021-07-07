package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.bouncycastle.pkcs.PKCSException;
import org.bouncycastle.pkcs.PKCSIOException;

/* renamed from: com.pd.sdk.l1ili丨丨1  reason: invalid class name */
public class l1ili1 {
    public static LIIi[] OooO00o = new LIIi[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9764Il1 f18298OooO00o;

    public l1ili1(C9764Il1 r1) {
        this.f18298OooO00o = r1;
    }

    public l1ili1(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C9764Il1 OooO00o(byte[] bArr) throws IOException {
        try {
            return C9764Il1.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new PKCSIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    public l1LILI1 OooO00o() {
        return l1LILI1.OooO00o(this.f18298OooO00o.OooO00o().m15896OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17582OooO00o() {
        return this.f18298OooO00o.m21899OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m17583OooO00o() {
        return this.f18298OooO00o.OooO00o().m15898OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9764Il1 m17584OooO00o() {
        return this.f18298OooO00o;
    }

    public boolean OooO00o(AbstractC9449II r4) throws PKCSException {
        L1IIlli OooO00o2 = this.f18298OooO00o.OooO00o();
        try {
            lliLLL OooO00o3 = r4.OooO00o(this.f18298OooO00o.m21899OooO00o());
            OutputStream OooO00o4 = OooO00o3.m17912OooO00o();
            OooO00o4.write(OooO00o2.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o4.close();
            return OooO00o3.verify(OooO0O0());
        } catch (Exception e) {
            throw new PKCSException("unable to process signature: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17585OooO00o() throws IOException {
        return this.f18298OooO00o.getEncoded();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIIi[] m17586OooO00o() {
        I11L OooO00o2 = this.f18298OooO00o.OooO00o().OooO00o();
        if (OooO00o2 == null) {
            return OooO00o;
        }
        LIIi[] r1 = new LIIi[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = LIIi.OooO00o(OooO00o2.OooO00o(i));
        }
        return r1;
    }

    public LIIi[] OooO00o(LlLI1 llLI1) {
        I11L OooO00o2 = this.f18298OooO00o.OooO00o().OooO00o();
        if (OooO00o2 == null) {
            return OooO00o;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.size(); i++) {
            LIIi OooO00o3 = LIIi.OooO00o(OooO00o2.OooO00o(i));
            if (OooO00o3.m16037OooO00o().equals(llLI1)) {
                arrayList.add(OooO00o3);
            }
        }
        return arrayList.size() == 0 ? OooO00o : (LIIi[]) arrayList.toArray(new LIIi[arrayList.size()]);
    }

    public byte[] OooO0O0() {
        return this.f18298OooO00o.m21898OooO00o().OooO0O0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1ili1)) {
            return false;
        }
        return m17584OooO00o().equals(((l1ili1) obj).m17584OooO00o());
    }

    public int hashCode() {
        return m17584OooO00o().hashCode();
    }
}
