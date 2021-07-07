package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.p118pd.sdk.C7785oO000o00;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0Ooo0o  reason: case insensitive filesystem */
public class C7906oO0Ooo0o implements AbstractC7650o0oOoOoO<InputStream, Bitmap> {
    public final AbstractC7707o0ooO00O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7785oO000o00 f20975OooO00o;

    /* renamed from: com.pd.sdk.oO0Ooo0o$OooO00o */
    public static class OooO00o implements C7785oO000o00.OooO0O0 {
        public final RecyclableBufferedInputStream OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final oO0O00O f20976OooO00o;

        public OooO00o(RecyclableBufferedInputStream recyclableBufferedInputStream, oO0O00O oo0o00o) {
            this.OooO00o = recyclableBufferedInputStream;
            this.f20976OooO00o = oo0o00o;
        }

        @Override // com.p118pd.sdk.C7785oO000o00.OooO0O0
        public void OooO00o() {
            this.OooO00o.m15004OooO00o();
        }

        @Override // com.p118pd.sdk.C7785oO000o00.OooO0O0
        public void OooO00o(AbstractC7711o0ooO0OO o0ooo0oo, Bitmap bitmap) throws IOException {
            IOException OooO00o2 = this.f20976OooO00o.OooO00o();
            if (OooO00o2 != null) {
                if (bitmap != null) {
                    o0ooo0oo.OooO00o(bitmap);
                }
                throw OooO00o2;
            }
        }
    }

    public C7906oO0Ooo0o(C7785oO000o00 oo000o00, AbstractC7707o0ooO00O o0ooo00o) {
        this.f20975OooO00o = oo000o00;
        this.OooO00o = o0ooo00o;
    }

    public boolean OooO00o(@NonNull InputStream inputStream, @NonNull C7648o0oOoOo o0ooooo) {
        return this.f20975OooO00o.OooO00o(inputStream);
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.OooO00o);
            z = true;
        }
        oO0O00O OooO00o2 = oO0O00O.OooO00o((InputStream) recyclableBufferedInputStream);
        try {
            return this.f20975OooO00o.OooO00o(new C7844oO0O00oo(OooO00o2), i, i2, o0ooooo, new OooO00o(recyclableBufferedInputStream, OooO00o2));
        } finally {
            OooO00o2.m19516OooO00o();
            if (z) {
                recyclableBufferedInputStream.OooO0O0();
            }
        }
    }
}
