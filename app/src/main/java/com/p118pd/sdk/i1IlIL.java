package com.p118pd.sdk;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import org.bouncycastle.est.ESTException;

/* renamed from: com.pd.sdk.i1IlIL丨  reason: invalid class name */
public class i1IlIL implements i11ILLIi {
    public final C5865Li OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashMap<LlLI1, C5825L1ILII> f17360OooO00o;

    public i1IlIL(C5865Li r5) throws ESTException {
        LlLI1 llLI1;
        HashMap<LlLI1, C5825L1ILII> hashMap;
        this.OooO00o = r5;
        this.f17360OooO00o = new HashMap<>(r5.size());
        C5825L1ILII[] OooO00o2 = r5.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            C5825L1ILII r1 = OooO00o2[i];
            if (r1.m16420OooO00o()) {
                hashMap = this.f17360OooO00o;
                llLI1 = r1.m16419OooO00o();
            } else {
                hashMap = this.f17360OooO00o;
                llLI1 = r1.OooO00o().m16037OooO00o();
            }
            hashMap.put(llLI1, r1);
        }
    }

    public i1IlIL(byte[] bArr) throws ESTException {
        this(OooO00o(bArr));
    }

    public static C5865Li OooO00o(byte[] bArr) throws ESTException {
        try {
            return C5865Li.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (Exception e) {
            throw new ESTException("malformed data: " + e.getMessage(), e);
        }
    }

    public Collection<LlLI1> OooO00o() {
        return this.f17360OooO00o.keySet();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16865OooO00o() {
        return this.OooO00o.size() == 0;
    }

    public boolean OooO00o(LlLI1 llLI1) {
        return this.f17360OooO00o.containsKey(llLI1);
    }

    public boolean OooO0O0(LlLI1 llLI1) {
        if (this.f17360OooO00o.containsKey(llLI1)) {
            return !this.f17360OooO00o.get(llLI1).m16420OooO00o();
        }
        return false;
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }
}
