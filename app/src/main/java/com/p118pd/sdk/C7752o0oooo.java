package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.o0oooo  reason: case insensitive filesystem */
public class C7752o0oooo implements AbstractC7770oO00000o<File, ByteBuffer> {
    public static final String OooO00o = "ByteBufferFileLoader";

    /* renamed from: com.pd.sdk.o0oooo$OooO0O0 */
    public static class OooO0O0 implements AbstractC7771oO0000O<File, ByteBuffer> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<File, ByteBuffer> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7752o0oooo();
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public boolean OooO00o(@NonNull File file) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<ByteBuffer> OooO00o(@NonNull File file, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(file), new OooO00o(file));
    }

    /* renamed from: com.pd.sdk.o0oooo$OooO00o */
    public static final class OooO00o implements AbstractC7662o0oOooo0<ByteBuffer> {
        public final File OooO00o;

        public OooO00o(File file) {
            this.OooO00o = file;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19399OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super ByteBuffer> oooO00o) {
            try {
                oooO00o.OooO00o(C8984ooOOoOo0.OooO00o(this.OooO00o));
            } catch (IOException e) {
                Log.isLoggable(C7752o0oooo.OooO00o, 3);
                oooO00o.OooO00o((Exception) e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<ByteBuffer> m19398OooO00o() {
            return ByteBuffer.class;
        }

        /* Return type fixed from 'com.bumptech.glide.load.DataSource' to match base method */
        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public Class<ByteBuffer> OooO00o() {
            return DataSource.LOCAL;
        }
    }
}
