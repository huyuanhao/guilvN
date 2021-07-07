package org.bouncycastle.jce.interfaces;

import com.p118pd.sdk.AbstractC5419Il1i;
import java.math.BigInteger;
import java.security.PrivateKey;

public interface GOST3410PrivateKey extends AbstractC5419Il1i, PrivateKey {
    BigInteger getX();
}
