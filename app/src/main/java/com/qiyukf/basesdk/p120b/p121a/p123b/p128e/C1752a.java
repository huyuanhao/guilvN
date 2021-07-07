package com.qiyukf.basesdk.p120b.p121a.p123b.p128e;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.qiyukf.basesdk.b.a.b.e.a */
public class C1752a {

    /* renamed from: a */
    public static final String f3234a = C1754c.m3225a(C1752a.class);

    /* renamed from: b */
    public final RandomAccessFile f3235b;

    /* renamed from: c */
    public final File f3236c;

    /* renamed from: d */
    public final String f3237d;

    public C1752a(File file, String str) {
        this.f3236c = file;
        this.f3235b = new RandomAccessFile(file, "r");
        this.f3237d = (str == null || str.trim().length() <= 0) ? file.getName() : str;
    }

    /* renamed from: a */
    public final byte[] mo33968a(long j, int i) {
        if (j == 0 && i == 0 && this.f3236c.length() == 0) {
            return new byte[0];
        }
        if (j >= this.f3236c.length()) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f3235b.seek(j);
        this.f3235b.read(bArr);
        return bArr;
    }
}
