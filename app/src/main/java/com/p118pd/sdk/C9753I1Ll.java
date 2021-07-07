package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨丨I1Ll丨  reason: invalid class name and case insensitive filesystem */
public class C9753I1Ll {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f23393OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23394OooO00o;

    /* renamed from: com.pd.sdk.丨丨I1Ll丨$OooO00o */
    public static class OooO00o extends ByteArrayOutputStream {
        public byte[] OooO00o(int i) {
            if (((ByteArrayOutputStream) this).count < i + 16) {
                return null;
            }
            return C9586iIILl.OooO00o(((ByteArrayOutputStream) this).buf, i);
        }
    }

    public C9753I1Ll(short s, byte[] bArr, int i) {
        if (!C5330ILL.OooO00o(s)) {
            throw new IllegalArgumentException("'type' is not a valid HeartbeatMessageType value");
        } else if (bArr == null || bArr.length >= 65536) {
            throw new IllegalArgumentException("'payload' must have length < 2^16");
        } else if (i >= 16) {
            this.f23393OooO00o = s;
            this.f23394OooO00o = bArr;
            this.OooO00o = i;
        } else {
            throw new IllegalArgumentException("'paddingLength' must be at least 16");
        }
    }

    public static C9753I1Ll OooO00o(InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (C5330ILL.OooO00o(OooO00o2)) {
            int OooO00o3 = L1LL1Ii.OooO00o(inputStream);
            OooO00o oooO00o = new OooO00o();
            C6304ilIi1.OooO00o(inputStream, oooO00o);
            byte[] OooO00o4 = oooO00o.OooO00o(OooO00o3);
            if (OooO00o4 == null) {
                return null;
            }
            return new C9753I1Ll(OooO00o2, OooO00o4, oooO00o.size() - OooO00o4.length);
        }
        throw new TlsFatalAlert(47);
    }

    public void OooO00o(iL1liI il1lii, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.f23393OooO00o, outputStream);
        L1LL1Ii.m15925OooO00o(this.f23394OooO00o.length);
        L1LL1Ii.OooO00o(this.f23394OooO00o.length, outputStream);
        outputStream.write(this.f23394OooO00o);
        byte[] bArr = new byte[this.OooO00o];
        il1lii.m17075OooO00o().OooO0O0(bArr);
        outputStream.write(bArr);
    }
}
