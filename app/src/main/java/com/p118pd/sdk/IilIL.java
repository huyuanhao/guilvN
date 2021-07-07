package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import org.bouncycastle.tsp.TSPException;

/* renamed from: com.pd.sdk.IilIL */
public class IilIL {
    public C6188iLl1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f15739OooO00o;

    public IilIL(C6188iLl1 ill1) throws TSPException, IOException {
        this.OooO00o = ill1;
        try {
            this.f15739OooO00o = ill1.m17155OooO00o().OooO00o();
        } catch (ParseException unused) {
            throw new TSPException("unable to parse genTime field");
        }
    }

    public ILI OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5465Ill m15614OooO00o() {
        if (m15619OooO00o() != null) {
            return new C5465Ill(m15619OooO00o());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15615OooO00o() {
        return this.OooO00o.m17152OooO00o().OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6188iLl1 m15616OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m15617OooO00o() {
        return this.OooO00o.m17151OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15618OooO00o() {
        return this.OooO00o.m17152OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9521Ll m15619OooO00o() {
        return this.OooO00o.m17154OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15620OooO00o() {
        if (this.OooO00o.m17153OooO00o() != null) {
            return this.OooO00o.m17153OooO00o().m17647OooO0O0();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m15621OooO00o() {
        return this.f15739OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15622OooO00o() {
        return this.OooO00o.m17149OooO00o().m15792OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15623OooO00o() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public LlLI1 OooO0O0() {
        return this.OooO00o.m17150OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6188iLl1 m15624OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m15625OooO0O0() {
        return this.OooO00o.m17156OooO0O0().m17647OooO0O0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15626OooO0O0() {
        return this.OooO00o.m17152OooO00o().m17633OooO00o();
    }
}
