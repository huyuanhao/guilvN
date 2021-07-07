package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lI11  reason: case insensitive filesystem */
public class C6476lI11 implements AbstractC6638li1iIL {
    public static final String OooO0O0 = Strings.m22984OooO00o();
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Throwable f18313OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18314OooO00o;

    public C6476lI11(boolean z, String str) {
        this.f18314OooO00o = z;
        this.OooO00o = str;
    }

    public C6476lI11(boolean z, String str, Throwable th) {
        this.f18314OooO00o = z;
        this.OooO00o = str;
        this.f18313OooO00o = th;
    }

    public static AbstractC6638li1iIL OooO00o(AbstractC6857lLll r2, String str) {
        return new C6476lI11(false, r2.getName() + ": " + str);
    }

    public static AbstractC6638li1iIL OooO00o(AbstractC6857lLll r1, String str, Object obj, Object obj2) {
        return OooO00o(r1, str + OooO0O0 + "Expected: " + obj + OooO0O0 + "Found   : " + obj2);
    }

    public static AbstractC6638li1iIL OooO00o(AbstractC6857lLll r2, String str, Throwable th) {
        return new C6476lI11(false, r2.getName() + ": " + str, th);
    }

    public static String OooO00o(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" failing ");
        stringBuffer.append(str2);
        stringBuffer.append(OooO0O0);
        stringBuffer.append("    expected: ");
        stringBuffer.append(str3);
        stringBuffer.append(OooO0O0);
        stringBuffer.append("    got     : ");
        stringBuffer.append(str4);
        return stringBuffer.toString();
    }

    public static AbstractC6638li1iIL OooO0O0(AbstractC6857lLll r2, String str) {
        return new C6476lI11(true, r2.getName() + ": " + str);
    }

    @Override // com.p118pd.sdk.AbstractC6638li1iIL, com.p118pd.sdk.AbstractC6638li1iIL
    public Throwable OooO00o() {
        return this.f18313OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6638li1iIL, com.p118pd.sdk.AbstractC6638li1iIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17611OooO00o() {
        return this.f18314OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6638li1iIL
    public String toString() {
        return this.OooO00o;
    }
}
