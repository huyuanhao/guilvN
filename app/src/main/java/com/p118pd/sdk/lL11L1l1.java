package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lL11L1l1 */
public abstract class lL11L1l1 {
    public abstract AbstractC6122iIlLiL OooO00o(LlLI1 llLI1, String str);

    public AbstractC6122iIlLiL OooO00o(String str, int i) throws IOException {
        String OooO00o = Strings.OooO00o(str);
        int length = (OooO00o.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char charAt = OooO00o.charAt(i3);
            char charAt2 = OooO00o.charAt(i3 + 1);
            if (charAt < 'a') {
                bArr[i2] = (byte) ((charAt - '0') << 4);
            } else {
                bArr[i2] = (byte) (((charAt - 'a') + 10) << 4);
            }
            if (charAt2 < 'a') {
                bArr[i2] = (byte) (((byte) (charAt2 - '0')) | bArr[i2]);
            } else {
                bArr[i2] = (byte) (((byte) ((charAt2 - 'a') + 10)) | bArr[i2]);
            }
        }
        return new C5805Ll1(bArr).OooO00o();
    }

    public boolean OooO00o(String str) {
        return LI11.OooO00o(str);
    }
}
