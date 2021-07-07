package p011cn.ijiami.callm.p012j;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/* renamed from: cn.ijiami.callm.j.EWindowAddViewToast */
/* compiled from: Hl */
public class EWindowAddViewToast {

    /* renamed from: a */
    private Context f505a;

    /* renamed from: b */
    private WindowManager f506b;

    /* renamed from: c */
    private int f507c;

    /* renamed from: d */
    private View f508d;

    public EWindowAddViewToast(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f505a = applicationContext;
        this.f506b = (WindowManager) applicationContext.getSystemService("window");
    }

    /* renamed from: e */
    public static int m349e(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: f */
    public static EWindowAddViewToast m350f(Context context, CharSequence charSequence, int i) {
        return m351g(context, charSequence, i, 15.0f);
    }

    /* renamed from: g */
    public static EWindowAddViewToast m351g(Context context, CharSequence charSequence, int i, float f) {
        EWindowAddViewToast eWindowAddViewToast = new EWindowAddViewToast(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setBackgroundColor(Color.parseColor("#4a5356"));
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(m349e(context, 15.0f), m349e(context, 10.0f), m349e(context, 15.0f), m349e(context, 10.0f));
        textView.setLayoutParams(layoutParams);
        textView.setText(charSequence);
        textView.setId(16908308);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(f);
        linearLayout.addView(textView);
        eWindowAddViewToast.f508d = linearLayout;
        eWindowAddViewToast.f507c = i;
        return eWindowAddViewToast;
    }

    /* renamed from: h */
    public void mo3837h() {
        if (this.f508d != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.gravity = 81;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.flags = 152;
            layoutParams.format = -3;
            layoutParams.y = m349e(this.f505a, 64.0f);
            layoutParams.type = 2005;
            try {
                this.f506b.addView(this.f508d, layoutParams);
                new Handler().postDelayed(new Runnable() {
                    /* class p011cn.ijiami.callm.p012j.EWindowAddViewToast.RunnableC02321 */

                    public void run() {
                        try {
                            if (EWindowAddViewToast.this.f508d != null) {
                                EWindowAddViewToast.this.f506b.removeView(EWindowAddViewToast.this.f508d);
                                EWindowAddViewToast.this.f508d = null;
                                EWindowAddViewToast.this.f506b = null;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }, (long) this.f507c);
            } catch (Exception unused) {
                Toast.makeText(this.f505a, ((TextView) this.f508d.findViewById(16908308)).getText(), 0).show();
            }
        }
    }
}
