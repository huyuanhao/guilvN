package com.p118pd.sdk;

import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

/* renamed from: com.pd.sdk.丨I1  reason: invalid class name and case insensitive filesystem */
public class C9325I1 implements IIlL1l {
    public static final String OooO00o = "1.2.840.113549.1.9.16.3.8";

    @Override // com.p118pd.sdk.IIlL1l
    public C6456l1ilL OooO00o() {
        return new C6456l1ilL(new LlLI1("1.2.840.113549.1.9.16.3.8"));
    }

    @Override // com.p118pd.sdk.IIlL1l
    public OutputStream OooO00o(OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }
}
