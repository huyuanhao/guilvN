package com.p118pd.sdk;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO00OO */
public class o0OO00OO implements AbstractC7369o0OO0O0 {
    public AbstractC7332o0O0o0Oo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BinderC7351o0O0oo0O f20118OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7503o0OoOoO f20119OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20120OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20121OooO00o = false;

    public o0OO00OO(AbstractC7332o0O0o0Oo o0o0o0oo, C7503o0OoOoO o0ooooo) {
        this.OooO00o = o0o0o0oo;
        this.f20119OooO00o = o0ooooo;
        if (o0o0o0oo != null) {
            try {
                if ((o0o0o0oo.OooO00o() & 8) != 0) {
                    this.f20121OooO00o = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7369o0OO0O0
    public void onResponseCode(int i, Map<String, List<String>> map) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.Repeater", "[onResponseCode]", this.f20120OooO00o, new Object[0]);
        }
        AbstractC7332o0O0o0Oo o0o0o0oo = this.OooO00o;
        if (o0o0o0oo != null) {
            OooO00o(new RunnableC7368o0OO00oo(this, o0o0o0oo, i, map));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7369o0OO0O0
    public void OooO00o(int i, int i2, ByteArray byteArray) {
        AbstractC7332o0O0o0Oo o0o0o0oo = this.OooO00o;
        if (o0o0o0oo != null) {
            OooO00o(new RunnableC7364o0OO00Oo(this, i, byteArray, i2, o0o0o0oo));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7369o0OO0O0
    public void OooO00o(DefaultFinishEvent defaultFinishEvent) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.Repeater", "[onFinish] ", this.f20120OooO00o, new Object[0]);
        }
        AbstractC7332o0O0o0Oo o0o0o0oo = this.OooO00o;
        if (o0o0o0oo != null) {
            OooO00o(new RunnableC7366o0OO00o0(this, defaultFinishEvent, o0o0o0oo));
        }
        this.OooO00o = null;
    }

    private void OooO00o(Runnable runnable) {
        if (this.f20119OooO00o.m19133OooO00o()) {
            runnable.run();
            return;
        }
        String str = this.f20120OooO00o;
        C8727oo0oO0.OooO00o(str != null ? str.hashCode() : hashCode(), runnable);
    }

    public void OooO00o(String str) {
        this.f20120OooO00o = str;
    }
}
