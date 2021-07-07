package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: com.pd.sdk.oOOO0000 */
public interface oOOO0000 extends AbstractC8210oOOoO0o0, WritableByteChannel {
    long OooO00o(AbstractC8930ooOOO0OO ooooo0oo) throws IOException;

    OOOO000 OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    oOOO0000 m19751OooO00o() throws IOException;

    oOOO0000 OooO00o(int i) throws IOException;

    oOOO0000 OooO00o(long j) throws IOException;

    oOOO0000 OooO00o(AbstractC8930ooOOO0OO ooooo0oo, long j) throws IOException;

    oOOO0000 OooO00o(String str) throws IOException;

    oOOO0000 OooO00o(String str, int i, int i2) throws IOException;

    oOOO0000 OooO00o(String str, int i, int i2, Charset charset) throws IOException;

    oOOO0000 OooO00o(String str, Charset charset) throws IOException;

    oOOO0000 OooO00o(ByteString byteString) throws IOException;

    oOOO0000 OooO00o(byte[] bArr) throws IOException;

    oOOO0000 OooO00o(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    OutputStream m19752OooO00o();

    oOOO0000 OooO0O0() throws IOException;

    oOOO0000 OooO0O0(int i) throws IOException;

    oOOO0000 OooO0O0(long j) throws IOException;

    oOOO0000 OooO0OO(int i) throws IOException;

    oOOO0000 OooO0OO(long j) throws IOException;

    oOOO0000 OooO0Oo(int i) throws IOException;

    oOOO0000 OooO0Oo(long j) throws IOException;

    oOOO0000 OooO0o(int i) throws IOException;

    oOOO0000 OooO0o0(int i) throws IOException;

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
    void flush() throws IOException;
}
