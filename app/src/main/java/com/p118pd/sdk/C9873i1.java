package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.丨丨丨i1  reason: invalid class name and case insensitive filesystem */
public class C9873i1 implements AlgorithmParameterSpec {
    public static Map OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23485OooO00o;
    public byte[] OooO0O0;

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5331ILi.OooO0oo, "E-A");
        OooO00o.put(AbstractC5331ILi.OooO, "E-B");
        OooO00o.put(AbstractC5331ILi.OooOO0, "E-C");
        OooO00o.put(AbstractC5331ILi.OooOO0O, "E-D");
    }

    public C9873i1(LlLI1 llLI1, byte[] bArr) {
        this(OooO00o(llLI1));
        this.f23485OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public C9873i1(String str) {
        this.f23485OooO00o = null;
        this.OooO0O0 = null;
        this.OooO0O0 = C5539Iil.OooO00o(str);
    }

    public C9873i1(String str, byte[] bArr) {
        this(str);
        byte[] bArr2 = new byte[bArr.length];
        this.f23485OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public C9873i1(byte[] bArr) {
        this.f23485OooO00o = null;
        this.OooO0O0 = null;
        byte[] bArr2 = new byte[bArr.length];
        this.OooO0O0 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public C9873i1(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.f23485OooO00o = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }

    public static String OooO00o(LlLI1 llLI1) {
        String str = (String) OooO00o.get(llLI1);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unknown OID: " + llLI1);
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23485OooO00o);
    }

    public byte[] OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }

    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }
}
