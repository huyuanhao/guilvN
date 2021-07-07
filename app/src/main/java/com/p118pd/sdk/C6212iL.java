package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iL丨丨  reason: invalid class name and case insensitive filesystem */
public class C6212iL implements AbstractC5563Il, AbstractC5361Iii {
    public static final int OooO00o = 32768;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f17824OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f17825OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17826OooO00o;

    public C6212iL(LlLI1 llLI1, File file, int i) {
        this.f17824OooO00o = llLI1;
        this.f17825OooO00o = file;
        this.f17826OooO00o = new byte[i];
    }

    public C6212iL(File file) {
        this(file, 32768);
    }

    public C6212iL(File file, int i) {
        this(new LlLI1(AbstractC6252iiLl.OooO00o.m16387OooO0O0()), file, i);
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    public LlLI1 OooO00o() {
        return this.f17824OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m17194OooO00o() throws IOException, CMSException {
        return new BufferedInputStream(new FileInputStream(this.f17825OooO00o), 32768);
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m17195OooO00o() {
        return this.f17825OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5808Ll1I
    public void write(OutputStream outputStream) throws IOException, CMSException {
        FileInputStream fileInputStream = new FileInputStream(this.f17825OooO00o);
        while (true) {
            byte[] bArr = this.f17826OooO00o;
            int read = fileInputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                outputStream.write(this.f17826OooO00o, 0, read);
            } else {
                fileInputStream.close();
                return;
            }
        }
    }
}
