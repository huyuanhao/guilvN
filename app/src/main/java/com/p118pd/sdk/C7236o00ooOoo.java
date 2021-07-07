package com.p118pd.sdk;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7238o00ooo0;
import com.p118pd.sdk.C7240o00ooo0O;

/* renamed from: com.pd.sdk.o00ooOoo  reason: case insensitive filesystem */
public final class C7236o00ooOoo {
    public static volatile C7236o00ooOoo OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19764OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19765OooO00o = "MediaSessionManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19766OooO00o = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19767OooO00o;

    /* renamed from: com.pd.sdk.o00ooOoo$OooO00o */
    public interface OooO00o {
        boolean OooO00o(OooO0OO oooO0OO);

        Context getContext();
    }

    /* renamed from: com.pd.sdk.o00ooOoo$OooO0O0 */
    public static final class OooO0O0 {
        public static final String OooO00o = "android.media.session.MediaController";

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f19768OooO00o;

        public OooO0O0(@NonNull String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f19768OooO00o = new C7238o00ooo0.OooO00o(str, i, i2);
            } else {
                this.f19768OooO00o = new C7240o00ooo0O.OooO00o(str, i, i2);
            }
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m18721OooO00o() {
            return this.f19768OooO00o.getPackageName();
        }

        public int OooO0O0() {
            return this.f19768OooO00o.OooO00o();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            return this.f19768OooO00o.equals(((OooO0O0) obj).f19768OooO00o);
        }

        public int hashCode() {
            return this.f19768OooO00o.hashCode();
        }

        public int OooO00o() {
            return this.f19768OooO00o.OooO0O0();
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO0O0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f19768OooO00o = new C7238o00ooo0.OooO00o(remoteUserInfo);
        }
    }

    /* renamed from: com.pd.sdk.o00ooOoo$OooO0OO */
    public interface OooO0OO {
        int OooO00o();

        int OooO0O0();

        String getPackageName();
    }

    public C7236o00ooOoo(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f19767OooO00o = new C7238o00ooo0(context);
        } else if (i >= 21) {
            this.f19767OooO00o = new C7239o00ooo00(context);
        } else {
            this.f19767OooO00o = new C7240o00ooo0O(context);
        }
    }

    @NonNull
    public static C7236o00ooOoo OooO00o(@NonNull Context context) {
        C7236o00ooOoo o00ooooo = OooO00o;
        if (o00ooooo == null) {
            synchronized (f19764OooO00o) {
                o00ooooo = OooO00o;
                if (o00ooooo == null) {
                    OooO00o = new C7236o00ooOoo(context.getApplicationContext());
                    o00ooooo = OooO00o;
                }
            }
        }
        return o00ooooo;
    }

    public boolean OooO00o(@NonNull OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            return this.f19767OooO00o.OooO00o(oooO0O0.f19768OooO00o);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    public Context OooO00o() {
        return this.f19767OooO00o.getContext();
    }
}
