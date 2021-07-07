package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooOoOOoo  reason: case insensitive filesystem */
public class C9052ooOoOOoo {
    public static String OooO00o(String str, String str2) throws Exception {
        II1li1Il iI1li1Il = new II1li1Il();
        byte[] bytes = str.getBytes(str2);
        iI1li1Il.update(bytes, 0, bytes.length);
        byte[] bArr = new byte[iI1li1Il.OooO0O0()];
        iI1li1Il.OooO00o(bArr, 0);
        return C5191I1ll.OooO0O0(bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20716OooO00o(String str, String str2) throws Exception {
        II1li1Il iI1li1Il = new II1li1Il();
        byte[] bytes = str.getBytes(str2);
        iI1li1Il.update(bytes, 0, bytes.length);
        byte[] bArr = new byte[iI1li1Il.OooO0O0()];
        iI1li1Il.OooO00o(bArr, 0);
        return bArr;
    }
}
