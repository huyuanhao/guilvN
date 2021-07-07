package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.IILli  reason: case insensitive filesystem */
public class C5200IILli {
    public static final int OooO00o = 32768;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f15490OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f15491OooO00o;

    /* renamed from: com.pd.sdk.IILli$OooO00o */
    public static class OooO00o extends FilterInputStream {
        public OooO00o(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int OooO00o = C6304ilIi1.OooO00o(((FilterInputStream) this).in, bArr, i, i2);
            if (OooO00o > 0) {
                return OooO00o;
            }
            return -1;
        }
    }

    public C5200IILli(LlLI1 llLI1) {
        this.f15490OooO00o = llLI1;
    }

    public C5200IILli(LlLI1 llLI1, InputStream inputStream) {
        this(llLI1, inputStream, 32768);
    }

    public C5200IILli(LlLI1 llLI1, InputStream inputStream, int i) {
        this.f15490OooO00o = llLI1;
        this.f15491OooO00o = new OooO00o(new BufferedInputStream(inputStream, i));
    }

    public C5200IILli(InputStream inputStream) {
        this(AbstractC5711LiLli.o00Oo0.m16387OooO0O0(), inputStream, 32768);
    }

    public C5200IILli(String str, InputStream inputStream) {
        this(new LlLI1(str), inputStream, 32768);
    }

    public C5200IILli(String str, InputStream inputStream, int i) {
        this(new LlLI1(str), inputStream, i);
    }

    public LlLI1 OooO00o() {
        return this.f15490OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m15381OooO00o() {
        return this.f15491OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15382OooO00o() throws IOException {
        C6304ilIi1.OooO00o(this.f15491OooO00o);
        this.f15491OooO00o.close();
    }
}
