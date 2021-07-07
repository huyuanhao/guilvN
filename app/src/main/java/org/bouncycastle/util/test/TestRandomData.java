package org.bouncycastle.util.test;

import com.p118pd.sdk.C6472l1l1l;
import org.bouncycastle.util.test.FixedSecureRandom;

public class TestRandomData extends FixedSecureRandom {
    public TestRandomData(String str) {
        super(new FixedSecureRandom.OooO0OO[]{new FixedSecureRandom.OooO0O0(C6472l1l1l.OooO00o(str))});
    }

    public TestRandomData(byte[] bArr) {
        super(new FixedSecureRandom.OooO0OO[]{new FixedSecureRandom.OooO0O0(bArr)});
    }
}
