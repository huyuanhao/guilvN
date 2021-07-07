package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.pd.sdk.o0oo0ooo  reason: case insensitive filesystem */
public class C7702o0oo0ooo {
    public final Handler OooO00o = new Handler(Looper.getMainLooper(), new OooO00o());

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20655OooO00o;

    /* renamed from: com.pd.sdk.o0oo0ooo$OooO00o */
    public static final class OooO00o implements Handler.Callback {
        public static final int OooO00o = 1;

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((AbstractC7700o0oo0oo0) message.obj).recycle();
            return true;
        }
    }

    public void OooO00o(AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        oO0O0O00.OooO0O0();
        if (this.f20655OooO00o) {
            this.OooO00o.obtainMessage(1, o0oo0oo0).sendToTarget();
            return;
        }
        this.f20655OooO00o = true;
        o0oo0oo0.recycle();
        this.f20655OooO00o = false;
    }
}
