package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.o0oooo0O  reason: case insensitive filesystem */
public class C7755o0oooo0O<Data> implements AbstractC7770oO00000o<byte[], Data> {
    public final OooO0O0<Data> OooO00o;

    /* renamed from: com.pd.sdk.o0oooo0O$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<byte[], ByteBuffer> {

        /* renamed from: com.pd.sdk.o0oooo0O$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4971OooO00o implements OooO0O0<ByteBuffer> {
            public C4971OooO00o() {
            }

            @Override // com.p118pd.sdk.C7755o0oooo0O.OooO0O0
            public ByteBuffer OooO00o(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // com.p118pd.sdk.C7755o0oooo0O.OooO0O0
            public Class<ByteBuffer> OooO00o() {
                return ByteBuffer.class;
            }
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<byte[], ByteBuffer> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7755o0oooo0O(new C4971OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.o0oooo0O$OooO0O0 */
    public interface OooO0O0<Data> {
        Class<Data> OooO00o();

        Data OooO00o(byte[] bArr);
    }

    /* renamed from: com.pd.sdk.o0oooo0O$OooO0Oo  reason: case insensitive filesystem */
    public static class C7756OooO0Oo implements AbstractC7771oO0000O<byte[], InputStream> {

        /* renamed from: com.pd.sdk.o0oooo0O$OooO0Oo$OooO00o */
        public class OooO00o implements OooO0O0<InputStream> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.C7755o0oooo0O.OooO0O0
            public InputStream OooO00o(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // com.p118pd.sdk.C7755o0oooo0O.OooO0O0
            public Class<InputStream> OooO00o() {
                return InputStream.class;
            }
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<byte[], InputStream> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7755o0oooo0O(new OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7755o0oooo0O(OooO0O0<Data> oooO0O0) {
        this.OooO00o = oooO0O0;
    }

    public boolean OooO00o(@NonNull byte[] bArr) {
        return true;
    }

    /* renamed from: com.pd.sdk.o0oooo0O$OooO0OO */
    public static class OooO0OO<Data> implements AbstractC7662o0oOooo0<Data> {
        public final OooO0O0<Data> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f20781OooO00o;

        public OooO0OO(byte[] bArr, OooO0O0<Data> oooO0O0) {
            this.f20781OooO00o = bArr;
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19403OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super Data> oooO00o) {
            oooO00o.OooO00o((Object) this.OooO00o.OooO00o(this.f20781OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Data> m19402OooO00o() {
            return this.OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public DataSource OooO00o() {
            return DataSource.LOCAL;
        }
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull byte[] bArr, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(bArr), new OooO0OO(bArr, this.OooO00o));
    }
}
