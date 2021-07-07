package org.bouncycastle.util.test;

import com.p118pd.sdk.IIiL;
import java.math.BigInteger;
import org.bouncycastle.util.test.FixedSecureRandom;

public class TestRandomBigInteger extends FixedSecureRandom {
    public TestRandomBigInteger(int i, byte[] bArr) {
        super(new FixedSecureRandom.OooO0OO[]{new FixedSecureRandom.OooO00o(i, bArr)});
    }

    public TestRandomBigInteger(String str) {
        this(str, 10);
    }

    public TestRandomBigInteger(String str, int i) {
        super(new FixedSecureRandom.OooO0OO[]{new FixedSecureRandom.OooO00o(IIiL.OooO00o(new BigInteger(str, i)))});
    }

    public TestRandomBigInteger(byte[] bArr) {
        super(new FixedSecureRandom.OooO0OO[]{new FixedSecureRandom.OooO00o(bArr)});
    }
}
