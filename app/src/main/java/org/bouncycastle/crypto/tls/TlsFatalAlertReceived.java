package org.bouncycastle.crypto.tls;

import com.p118pd.sdk.C6728ll11;

public class TlsFatalAlertReceived extends TlsException {
    public short alertDescription;

    public TlsFatalAlertReceived(short s) {
        super(C6728ll11.OooO0O0(s), null);
        this.alertDescription = s;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
