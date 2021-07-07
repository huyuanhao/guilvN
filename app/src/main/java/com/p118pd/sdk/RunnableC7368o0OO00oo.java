package com.p118pd.sdk;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableHeader;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO00oo  reason: case insensitive filesystem */
public class RunnableC7368o0OO00oo implements Runnable {
    public final /* synthetic */ AbstractC7332o0O0o0Oo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ o0OO00OO f20126OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ Map f20127OooO00o;
    public final /* synthetic */ int o00oO0O;

    public RunnableC7368o0OO00oo(o0OO00OO o0oo00oo, AbstractC7332o0O0o0Oo o0o0o0oo, int i, Map map) {
        this.f20126OooO00o = o0oo00oo;
        this.OooO00o = o0o0o0oo;
        this.o00oO0O = i;
        this.f20127OooO00o = map;
    }

    public void run() {
        try {
            this.OooO00o.OooO00o(this.o00oO0O, new ParcelableHeader(this.o00oO0O, this.f20127OooO00o));
        } catch (RemoteException unused) {
        }
    }
}
