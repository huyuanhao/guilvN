package p011cn.ijiami.callm.p012j;

import android.content.Context;
import android.widget.Toast;

/* renamed from: cn.ijiami.callm.j.BToast */
/* compiled from: Hl */
public class BToast {

    /* renamed from: b */
    private static BToast f496b;

    /* renamed from: a */
    private CCustomWindowViewToast f497a = null;

    public BToast() {
        f496b = this;
    }

    /* renamed from: a */
    public static BToast m334a() {
        if (f496b == null) {
            new BToast();
        }
        return f496b;
    }

    /* renamed from: b */
    public void mo3832b(Context context, String str, double d) {
        if (context != null) {
            try {
                CCustomWindowViewToast e = CCustomWindowViewToast.m340e(context, str, d);
                this.f497a = e;
                e.mo3833f();
            } catch (Throwable unused) {
                Toast.makeText(context, str, 0).show();
            }
        }
    }
}
