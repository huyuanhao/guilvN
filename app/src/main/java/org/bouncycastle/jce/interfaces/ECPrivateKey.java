package org.bouncycastle.jce.interfaces;

import com.p118pd.sdk.AbstractC6484lII;
import java.math.BigInteger;
import java.security.PrivateKey;

public interface ECPrivateKey extends AbstractC6484lII, PrivateKey {
    BigInteger getD();
}
