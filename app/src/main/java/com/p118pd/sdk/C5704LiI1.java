package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.CertIOException;

/* renamed from: com.pd.sdk.LiI1  reason: case insensitive filesystem */
public class C5704LiI1 {
    public final C6777llL1 OooO00o;

    public C5704LiI1(C6777llL1 r1) {
        this.OooO00o = r1;
    }

    public C5704LiI1(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C6777llL1 OooO00o(byte[] bArr) throws IOException {
        try {
            return C6777llL1.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    public C5646LII1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6777llL1 m16297OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C97411 m16298OooO00o() {
        return this.OooO00o.m17898OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16299OooO00o() {
        return this.OooO00o.OooO00o().m16143OooO00o() != null;
    }
}
