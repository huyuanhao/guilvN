package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.pd.sdk.Lil  reason: case insensitive filesystem */
public abstract class AbstractC5738Lil implements AbstractC6854lLi1LL, i11ILLIi {
    public static boolean OooO00o(Object obj, int i) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i;
    }

    public byte[] OooO00o(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals(AbstractC5533IiL.OooO00o)) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C6119iIl1il(byteArrayOutputStream).OooO00o(this);
        } else if (!str.equals(AbstractC5533IiL.OooO0O0)) {
            return getEncoded();
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C6269iil1(byteArrayOutputStream).OooO00o(this);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public abstract AbstractC6122iIlLiL OooO0O0();

    public AbstractC6122iIlLiL OooO0OO() {
        return OooO0O0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6854lLi1LL)) {
            return false;
        }
        return OooO0O0().equals(((AbstractC6854lLi1LL) obj).OooO0O0());
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C6103iIi1(byteArrayOutputStream).OooO00o(this);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return OooO0O0().hashCode();
    }
}
