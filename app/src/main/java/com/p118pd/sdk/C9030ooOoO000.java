package com.p118pd.sdk;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOoO000  reason: case insensitive filesystem */
public class C9030ooOoO000 implements AbstractC9029ooOoO00 {
    public Gson OooO00o;

    public C9030ooOoO000() {
        this(new Gson());
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p118pd.sdk.AbstractC9029ooOoO00
    public <T> T OooO00o(InputStream inputStream, Type type) {
        try {
            T read = this.OooO00o.getAdapter(TypeToken.get(type)).read(this.OooO00o.newJsonReader(new InputStreamReader(inputStream)));
            C9035ooOoO0Oo.OooO00o(inputStream);
            return read;
        } catch (Exception unused) {
            C9035ooOoO0Oo.OooO00o(inputStream);
            return null;
        } catch (Throwable th) {
            C9035ooOoO0Oo.OooO00o(inputStream);
            throw th;
        }
    }

    public C9030ooOoO000(Gson gson) {
        this.OooO00o = new Gson();
        if (gson != null) {
            this.OooO00o = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // com.p118pd.sdk.AbstractC9029ooOoO00
    public boolean OooO00o(OutputStream outputStream, Object obj) {
        try {
            byte[] bytes = this.OooO00o.toJson(obj).getBytes();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            C9035ooOoO0Oo.OooO00o(outputStream);
        }
    }
}
