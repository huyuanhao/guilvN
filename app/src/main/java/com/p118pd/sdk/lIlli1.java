package com.p118pd.sdk;

import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.l丨Illi1丨  reason: invalid class name */
public class lIlli1 {
    public l1i1IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f18894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18895OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final char[] f18896OooO00o;
    public final String OooO0O0;

    public lIlli1(String str, String str2, char[] cArr) {
        this.OooO00o = new l1i1IL();
        this.f18895OooO00o = new SecureRandom();
        this.f18894OooO00o = str;
        this.OooO0O0 = str2;
        this.f18896OooO00o = cArr;
    }

    public lIlli1(String str, char[] cArr) {
        this(null, str, cArr);
    }

    public C5460IliLIL OooO00o() throws OperatorCreationException {
        return new C5460IliLIL(this.f18894OooO00o, this.OooO0O0, this.f18896OooO00o, this.f18895OooO00o, this.OooO00o.OooO00o());
    }

    public lIlli1 OooO00o(String str) {
        this.OooO00o.OooO00o(str);
        return this;
    }

    public lIlli1 OooO00o(Provider provider) {
        this.OooO00o.OooO00o(provider);
        return this;
    }

    public lIlli1 OooO00o(SecureRandom secureRandom) {
        this.f18895OooO00o = secureRandom;
        return this;
    }
}
