package org.bouncycastle.crypto.tls;

import com.p118pd.sdk.C6728ll11;

public class TlsFatalAlert extends TlsException {
    public short alertDescription;

    public TlsFatalAlert(short s) {
        this(s, null);
    }

    public TlsFatalAlert(short s, Throwable th) {
        super(C6728ll11.OooO0O0(s), th);
        this.alertDescription = s;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
