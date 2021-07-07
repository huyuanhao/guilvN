package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okio.ByteString;

/* renamed from: com.pd.sdk.oOOO000O */
public interface oOOO000O extends AbstractC8930ooOOO0OO, ReadableByteChannel {
    int OooO00o() throws IOException;

    int OooO00o(C5987Ooooo ooooo) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    long m19753OooO00o() throws IOException;

    long OooO00o(byte b) throws IOException;

    long OooO00o(byte b, long j) throws IOException;

    long OooO00o(byte b, long j, long j2) throws IOException;

    long OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) throws IOException;

    long OooO00o(ByteString byteString) throws IOException;

    long OooO00o(ByteString byteString, long j) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    OOOO000 m19754OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    InputStream m19755OooO00o();

    String OooO00o(long j) throws IOException;

    String OooO00o(long j, Charset charset) throws IOException;

    String OooO00o(Charset charset) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    ByteString m19756OooO00o() throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    ByteString m19757OooO00o(long j) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    short m19758OooO00o() throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    void m19759OooO00o(long j) throws IOException;

    void OooO00o(OOOO000 oooo000, long j) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    boolean m19760OooO00o(long j) throws IOException;

    boolean OooO00o(long j, ByteString byteString) throws IOException;

    boolean OooO00o(long j, ByteString byteString, int i, int i2) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    byte[] m19761OooO00o() throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    byte[] m19762OooO00o(long j) throws IOException;

    long OooO0O0() throws IOException;

    long OooO0O0(ByteString byteString) throws IOException;

    long OooO0O0(ByteString byteString, long j) throws IOException;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    String m19763OooO0O0() throws IOException;

    String OooO0O0(long j) throws IOException;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    void m19764OooO0O0(long j) throws IOException;

    int OooO0OO() throws IOException;

    /* renamed from: OooO0OO  reason: collision with other method in class */
    long m19765OooO0OO() throws IOException;

    /* renamed from: OooO0OO  reason: collision with other method in class */
    boolean m19766OooO0OO() throws IOException;

    String OooO0Oo() throws IOException;

    @Nullable
    String OooO0o() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;
}
