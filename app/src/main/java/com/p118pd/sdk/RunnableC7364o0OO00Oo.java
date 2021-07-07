package com.p118pd.sdk;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultProgressEvent;

/* renamed from: com.pd.sdk.o0OO00Oo  reason: case insensitive filesystem */
public class RunnableC7364o0OO00Oo implements Runnable {
    public final /* synthetic */ ByteArray OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ AbstractC7332o0O0o0Oo f20122OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ o0OO00OO f20123OooO00o;
    public final /* synthetic */ int o00oO0O;
    public final /* synthetic */ int o0ooOO0;

    public RunnableC7364o0OO00Oo(o0OO00OO o0oo00oo, int i, ByteArray byteArray, int i2, AbstractC7332o0O0o0Oo o0o0o0oo) {
        this.f20123OooO00o = o0oo00oo;
        this.o00oO0O = i;
        this.OooO00o = byteArray;
        this.o0ooOO0 = i2;
        this.f20122OooO00o = o0o0o0oo;
    }

    public void run() {
        if (!o0OO00OO.OooO00o(this.f20123OooO00o)) {
            try {
                this.f20122OooO00o.OooO00o(new DefaultProgressEvent(this.o00oO0O, this.OooO00o.getDataLength(), this.o0ooOO0, this.OooO00o.getBuffer()));
            } catch (RemoteException unused) {
            }
        } else {
            try {
                if (o0OO00OO.OooO00o(this.f20123OooO00o) == null) {
                    o0OO00OO.OooO00o(this.f20123OooO00o, new BinderC7351o0O0oo0O());
                    o0OO00OO.OooO00o(this.f20123OooO00o).OooO00o(o0OO00OO.OooO00o(this.f20123OooO00o), this.o0ooOO0);
                    o0OO00OO.OooO00o(this.f20123OooO00o).OooO00o(this.OooO00o);
                    this.f20122OooO00o.OooO00o(o0OO00OO.OooO00o(this.f20123OooO00o));
                    return;
                }
                o0OO00OO.OooO00o(this.f20123OooO00o).OooO00o(this.OooO00o);
            } catch (Exception unused2) {
                if (o0OO00OO.OooO00o(this.f20123OooO00o) != null) {
                    o0OO00OO.OooO00o(this.f20123OooO00o).close();
                }
            }
        }
    }
}
