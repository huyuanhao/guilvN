package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.pd.sdk.oO00OOoO  reason: case insensitive filesystem */
public class C7799oO00OOoO implements AbstractC7650o0oOoOoO<InputStream, C7796oO00OO> {
    public static final String OooO00o = "StreamGifDecoder";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7650o0oOoOoO<ByteBuffer, C7796oO00OO> f20854OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20855OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<ImageHeaderParser> f20856OooO00o;

    public C7799oO00OOoO(List<ImageHeaderParser> list, AbstractC7650o0oOoOoO<ByteBuffer, C7796oO00OO> o0oooooo, AbstractC7707o0ooO00O o0ooo00o) {
        this.f20856OooO00o = list;
        this.f20854OooO00o = o0oooooo;
        this.f20855OooO00o = o0ooo00o;
    }

    public boolean OooO00o(@NonNull InputStream inputStream, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        return !((Boolean) o0ooooo.OooO00o(C7958oO0oOOO0.OooO0O0)).booleanValue() && C7645o0oOoOO0.m19291OooO00o(this.f20856OooO00o, inputStream, this.f20855OooO00o) == ImageHeaderParser.ImageType.GIF;
    }

    public AbstractC7700o0oo0oo0<C7796oO00OO> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        byte[] OooO00o2 = OooO00o(inputStream);
        if (OooO00o2 == null) {
            return null;
        }
        return this.f20854OooO00o.OooO00o(ByteBuffer.wrap(OooO00o2), i, i2, o0ooooo);
    }

    public static byte[] OooO00o(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            Log.isLoggable(OooO00o, 5);
            return null;
        }
    }
}
