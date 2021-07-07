package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.o0oooo0o  reason: case insensitive filesystem */
public class C7757o0oooo0o implements AbstractC7641o0oOoO<ByteBuffer> {
    public static final String OooO00o = "ByteBufferEncoder";

    public boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C7648o0oOoOo o0ooooo) {
        try {
            C8984ooOOoOo0.OooO00o(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(OooO00o, 3);
            return false;
        }
    }
}
