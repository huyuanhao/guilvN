package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.pd.sdk.oo0O00oO  reason: case insensitive filesystem */
public class C8597oo0O00oO {
    public WritableMap OooO00o = Arguments.createMap();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20242OooO00o() {
        this.OooO00o = Arguments.createMap();
    }

    public void OooO0O0(@NonNull Callback callback, @NonNull String str) {
        m20242OooO00o();
        this.OooO00o.putString("error", str);
        OooO0O0(callback);
    }

    @NonNull
    public WritableMap OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(@NonNull String str, @NonNull String str2) {
        this.OooO00o.putString(str, str2);
    }

    public void OooO00o(@NonNull String str, int i) {
        this.OooO00o.putInt(str, i);
    }

    public void OooO0O0(@NonNull Callback callback) {
        callback.invoke(this.OooO00o);
    }

    public void OooO00o(@NonNull String str, boolean z) {
        this.OooO00o.putBoolean(str, z);
    }

    public void OooO00o(@NonNull String str, double d) {
        this.OooO00o.putDouble(str, d);
    }

    public void OooO00o(@NonNull Callback callback, @NonNull String str) {
        m20242OooO00o();
        this.OooO00o.putString("customButton", str);
        OooO0O0(callback);
    }

    public void OooO00o(@NonNull Callback callback) {
        m20242OooO00o();
        this.OooO00o.putBoolean("didCancel", true);
        OooO0O0(callback);
    }
}
