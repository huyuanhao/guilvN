package org.bouncycastle.jce.interfaces;

import com.p118pd.sdk.AbstractC5419Il1i;
import java.math.BigInteger;
import java.security.PublicKey;

public interface GOST3410PublicKey extends AbstractC5419Il1i, PublicKey {
    BigInteger getY();
}
