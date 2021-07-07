package org.bouncycastle.jce.interfaces;

import com.p118pd.sdk.IIL1l1L;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

public interface ElGamalPublicKey extends IIL1l1L, DHPublicKey {
    BigInteger getY();
}
