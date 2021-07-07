package com.umeng.commonsdk.proguard;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.umeng.commonsdk.proguard.be */
public class C3595be extends AbstractC3597bg {

    /* renamed from: a */
    public InputStream f9280a = null;

    /* renamed from: b */
    public OutputStream f9281b = null;

    public C3595be() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: a */
    public int mo38965a(byte[] bArr, int i, int i2) throws C3598bh {
        InputStream inputStream = this.f9280a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new C3598bh(4);
            } catch (IOException e) {
                throw new C3598bh(0, e);
            }
        } else {
            throw new C3598bh(1, "Cannot read from null inputStream");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: a */
    public boolean mo38966a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: b */
    public void mo38967b() throws C3598bh {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: b */
    public void mo38968b(byte[] bArr, int i, int i2) throws C3598bh {
        OutputStream outputStream = this.f9281b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new C3598bh(0, e);
            }
        } else {
            throw new C3598bh(1, "Cannot write to null outputStream");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: c */
    public void mo38969c() {
        InputStream inputStream = this.f9280a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f9280a = null;
        }
        OutputStream outputStream = this.f9281b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.f9281b = null;
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: d */
    public void mo38970d() throws C3598bh {
        OutputStream outputStream = this.f9281b;
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e) {
                throw new C3598bh(0, e);
            }
        } else {
            throw new C3598bh(1, "Cannot flush null outputStream");
        }
    }

    public C3595be(InputStream inputStream) {
        this.f9280a = inputStream;
    }

    public C3595be(OutputStream outputStream) {
        this.f9281b = outputStream;
    }

    public C3595be(InputStream inputStream, OutputStream outputStream) {
        this.f9280a = inputStream;
        this.f9281b = outputStream;
    }
}
