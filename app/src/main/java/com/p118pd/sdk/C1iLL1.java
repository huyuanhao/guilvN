package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨1iLL丨1  reason: invalid class name */
public class C1iLL1 {
    public final String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f22806OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger[] f22807OooO00o;

    public C1iLL1(String str, BigInteger bigInteger, BigInteger[] bigIntegerArr) {
        C6570lLI11I.OooO00o((Object) str, "participantId");
        C6570lLI11I.OooO00o(bigInteger, "a");
        C6570lLI11I.OooO00o(bigIntegerArr, "knowledgeProofForX2s");
        this.OooO00o = str;
        this.f22806OooO00o = bigInteger;
        this.f22807OooO00o = C9586iIILl.OooO00o(bigIntegerArr, bigIntegerArr.length);
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21312OooO00o() {
        return this.f22806OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger[] m21313OooO00o() {
        BigInteger[] bigIntegerArr = this.f22807OooO00o;
        return C9586iIILl.OooO00o(bigIntegerArr, bigIntegerArr.length);
    }
}
