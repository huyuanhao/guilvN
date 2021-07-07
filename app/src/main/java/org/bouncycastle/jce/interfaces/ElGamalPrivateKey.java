package org.bouncycastle.jce.interfaces;

import com.p118pd.sdk.IIL1l1L;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;

public interface ElGamalPrivateKey extends IIL1l1L, DHPrivateKey {
    BigInteger getX();
}
