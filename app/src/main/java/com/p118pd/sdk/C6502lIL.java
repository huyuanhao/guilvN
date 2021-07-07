package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.lIL  reason: case insensitive filesystem */
public class C6502lIL implements AbstractC6681liLI {
    public final C1IlLiL1 OooO00o;

    public C6502lIL(C1IlLiL1 r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO00o() throws IOException {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO00o(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            return this.OooO00o.OooO00o(bArr, i, i2, i3);
        } catch (TlsFatalAlert e) {
            this.OooO00o.OooO00o(e.getAlertDescription());
            throw e;
        } catch (IOException e2) {
            this.OooO00o.OooO00o((short) 80);
            throw e2;
        } catch (RuntimeException e3) {
            this.OooO00o.OooO00o((short) 80);
            throw new TlsFatalAlert(80, e3);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void OooO00o(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.OooO00o.OooO00o(bArr, i, i2);
        } catch (TlsFatalAlert e) {
            this.OooO00o.OooO00o(e.getAlertDescription());
            throw e;
        } catch (IOException e2) {
            this.OooO00o.OooO00o((short) 80);
            throw e2;
        } catch (RuntimeException e3) {
            this.OooO00o.OooO00o((short) 80);
            throw new TlsFatalAlert(80, e3);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO0O0() throws IOException {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void close() throws IOException {
        this.OooO00o.close();
    }
}
