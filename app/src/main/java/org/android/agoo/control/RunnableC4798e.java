package org.android.agoo.control;

/* renamed from: org.android.agoo.control.e */
public class RunnableC4798e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f13454a;

    /* renamed from: b */
    public final /* synthetic */ String f13455b;

    /* renamed from: c */
    public final /* synthetic */ AgooFactory f13456c;

    public RunnableC4798e(AgooFactory agooFactory, String str, String str2) {
        this.f13456c = agooFactory;
        this.f13454a = str;
        this.f13455b = str2;
    }

    public void run() {
        this.f13456c.updateMsgStatus(this.f13454a, this.f13455b);
    }
}
