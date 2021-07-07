package p011cn.ijiami.callm.p012j;

import android.content.Context;

/* renamed from: cn.ijiami.callm.j.DToast */
/* compiled from: Hl */
public class DToast {

    /* renamed from: b */
    private static DToast f503b;

    /* renamed from: a */
    private EWindowAddViewToast f504a = null;

    public DToast() {
        f503b = this;
    }

    /* renamed from: a */
    public static DToast m342a() {
        if (f503b == null) {
            new DToast();
        }
        return f503b;
    }

    /* renamed from: b */
    public void mo3835b(Context context, String str, int i) {
        if (context != null) {
            EWindowAddViewToast f = EWindowAddViewToast.m350f(context, str, i);
            this.f504a = f;
            f.mo3837h();
        }
    }

    /* renamed from: c */
    public void mo3836c(Context context, String str, int i, float f) {
        if (context != null) {
            EWindowAddViewToast g = EWindowAddViewToast.m351g(context, str, i, f);
            this.f504a = g;
            g.mo3837h();
        }
    }
}
