package com.p118pd.sdk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.ii1丨IlLl  reason: invalid class name */
public class ii1IlLl implements AbstractC6681liLI {
    public static final int OooO0OO = 20;
    public static final int OooO0Oo = 84;
    public static final int OooO0o0 = 8;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DatagramSocket f17841OooO00o;
    public final int OooO0O0;

    public ii1IlLl(DatagramSocket datagramSocket, int i) throws IOException {
        if (!datagramSocket.isBound() || !datagramSocket.isConnected()) {
            throw new IllegalArgumentException("'socket' must be bound and connected");
        }
        this.f17841OooO00o = datagramSocket;
        this.OooO00o = (i - 20) - 8;
        this.OooO0O0 = (i - 84) - 8;
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO00o(byte[] bArr, int i, int i2, int i3) throws IOException {
        this.f17841OooO00o.setSoTimeout(i3);
        DatagramPacket datagramPacket = new DatagramPacket(bArr, i, i2);
        this.f17841OooO00o.receive(datagramPacket);
        return datagramPacket.getLength();
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void OooO00o(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= OooO00o()) {
            this.f17841OooO00o.send(new DatagramPacket(bArr, i, i2));
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void close() throws IOException {
        this.f17841OooO00o.close();
    }
}
