package com.p118pd.sdk;

import android.os.Build;
import android.os.RemoteException;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import com.p118pd.sdk.AbstractC7326o0O0o00;
import com.p118pd.sdk.C7316o0O0OoO;
import com.p118pd.sdk.C7319o0O0OoOo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0oOo0O0  reason: case insensitive filesystem */
public class BinderC7636o0oOo0O0 extends AbstractC7326o0O0o00.OooO00o implements C7316o0O0OoO.OooO00o, C7316o0O0OoO.OooO0O0, C7316o0O0OoO.AbstractC7317OooO0Oo {
    public StatisticData OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7330o0O0o0O f20505OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BinderC7351o0O0oo0O f20506OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7503o0OoOoO f20507OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, List<String>> f20508OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CountDownLatch f20509OooO00o = new CountDownLatch(1);
    public String OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CountDownLatch f20510OooO0O0 = new CountDownLatch(1);
    public int OooO0oO;

    public BinderC7636o0oOo0O0(int i) {
        this.OooO0oO = i;
        this.OooO0O0 = ErrorConstant.getErrMsg(i);
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19275OooO00o() throws RemoteException {
        OooO00o(this.f20509OooO00o);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00
    public void cancel() throws RemoteException {
        AbstractC7330o0O0o0O o0o0o0o = this.f20505OooO00o;
        if (o0o0o0o != null) {
            o0o0o0o.cancel(true);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public StatisticData m19273OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7331o0O0o0OO m19274OooO00o() throws RemoteException {
        OooO00o(this.f20510OooO0O0);
        return this.f20506OooO00o;
    }

    public BinderC7636o0oOo0O0(C7503o0OoOoO o0ooooo) {
        this.f20507OooO00o = o0ooooo;
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
    public int OooO00o() throws RemoteException {
        OooO00o(this.f20509OooO00o);
        return this.OooO0oO;
    }

    @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, List<String>> m19276OooO00o() throws RemoteException {
        OooO00o(this.f20509OooO00o);
        return this.f20508OooO00o;
    }

    public void OooO00o(AbstractC7330o0O0o0O o0o0o0o) {
        this.f20505OooO00o = o0o0o0o;
    }

    @Override // com.p118pd.sdk.C7316o0O0OoO.OooO00o
    public void OooO00o(C7319o0O0OoOo.OooO00o oooO00o, Object obj) {
        this.OooO0oO = oooO00o.OooO00o();
        this.OooO0O0 = oooO00o.m18822OooO00o() != null ? oooO00o.m18822OooO00o() : ErrorConstant.getErrMsg(this.OooO0oO);
        this.OooO00o = oooO00o.m18821OooO00o();
        BinderC7351o0O0oo0O o0o0oo0o = this.f20506OooO00o;
        if (o0o0oo0o != null) {
            o0o0oo0o.OooO00o();
        }
        this.f20510OooO0O0.countDown();
        this.f20509OooO00o.countDown();
    }

    private void OooO00o(CountDownLatch countDownLatch) throws RemoteException {
        try {
            if (!countDownLatch.await((long) (this.f20507OooO00o.OooO00o() + 1000), TimeUnit.MILLISECONDS)) {
                if (this.f20505OooO00o != null) {
                    this.f20505OooO00o.cancel(true);
                }
                throw OooO00o("wait time out");
            }
        } catch (InterruptedException unused) {
            throw OooO00o("thread interrupt");
        }
    }

    private RemoteException OooO00o(String str) {
        if (Build.VERSION.SDK_INT >= 15) {
            return new RemoteException(str);
        }
        return new RemoteException();
    }

    @Override // com.p118pd.sdk.C7316o0O0OoO.AbstractC7317OooO0Oo
    public boolean OooO00o(int i, Map<String, List<String>> map, Object obj) {
        this.OooO0oO = i;
        this.OooO0O0 = ErrorConstant.getErrMsg(i);
        this.f20508OooO00o = map;
        this.f20509OooO00o.countDown();
        return false;
    }

    @Override // com.p118pd.sdk.C7316o0O0OoO.OooO0O0
    public void OooO00o(AbstractC7331o0O0o0OO o0o0o0oo, Object obj) {
        this.f20506OooO00o = (BinderC7351o0O0oo0O) o0o0o0oo;
        this.f20510OooO0O0.countDown();
    }
}
