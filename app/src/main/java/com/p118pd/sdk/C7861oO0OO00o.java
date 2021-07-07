package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO0OO00o  reason: case insensitive filesystem */
public final class C7861oO0OO00o<Z> extends AbstractC7831oO00oOOo<Z> {
    public static final Handler OooO00o = new Handler(Looper.getMainLooper(), new OooO00o());
    public static final int o00oO0O = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7658o0oOooOO f20923OooO00o;

    /* renamed from: com.pd.sdk.oO0OO00o$OooO00o */
    public class OooO00o implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C7861oO0OO00o) message.obj).OooO00o();
            return true;
        }
    }

    public C7861oO0OO00o(C7658o0oOooOO o0oooooo, int i, int i2) {
        super(i, i2);
        this.f20923OooO00o = o0oooooo;
    }

    public static <Z> C7861oO0OO00o<Z> OooO00o(C7658o0oOooOO o0oooooo, int i, int i2) {
        return new C7861oO0OO00o<>(o0oooooo, i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onResourceReady(@NonNull Z z, @Nullable AbstractC7837oO00ooOo<? super Z> oo00oooo) {
        OooO00o.obtainMessage(1, this).sendToTarget();
    }

    public void OooO00o() {
        this.f20923OooO00o.clear(this);
    }
}
