package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.dane.DANEException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨丨iii  reason: invalid class name and case insensitive filesystem */
public class C9838iii {
    public final I111LIL OooO00o;

    public C9838iii(I111LIL r1) {
        this.OooO00o = r1;
    }

    public LiIi1LIl OooO00o(String str) throws DANEException {
        byte[] OooO0O0 = Strings.m22987OooO0O0(str.substring(0, str.indexOf(64)));
        try {
            OutputStream OooO00o2 = this.OooO00o.m21370OooO00o();
            OooO00o2.write(OooO0O0);
            OooO00o2.close();
            byte[] OooO00o3 = this.OooO00o.m21371OooO00o();
            return new LiIi1LIl(Strings.OooO00o(C6472l1l1l.OooO0O0(OooO00o3)) + "._smimecert." + str.substring(str.indexOf(64) + 1));
        } catch (IOException e) {
            throw new DANEException("Unable to calculate digest string: " + e.getMessage(), e);
        }
    }
}
