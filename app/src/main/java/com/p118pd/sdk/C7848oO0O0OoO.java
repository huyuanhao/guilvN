package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.oO0O0OoO  reason: case insensitive filesystem */
public class C7848oO0O0OoO implements AbstractC7661o0oOooo<ByteBuffer> {
    public final ByteBuffer OooO00o;

    /* renamed from: com.pd.sdk.oO0O0OoO$OooO00o */
    public static class OooO00o implements AbstractC7661o0oOooo.OooO00o<ByteBuffer> {
        @NonNull
        public AbstractC7661o0oOooo<ByteBuffer> OooO00o(ByteBuffer byteBuffer) {
            return new C7848oO0O0OoO(byteBuffer);
        }

        @Override // com.p118pd.sdk.AbstractC7661o0oOooo.OooO00o
        @NonNull
        public Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }
    }

    public C7848oO0O0OoO(ByteBuffer byteBuffer) {
        this.OooO00o = byteBuffer;
    }

    @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19530OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
    @NonNull
    public ByteBuffer OooO00o() {
        this.OooO00o.position(0);
        return this.OooO00o;
    }
}
