package com.p118pd.sdk;

import android.os.Handler;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import com.p118pd.sdk.AbstractC7332o0O0o0Oo;
import com.p118pd.sdk.C7316o0O0OoO;

/* renamed from: com.pd.sdk.oooOO0  reason: case insensitive filesystem */
public class BinderC9150oooOO0 extends AbstractC7332o0O0o0Oo.OooO00o {
    public static final String OooO0O0 = "anet.ParcelableNetworkListenerWrapper";
    public byte OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f22625OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7321o0O0Ooo0 f22626OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f22627OooO00o;

    public BinderC9150oooOO0(AbstractC7321o0O0Ooo0 o0o0ooo0, Handler handler, Object obj) {
        this.f22626OooO00o = o0o0ooo0;
        if (o0o0ooo0 != null) {
            if (C7316o0O0OoO.OooO00o.class.isAssignableFrom(o0o0ooo0.getClass())) {
                this.OooO00o = (byte) (this.OooO00o | 1);
            }
            if (C7316o0O0OoO.OooO0OO.class.isAssignableFrom(o0o0ooo0.getClass())) {
                this.OooO00o = (byte) (this.OooO00o | 2);
            }
            if (C7316o0O0OoO.AbstractC7317OooO0Oo.class.isAssignableFrom(o0o0ooo0.getClass())) {
                this.OooO00o = (byte) (this.OooO00o | 4);
            }
            if (C7316o0O0OoO.OooO0O0.class.isAssignableFrom(o0o0ooo0.getClass())) {
                this.OooO00o = (byte) (this.OooO00o | 8);
            }
        }
        this.f22625OooO00o = handler;
        this.f22627OooO00o = obj;
    }

    /* access modifiers changed from: private */
    public void OooO0O0(byte b, Object obj) {
        if (b == 4) {
            try {
                ParcelableHeader parcelableHeader = (ParcelableHeader) obj;
                ((C7316o0O0OoO.AbstractC7317OooO0Oo) this.f22626OooO00o).OooO00o(parcelableHeader.OooO00o(), parcelableHeader.m14971OooO00o(), this.f22627OooO00o);
                if (ALog.isPrintLog(1)) {
                    ALog.m287d(OooO0O0, "[onResponseCode]" + parcelableHeader, null, new Object[0]);
                }
            } catch (Exception unused) {
                ALog.m289e(OooO0O0, "dispatchCallback error", null, new Object[0]);
            }
        } else if (b == 2) {
            DefaultProgressEvent defaultProgressEvent = (DefaultProgressEvent) obj;
            if (defaultProgressEvent != null) {
                defaultProgressEvent.OooO00o(this.f22627OooO00o);
            }
            ((C7316o0O0OoO.OooO0OO) this.f22626OooO00o).OooO00o(defaultProgressEvent, this.f22627OooO00o);
            if (ALog.isPrintLog(1)) {
                ALog.m287d(OooO0O0, "[onDataReceived]" + defaultProgressEvent, null, new Object[0]);
            }
        } else if (b == 1) {
            DefaultFinishEvent defaultFinishEvent = (DefaultFinishEvent) obj;
            if (defaultFinishEvent != null) {
                defaultFinishEvent.OooO00o(this.f22627OooO00o);
            }
            ((C7316o0O0OoO.OooO00o) this.f22626OooO00o).OooO00o(defaultFinishEvent, this.f22627OooO00o);
            if (ALog.isPrintLog(1)) {
                ALog.m287d(OooO0O0, "[onFinished]" + defaultFinishEvent, null, new Object[0]);
            }
        } else if (b == 8) {
            ((C7316o0O0OoO.OooO0O0) this.f22626OooO00o).OooO00o((AbstractC7331o0O0o0OO) obj, this.f22627OooO00o);
            if (ALog.isPrintLog(1)) {
                ALog.m287d(OooO0O0, "[onInputStreamReceived]", null, new Object[0]);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7321o0O0Ooo0 m20892OooO00o() {
        return this.f22626OooO00o;
    }

    private void OooO00o(byte b, Object obj) {
        Handler handler = this.f22625OooO00o;
        if (handler == null) {
            OooO0O0(b, obj);
        } else {
            handler.post(new RunnableC7340o0O0oO0o(this, b, obj));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    public void OooO00o(DefaultProgressEvent defaultProgressEvent) throws RemoteException {
        if ((this.OooO00o & 2) != 0) {
            OooO00o((byte) 2, defaultProgressEvent);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    public void OooO00o(DefaultFinishEvent defaultFinishEvent) throws RemoteException {
        if ((this.OooO00o & 1) != 0) {
            OooO00o((byte) 1, defaultFinishEvent);
        }
        this.f22626OooO00o = null;
        this.f22627OooO00o = null;
        this.f22625OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    public boolean OooO00o(int i, ParcelableHeader parcelableHeader) throws RemoteException {
        if ((this.OooO00o & 4) == 0) {
            return false;
        }
        OooO00o((byte) 4, (Object) parcelableHeader);
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    public void OooO00o(AbstractC7331o0O0o0OO o0o0o0oo) throws RemoteException {
        if ((this.OooO00o & 8) != 0) {
            OooO00o((byte) 8, o0o0o0oo);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
    public byte OooO00o() throws RemoteException {
        return this.OooO00o;
    }
}
