package p011cn.ijiami.callm.p012j;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

/* renamed from: cn.ijiami.callm.j.CCustomWindowViewToast */
/* compiled from: Hl */
public class CCustomWindowViewToast {

    /* renamed from: a */
    private WindowManager f498a;

    /* renamed from: b */
    private double f499b;

    /* renamed from: c */
    private View f500c;

    /* renamed from: d */
    private WindowManager.LayoutParams f501d;

    private CCustomWindowViewToast(Context context, String str, double d) {
        this.f498a = (WindowManager) context.getSystemService("window");
        Toast makeText = Toast.makeText(context, str, 0);
        this.f500c = makeText.getView();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f501d = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        makeText.getView().getAnimation();
        layoutParams.windowAnimations = -1;
        WindowManager.LayoutParams layoutParams2 = this.f501d;
        layoutParams2.type = 2005;
        layoutParams2.setTitle("Toast");
        WindowManager.LayoutParams layoutParams3 = this.f501d;
        layoutParams3.flags = 152;
        layoutParams3.gravity = 81;
        layoutParams3.y = -30;
        this.f499b = d;
    }

    /* renamed from: e */
    public static CCustomWindowViewToast m340e(Context context, String str, double d) {
        return new CCustomWindowViewToast(context, str, d);
    }

    /* renamed from: f */
    public void mo3833f() {
        View view = this.f500c;
        if (view != null) {
            try {
                this.f498a.addView(view, this.f501d);
            } catch (Exception unused) {
                this.f498a.removeView(this.f500c);
                this.f498a.addView(this.f500c, this.f501d);
            }
            new Handler().postDelayed(new Runnable() {
                /* class p011cn.ijiami.callm.p012j.CCustomWindowViewToast.RunnableC02311 */

                public void run() {
                    if (CCustomWindowViewToast.this.f500c != null) {
                        CCustomWindowViewToast.this.f498a.removeView(CCustomWindowViewToast.this.f500c);
                        CCustomWindowViewToast.this.f500c = null;
                        CCustomWindowViewToast.this.f498a = null;
                    }
                }
            }, (long) this.f499b);
        }
    }
}
