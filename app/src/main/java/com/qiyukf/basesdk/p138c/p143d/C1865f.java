package com.qiyukf.basesdk.p138c.p143d;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.qiyukf.basesdk.p138c.C1805a;

/* renamed from: com.qiyukf.basesdk.c.d.f */
public final class C1865f {

    /* renamed from: a */
    public static Handler f3435a;

    /* renamed from: b */
    public static Context f3436b;

    /* renamed from: c */
    public static Toast f3437c;

    /* renamed from: a */
    public static void m3555a(final int i) {
        m3561c().post(new Runnable() {
            /* class com.qiyukf.basesdk.p138c.p143d.C1865f.RunnableC18661 */

            public final void run() {
                if (C1865f.f3437c != null) {
                    C1865f.f3437c.setText(i);
                    C1865f.f3437c.setDuration(0);
                } else {
                    Toast unused = C1865f.f3437c = Toast.makeText(C1865f.f3436b, i, 0);
                }
                C1865f.f3437c.show();
            }
        });
    }

    /* renamed from: a */
    public static void m3556a(Context context) {
        f3436b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m3557a(final String str) {
        m3561c().post(new Runnable() {
            /* class com.qiyukf.basesdk.p138c.p143d.C1865f.RunnableC18672 */

            public final void run() {
                if (C1865f.f3437c != null) {
                    C1865f.f3437c.setText(str);
                    C1865f.f3437c.setDuration(0);
                } else {
                    Toast unused = C1865f.f3437c = Toast.makeText(C1865f.f3436b, str, 0);
                }
                C1865f.f3437c.show();
            }
        });
    }

    /* renamed from: b */
    public static void m3559b(final int i) {
        m3561c().post(new Runnable() {
            /* class com.qiyukf.basesdk.p138c.p143d.C1865f.RunnableC18683 */

            public final void run() {
                if (C1865f.f3437c != null) {
                    C1865f.f3437c.setText(i);
                    C1865f.f3437c.setDuration(1);
                } else {
                    Toast unused = C1865f.f3437c = Toast.makeText(C1865f.f3436b, i, 1);
                }
                C1865f.f3437c.show();
            }
        });
    }

    /* renamed from: b */
    public static void m3560b(final String str) {
        m3561c().post(new Runnable() {
            /* class com.qiyukf.basesdk.p138c.p143d.C1865f.RunnableC18694 */

            public final void run() {
                if (C1865f.f3437c != null) {
                    C1865f.f3437c.setText(str);
                    C1865f.f3437c.setDuration(1);
                } else {
                    Toast unused = C1865f.f3437c = Toast.makeText(C1865f.f3436b, str, 1);
                }
                C1865f.f3437c.show();
            }
        });
    }

    /* renamed from: c */
    public static Handler m3561c() {
        if (f3435a == null) {
            f3435a = C1805a.m3404b();
        }
        return f3435a;
    }
}
