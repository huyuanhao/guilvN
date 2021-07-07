package org.bouncycastle.tsp.cms;

import com.p118pd.sdk.C9448Il;

public class ImprintDigestInvalidException extends Exception {
    public C9448Il token;

    public ImprintDigestInvalidException(String str, C9448Il r2) {
        super(str);
        this.token = r2;
    }

    public C9448Il getTimeStampToken() {
        return this.token;
    }
}
