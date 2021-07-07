package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oo00O  reason: case insensitive filesystem */
public final class C7668o0oo00O implements AbstractC7661o0oOooo<InputStream> {
    public static final int OooO00o = 5242880;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RecyclableBufferedInputStream f20543OooO00o;

    /* renamed from: com.pd.sdk.o0oo00O$OooO00o */
    public static final class OooO00o implements AbstractC7661o0oOooo.OooO00o<InputStream> {
        public final AbstractC7707o0ooO00O OooO00o;

        public OooO00o(AbstractC7707o0ooO00O o0ooo00o) {
            this.OooO00o = o0ooo00o;
        }

        @NonNull
        public AbstractC7661o0oOooo<InputStream> OooO00o(InputStream inputStream) {
            return new C7668o0oo00O(inputStream, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7661o0oOooo.OooO00o
        @NonNull
        public Class<InputStream> OooO00o() {
            return InputStream.class;
        }
    }

    public C7668o0oo00O(InputStream inputStream, AbstractC7707o0ooO00O o0ooo00o) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, o0ooo00o);
        this.f20543OooO00o = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
    @NonNull
    public InputStream OooO00o() throws IOException {
        this.f20543OooO00o.reset();
        return this.f20543OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19300OooO00o() {
        this.f20543OooO00o.OooO0O0();
    }
}
