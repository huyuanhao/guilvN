package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* renamed from: com.taobao.accs.utl.d */
public final class RunnableC3172d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7196a;

    /* renamed from: b */
    public final /* synthetic */ String f7197b;

    /* renamed from: c */
    public final /* synthetic */ String f7198c;

    /* renamed from: d */
    public final /* synthetic */ String f7199d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f7200e;

    /* renamed from: f */
    public final /* synthetic */ TaoBaseService.ExtraInfo f7201f;

    public RunnableC3172d(AccsDataListener accsDataListener, String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        this.f7196a = accsDataListener;
        this.f7197b = str;
        this.f7198c = str2;
        this.f7199d = str3;
        this.f7200e = bArr;
        this.f7201f = extraInfo;
    }

    public void run() {
        this.f7196a.onData(this.f7197b, this.f7198c, this.f7199d, this.f7200e, this.f7201f);
    }
}
