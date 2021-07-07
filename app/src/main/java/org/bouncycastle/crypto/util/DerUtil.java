package org.bouncycastle.crypto.util;

import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C9586iIILl;
import java.io.IOException;

public class DerUtil {
    public static AbstractC6804llL1ii OooO00o(byte[] bArr) {
        return bArr == null ? new C6487lIIiIlL(new byte[0]) : new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public static byte[] OooO00o(AbstractC6122iIlLiL iillil) {
        try {
            return iillil.getEncoded();
        } catch (IOException e) {
            throw new IllegalStateException("Cannot get encoding: " + e.getMessage()) {
                /* class org.bouncycastle.crypto.util.DerUtil.C48341 */

                public Throwable getCause() {
                    return e;
                }
            };
        }
    }
}
