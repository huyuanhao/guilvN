package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.Ii丨il  reason: invalid class name and case insensitive filesystem */
public class C5409Iiil {
    public final AbstractC5645LI1LiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15773OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15774OooO00o;
    public final byte[] OooO0O0;

    public C5409Iiil(String str, byte[] bArr, byte[] bArr2, AbstractC5645LI1LiI r4) {
        this.f15773OooO00o = str;
        this.f15774OooO00o = bArr;
        this.OooO0O0 = bArr2;
        this.OooO00o = r4;
    }

    public C6626lL11 OooO00o(iI1iiLll ii1iilll) throws IOException {
        try {
            return this.OooO00o.OooO00o(ii1iilll.OooO00o(this.f15773OooO00o).OooO00o(this.OooO0O0, this.f15774OooO00o));
        } catch (IOException e) {
            throw e;
        } catch (OperatorCreationException e2) {
            throw new PEMException("cannot create extraction operator: " + e2.getMessage(), e2);
        } catch (Exception e3) {
            throw new PEMException("exception processing key pair: " + e3.getMessage(), e3);
        }
    }
}
