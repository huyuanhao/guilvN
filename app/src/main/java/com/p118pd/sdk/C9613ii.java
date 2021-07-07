package com.p118pd.sdk;

import java.io.OutputStream;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.丨ii  reason: invalid class name and case insensitive filesystem */
public class C9613ii {
    public static final C6456l1ilL OooO00o = new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1II f23195OooO00o;

    public C9613ii(l1LILI1 r2) {
        this.f23195OooO00o = new C1II(r2);
    }

    public C9613ii(C6888ll r3, I111LIL r4) throws OCSPException {
        try {
            if (r4.OooO00o().equals(OooO00o)) {
                OutputStream OooO00o2 = r4.m21370OooO00o();
                OooO00o2.write(r3.OooO00o().m15475OooO00o());
                OooO00o2.close();
                this.f23195OooO00o = new C1II(new C6487lIIiIlL(r4.m21371OooO00o()));
                return;
            }
            throw new IllegalArgumentException("only SHA-1 can be used with RespID - found: " + r4.OooO00o().OooO00o());
        } catch (Exception e) {
            throw new OCSPException("problem creating ID: " + e, e);
        }
    }

    public C9613ii(C1II r1) {
        this.f23195OooO00o = r1;
    }

    public C1II OooO00o() {
        return this.f23195OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9613ii)) {
            return false;
        }
        return this.f23195OooO00o.equals(((C9613ii) obj).f23195OooO00o);
    }

    public int hashCode() {
        return this.f23195OooO00o.hashCode();
    }
}
