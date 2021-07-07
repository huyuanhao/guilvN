package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

/* renamed from: org.android.agoo.control.b */
public class RunnableC4795b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f13446a;

    /* renamed from: b */
    public final /* synthetic */ String f13447b;

    /* renamed from: c */
    public final /* synthetic */ TaoBaseService.ExtraInfo f13448c;

    /* renamed from: d */
    public final /* synthetic */ AgooFactory f13449d;

    public RunnableC4795b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f13449d = agooFactory;
        this.f13446a = bArr;
        this.f13447b = str;
        this.f13448c = extraInfo;
    }

    public void run() {
        this.f13449d.msgReceiverPreHandler(this.f13446a, this.f13447b, this.f13448c, true);
    }
}
