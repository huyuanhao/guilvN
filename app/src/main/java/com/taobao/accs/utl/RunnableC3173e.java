package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* renamed from: com.taobao.accs.utl.e */
public final class RunnableC3173e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7202a;

    /* renamed from: b */
    public final /* synthetic */ String f7203b;

    /* renamed from: c */
    public final /* synthetic */ String f7204c;

    /* renamed from: d */
    public final /* synthetic */ int f7205d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f7206e;

    /* renamed from: f */
    public final /* synthetic */ Intent f7207f;

    public RunnableC3173e(AccsDataListener accsDataListener, String str, String str2, int i, byte[] bArr, Intent intent) {
        this.f7202a = accsDataListener;
        this.f7203b = str;
        this.f7204c = str2;
        this.f7205d = i;
        this.f7206e = bArr;
        this.f7207f = intent;
    }

    public void run() {
        this.f7202a.onResponse(this.f7203b, this.f7204c, this.f7205d, this.f7206e, C3169a.m7657b(this.f7207f));
    }
}
