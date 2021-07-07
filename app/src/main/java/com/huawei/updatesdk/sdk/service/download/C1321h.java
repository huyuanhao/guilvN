package com.huawei.updatesdk.sdk.service.download;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.huawei.updatesdk.sdk.service.download.h */
public class C1321h extends RandomAccessFile {

    /* renamed from: com.huawei.updatesdk.sdk.service.download.h$a */
    public static class C1322a extends IOException {
        public C1322a(Exception exc) {
            super(exc);
        }
    }

    public C1321h(String str, String str2) throws FileNotFoundException {
        super(str, str2);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            super.write(bArr, i, i2);
        } catch (Exception e) {
            throw new C1322a(e);
        }
    }
}
