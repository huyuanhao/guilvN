package anet.channel.session;

import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SpdyProtocol;

/* renamed from: anet.channel.session.j */
public class C0172j implements AccsSSLCallback {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f297a;

    public C0172j(TnetSpdySession tnetSpdySession) {
        this.f297a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i, byte[] bArr) {
        byte[] bArr2;
        Throwable th;
        try {
            bArr2 = this.f297a.f270G.decrypt(this.f297a.f38a, ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            if (bArr2 != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.m290i("getSSLPublicKey", null, "decrypt", new String(bArr2));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ALog.m288e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArr2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bArr2 = null;
            ALog.m288e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
            return bArr2;
        }
        return bArr2;
    }
}
