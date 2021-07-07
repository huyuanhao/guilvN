package com.p118pd.sdk;

import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.pd.sdk.iI丨lIii  reason: invalid class name and case insensitive filesystem */
public class C6143iIlIii extends PBEKeySpec {
    public static final C6456l1ilL OooO0O0 = new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o);
    public C6456l1ilL OooO00o;

    public C6143iIlIii(char[] cArr, byte[] bArr, int i, int i2, C6456l1ilL r5) {
        super(cArr, bArr, i, i2);
        this.OooO00o = r5;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17045OooO00o() {
        return OooO0O0.equals(this.OooO00o);
    }
}
