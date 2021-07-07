package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.xiaomi.push.jr */
public class C4557jr extends AbstractC4560ju {

    /* renamed from: a */
    public InputStream f13038a = null;

    /* renamed from: a */
    public OutputStream f13039a = null;

    public C4557jr() {
    }

    public C4557jr(OutputStream outputStream) {
        this.f13039a = outputStream;
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public int mo42595a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f13038a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new C4561jv(4);
            } catch (IOException e) {
                throw new C4561jv(0, e);
            }
        } else {
            throw new C4561jv(1, "Cannot read from null inputStream");
        }
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public void m13702a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f13039a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new C4561jv(0, e);
            }
        } else {
            throw new C4561jv(1, "Cannot write to null outputStream");
        }
    }
}
