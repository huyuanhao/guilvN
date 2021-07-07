package com.huawei.hms.update.p053a;

import com.huawei.hms.p037c.C1135e;
import com.huawei.hms.support.log.C1202a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: com.huawei.hms.update.a.b */
public class C1213b extends OutputStream {

    /* renamed from: a */
    public RandomAccessFile f1331a;

    public C1213b(File file, int i) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f1331a = randomAccessFile;
            randomAccessFile.setLength((long) i);
        } catch (FileNotFoundException unused) {
            C1202a.m1320d("RandomFileOutputStream", "create  file stream failed");
        } catch (IOException unused2) {
            C1135e.m1069a(this.f1331a);
            C1202a.m1320d("RandomFileOutputStream", "create  file stream failed");
        }
    }

    /* renamed from: a */
    public void mo15733a(long j) throws IOException {
        this.f1331a.seek(j);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1331a.close();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f1331a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
