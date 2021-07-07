package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨L  reason: invalid class name and case insensitive filesystem */
public class C6374iL {
    public final String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f18160OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger[] f18161OooO00o;
    public final BigInteger OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final BigInteger[] f18162OooO0O0;

    public C6374iL(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        C6570lLI11I.OooO00o((Object) str, "participantId");
        C6570lLI11I.OooO00o(bigInteger, "gx1");
        C6570lLI11I.OooO00o(bigInteger2, "gx2");
        C6570lLI11I.OooO00o(bigIntegerArr, "knowledgeProofForX1");
        C6570lLI11I.OooO00o(bigIntegerArr2, "knowledgeProofForX2");
        this.OooO00o = str;
        this.f18160OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.f18161OooO00o = C9586iIILl.OooO00o(bigIntegerArr, bigIntegerArr.length);
        this.f18162OooO0O0 = C9586iIILl.OooO00o(bigIntegerArr2, bigIntegerArr2.length);
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17486OooO00o() {
        return this.f18160OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger[] m17487OooO00o() {
        BigInteger[] bigIntegerArr = this.f18161OooO00o;
        return C9586iIILl.OooO00o(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger[] m17488OooO0O0() {
        BigInteger[] bigIntegerArr = this.f18162OooO0O0;
        return C9586iIILl.OooO00o(bigIntegerArr, bigIntegerArr.length);
    }
}
