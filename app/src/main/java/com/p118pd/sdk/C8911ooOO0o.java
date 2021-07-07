package com.p118pd.sdk;

import android.os.Handler;
import android.os.Message;
import com.learnium.RNDeviceInfo.netInfo.NetInfoManager;
import com.learnium.RNDeviceInfo.netInfo.NetStateChangeObserver;
import com.learnium.RNDeviceInfo.netInfo.NetworkType;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.ooOO0o  reason: case insensitive filesystem */
public class C8911ooOO0o implements NetStateChangeObserver, AbstractC8974ooOOoO {
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public NetworkType f22139OooO00o;

    /* renamed from: com.pd.sdk.ooOO0o$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C8911ooOO0o.this.OooO00o();
            }
        }
    }

    static {
        C.i(16777264);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO00o();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public void onFailure(String str) {
        NetInfoManager.getInstance().setIpAddress("");
        NetInfoManager.getInstance().setCountry("");
        NetInfoManager.getInstance().setArea("");
        this.OooO00o.sendEmptyMessageDelayed(1, 30000);
    }

    @Override // com.learnium.RNDeviceInfo.netInfo.NetStateChangeObserver
    public native void onNetConnected(NetworkType networkType);

    @Override // com.learnium.RNDeviceInfo.netInfo.NetStateChangeObserver
    public native void onNetDisconnected();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onSuccess(String str);
}
