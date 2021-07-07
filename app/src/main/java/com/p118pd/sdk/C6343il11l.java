package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.il丨11l  reason: invalid class name and case insensitive filesystem */
public class C6343il11l {
    public LiIiLii OooO00o;

    public C6343il11l(LiIiLii liIiLii) {
        if (liIiLii != null) {
            this.OooO00o = liIiLii;
            return;
        }
        throw new IllegalArgumentException("'publicKey' cannot be null");
    }

    public static C6343il11l OooO00o(InputStream inputStream) throws IOException {
        return new C6343il11l(C6053i1lii.OooO00o(new LiIiLii(C6053i1lii.OooO00o(inputStream), new C6017i1Il(C6053i1lii.OooO00o(inputStream), C6053i1lii.OooO00o(inputStream)))));
    }

    public LiIiLii OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        C6017i1Il OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO00o3 = this.OooO00o.OooO00o();
        C6053i1lii.OooO00o(OooO00o2.OooO0OO(), outputStream);
        C6053i1lii.OooO00o(OooO00o2.m16863OooO00o(), outputStream);
        C6053i1lii.OooO00o(OooO00o3, outputStream);
    }
}
