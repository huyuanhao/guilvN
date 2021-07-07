package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC8217oOOoOOO0;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oO0oOOOo  reason: case insensitive filesystem */
public final class C7960oO0oOOOo implements AbstractC8217oOOoOOO0 {
    public static final String o0ooOOo = "ConnectivityMonitor";
    public final BroadcastReceiver OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f21014OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8217oOOoOOO0.OooO00o f21015OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.oO0oOOOo$OooO00o */
    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            C7960oO0oOOOo oo0ooooo = C7960oO0oOOOo.this;
            boolean z = oo0ooooo.OooO0O0;
            oo0ooooo.OooO0O0 = oo0ooooo.OooO00o(context);
            if (z != C7960oO0oOOOo.this.OooO0O0) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    String str = "connectivity changed, isConnected: " + C7960oO0oOOOo.this.OooO0O0;
                }
                C7960oO0oOOOo oo0ooooo2 = C7960oO0oOOOo.this;
                oo0ooooo2.f21015OooO00o.OooO00o(oo0ooooo2.OooO0O0);
            }
        }
    }

    static {
        C.i(30);
    }

    public C7960oO0oOOOo(@NonNull Context context, @NonNull AbstractC8217oOOoOOO0.OooO00o oooO00o) {
        this.f21014OooO00o = context.getApplicationContext();
        this.f21015OooO00o = oooO00o;
    }

    private void OooO00o() {
        if (!this.OooO0OO) {
            this.OooO0O0 = OooO00o(this.f21014OooO00o);
            try {
                this.f21014OooO00o.registerReceiver(this.OooO00o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.OooO0OO = true;
            } catch (SecurityException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
            }
        }
    }

    private native void OooO0O0();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @SuppressLint({"MissingPermission"})
    public boolean OooO00o(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C7842oO0O0.OooO00o((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }
}
